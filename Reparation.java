package exo1;
import java.util.Date;
import java.util.Vector;
public class Reparation {
	private Date dateRep;
	private int nbHeure;
    private String travaux;
    private Vector<Piece> listePieceRep=new Vector <Piece>();
    
    public Reparation(Date dateRep,int nbHeure,String travaux,Vector<Piece> listePieceRep) {
    	this.dateRep=dateRep;
    	this.nbHeure=nbHeure;
    	this.travaux=travaux;
    	this.listePieceRep=listePieceRep;
    }
    public Reparation() {
    	this(new Date(0/0/0),0,"",new Vector<Piece>());
    }
    
    
    public void SetDateRep(Date dateRep) {
		this.dateRep=dateRep;
	}
	public Date getDateRep() {
		return dateRep;
	}
	
	
	public void SetNbHeure(int nbHeure) {
		this.nbHeure=nbHeure;
	}
	public int getNbHeure() {
		return nbHeure;
	}
	
	
	public void SetTravaux(String travaux) {
		this.travaux=travaux;
	}
	public String getTravaux() {
		return travaux;
	}
	

    
    public double calculerPrixRep(Equipement e) {
    	double coutRep=0.0;
    	switch(e) {
    	case Ordinateur:
    		coutRep=+1000000;
    		break;
    	case Imprimante:
    		coutRep=+900000;
    		break;
    	case Tablette:
    		coutRep=+850000;
    		break;
    	case Smartphone:
    		coutRep=+600000;
    		break;
    	}
    	return coutRep;
    }
    
    
    public void ajouterPiece(int ref,String nom,int quantite ,double prix) {
    	this.listePieceRep.add(new Piece(ref,nom,quantite,prix));
    	
    }
    public void ajouterPièce(Piece p) {
    	listePieceRep.add(p);
    }
    public void modifierPièce(int ref,String nom,int quantite,double prix) {
    	for(Piece p:listePieceRep) {
    		if(p.getRef()==ref) {
    			p.SetNom(nom);
    	    	p.SetQuant(quantite);
    	    	p.SetPrix(prix);
    	    	return;
    		}
    	}
    }
    public void modifierPièce(Piece p){
    	int i=0;
    	for(Piece piece:listePieceRep) {
    		if(p.getRef()==piece.getRef()) {
    			listePieceRep.set(i, p);
    			return;
    		}
    		i++;
    	}
    }
    
    public void supprimerPièce(int ref) {
    	int i=0;
    	for(Piece p:listePieceRep) {
    		if(p.getRef()==ref) {
    			listePieceRep.remove(i);
    			return;
    		}
    		i++;
    	}
    }
    
    public void afficherListePièces() {
    	for(Piece p:listePieceRep) {
    			System.out.println("Le nom de la piece:"+ p.getNom());
    			System.out.println("La quantite de la piece:"+ p.getQuant());
    			System.out.println("Le prix de la piece:"+ p.getPrix());
    		
    		System.out.println("••••••••••••••••••••••••••••••••••••••••••••••••••••••");
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package exo1;
import java.util.Date;
import java.util.Vector;
import java.util.Iterator;

public class Planning {
	private int numP;
	private Vector<Maintenance> listeMaintenance=new Vector<Maintenance>();
	private Iterator<Maintenance> itm;
	


	public class Maintenance{
		private Date dateMaint;
		private int nbHeure;
		private String travaux;
		private Vector<Piece> listePieceMaint=new Vector <Piece>();
		private Iterator<Piece> itm;
		
		public Maintenance(Date dateMaint,int nbHeure,String travaux) {
			this.dateMaint=dateMaint;
			this.nbHeure=nbHeure;
			this.travaux=travaux;
		}
		public Maintenance() {
			this(new Date(0/0/0),0,"");
		}
		
		public void SetDateMaint(Date dateMaint) {
			this.dateMaint=dateMaint;
		}
		public Date getDateMaint() {
			return dateMaint;
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
		
		
		public void ajouterPièce(int ref,String nom,int quantite,double prix) {
			this.listePieceMaint.add(new Piece(ref,"nom",quantite,prix));
		}
		
		public void ajouterPièce(Piece p) {
			listePieceMaint.add(p);
		}
		public void modifierPièce(int ref ,String nom,int quantite,double prix) {
			itm=listePieceMaint.iterator();
			while(itm.hasNext()) {
				Piece p=itm.next();
				if(p.getRef()== ref) {
					listePieceMaint.remove(p);
					listePieceMaint.add(new Piece(ref,"nom",quantite,prix));
					return;
				}
			}
		}
		public void supprimerPièce(int ref) {
			itm=listePieceMaint.iterator();
			while(itm.hasNext()) {
				Piece p=itm.next();
				if(p.getRef()== ref) {
					listePieceMaint.remove(p);
					return;
				}
			}
		}
		public void afficherListePièces() {
			itm=listePieceMaint.iterator();
			while(itm.hasNext()) {
				Piece p=itm.next();
				System.out.println("La reference de cette piece est: "+p.getRef());
				System.out.println("Nom: "+p.getNom());
				System.out.println("La quantite: "+p.getQuant());
				System.out.println("Prix: "+p.getPrix());
				}
			}
		}
	
     ////////////////////////////////////////////////////////////
		public Planning(int numP,Vector<Maintenance> listeMaintenance) {
			this.numP=numP;
			this.listeMaintenance=listeMaintenance;
		}
		public Planning() {
			this(0,new Vector<Maintenance>());
		}
		public void SetNumP(int numP) {
			this.numP=numP;
		}
		public int getNumP() {
			return numP;
		}
		public void SetListeMaintenance(Vector<Maintenance> listeMaintenance) {
			this.listeMaintenance=listeMaintenance;
		}
		public Vector<Maintenance> getListeMaintenance(){
			return listeMaintenance;
		}
		
		
		public void ajouterMaint(Date dateMaint, int nbHeure,String travaux) {
			this.listeMaintenance.add(new Maintenance(dateMaint,nbHeure,travaux));
		}
		public void modifierMaint (Date dateMaint, int numP,String travaux) {
			itm=listeMaintenance.iterator();
			while(itm.hasNext()) {
				Maintenance m=itm.next();
				if(m.dateMaint == dateMaint) {
					listeMaintenance.remove(m);
					listeMaintenance.add(new Maintenance(dateMaint,numP,"travaux") );
				}
			}
		}
		public void supprimerMaint(Date dateMaint) {
			itm=listeMaintenance.iterator();
			while(itm.hasNext()) {
				Maintenance m=itm.next();
				if(m.getDateMaint().equals(dateMaint)) {
				   itm.remove();
					return;
				}
			}
		}
		public void afficherListeMaint() {
			itm=listeMaintenance.iterator();
			while(itm.hasNext()) {
				Maintenance m=itm.next();
				System.out.println("La date de maintenance: "+m.dateMaint);
				System.out.println("Nombre d'heure: "+m.nbHeure);
				System.out.println("Travaux: "+m.travaux);
				System.out.println();

				}
			}
		
		
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	}


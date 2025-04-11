package exo1;

public class Piece {
	private int ref;
	private String nom;
	private  int quantite;
	private static int quantiteStock;
	private double prix;
	
	public Piece(int ref,String nom,int quantite,double prix) {
		this.ref=ref;
		this.quantite=quantite;
		this.nom=nom;
		this.prix=prix;
	}
    public Piece() {
    	this(0,"",0,0.0);
    }
	public void SetRef(int ref) {
		this.ref=ref;
	}
	public int getRef() {
		return ref;
	}
	public void SetNom(String nom) {
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
	public void SetQuant(int quantite) {
		this.quantite=quantite;
	}
	public int getQuant() {
		return quantite;
	}
	
	public int getQuantStock() {
		return quantiteStock;
	}
	public void SetPrix(double prix) {
		this.prix=prix;
	}
	public double getPrix() {
		return prix;
	}
	
	public boolean isDispo(String nom) {
		return this.nom.equals(nom) && quantite>0;
	}
	public void entrerStock(int quantite){
		quantiteStock=quantite+this.quantite;
	}
	public double calculerMontantPiece() {
		return prix*quantite;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package exo1;
import java.util.Vector;
import exo1.Planning.Maintenance;
import java.util.Date;
public class Application_TP4 {
    
	
	
	public static void main(String[] args) {
		
		Piece p1= new Piece(12345,"Imprimante",55,2000000) ;
		Piece p2= new Piece(5678,"Tablette",18,2500000) ;
		Piece p3= new Piece(99876,"Smartphone",78,5000000) ;
		
		
		Vector<Piece> listeRep1 =new Vector<Piece>();
		listeRep1.add(p2);
		
		
		Reparation rep1=new Reparation(new Date(10/4/2024),5,"probleme de l'ecran",listeRep1);
		rep1.ajouterPièce(p3);
		rep1.ajouterPiece(18845,"Ordinateur",55,2000000);
	
		
		
		Vector<Piece> listeRep2 =new Vector<Piece>();
		Reparation rep2=new Reparation(new Date(07/3/2024),2,"probleme de l'encre",listeRep2);
		rep2.ajouterPièce(p1);
		
		System.out.println("On a va teste la suppression d'un element");
		System.out.println();
		System.out.println("La liste avant la suppression:");
		rep1.afficherListePièces();
		System.out.println();
		rep1.supprimerPièce(99876);
		System.out.println("La liste après la suppression:");
		rep1.afficherListePièces();
		
		
		System.out.println("Pour confermer que la piece est supprimé");
		if(p3.isDispo("Smartphone")) {
			System.out.println("L'opertion était correct!!");
		}
		else {
			System.out.println("Il y a une erreur:(");
		}
		System.out.println();
		System.out.println();
		//test de l'ajout a le stock
		System.out.println("Ajouter 30 Smartphone a le stock");
		p3.entrerStock(30);
		System.out.println("Quantite de stock est: "+p3.getQuantStock());
		System.out.println();
		System.out.println();
		System.out.println("Le Montant total de la piece imprimante: "+p1.calculerMontantPiece());
		
		
		System.out.println("••••••••••••••••••••••••••••••••••••••••••••••••••••••");	
		
	
		Vector<Maintenance> listeMaint=new Vector<Maintenance>();
		
		
		Planning pla1=new Planning(1,listeMaint);
		
		@SuppressWarnings("deprecation")
		Planning.Maintenance Maint1=pla1.new Maintenance(new Date(124,2,8),1,"Protection de l'ecran");
		@SuppressWarnings("deprecation")
		Planning.Maintenance Maint2=pla1.new Maintenance(new Date(124,2,10),3,"Suppression des fichies malveillants");
		listeMaint.add(Maint1);
		listeMaint.add(Maint2);
		
		pla1.ajouterMaint(new Date(124,6,7), 2, "Mis a jour avec les derniers correctifs de sécurité"); 
		
		System.out.println("*******La liste avant la suppression*******");
		pla1.afficherListeMaint();
		System.out.println();
		pla1.supprimerMaint(new Date(124,2,10));
		System.out.println("*******La liste après la suppression*******");
		pla1.afficherListeMaint();
		
		
		
		
		
		
		

	}

}

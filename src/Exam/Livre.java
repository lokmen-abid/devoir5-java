package Exam;

public class Livre extends Documents{
	
	private String nom_Auteur ; 
	private int nb_pages ;

	public Livre(String num_Enregistrement, String titre, int nb_copies , String nom_Auteur , int nb_pages ) {
		super(num_Enregistrement, titre, nb_copies);
		this.nom_Auteur = nom_Auteur ; 
		this.nb_pages = nb_pages ; 
	}

	public String getNom_Auteur() {
		return nom_Auteur;
	}

	public void setNom_Auteur(String nom_Auteur) {
		this.nom_Auteur = nom_Auteur;
	}

	public int getNb_pages() {
		return nb_pages;
	}

	public void setNb_pages(int nb_pages) {
		this.nb_pages = nb_pages;
	}

	public String toString() {
		return (super.toString()+"Livre [nom_Auteur=" + nom_Auteur + ", nb_pages=" + nb_pages + "]");
	} 
	
	

}

package Exam;

import java.util.Arrays;

public class Roman extends Livre{
	
	private String[] prix ; 

	public Roman(String num_Enregistrement, String titre, int nb_copies, String nom_Auteur, int nb_pages,String[] prix) {
		super(num_Enregistrement, titre, nb_copies, nom_Auteur, nb_pages);
		this.prix = prix ; 
	}

	public String[] getPrix() {
		return prix;
	}

	public void setPrix(String[] prix) {
		this.prix = prix;
	}

	
	public String toString() {
		return (super.toString()+"Roman [prix=" + Arrays.toString(prix) + "]");
	} 
	

}

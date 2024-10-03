package Exam;

public class Documents {
	
	private String num_Enregistrement ; 
	private String titre ; 
	private int nb_copies ;
	
	public Documents(String num_Enregistrement, String titre, int nb_copies) {
		this.num_Enregistrement = num_Enregistrement;
		this.titre = titre;
		this.nb_copies = nb_copies;
	}

	public String getNum_Enregistrement() {
		return num_Enregistrement;
	}

	public void setNum_Enregistrement(String num_Enregistrement) {
		this.num_Enregistrement = num_Enregistrement;
	}
	
	public boolean verif (String ch) {	
		if (ch.length() != 9 ) {
    	    System.out.println("Le numéro d'Enregistrement doit contenir 9 chiffres.");
    	    return false;
    	}
    	return true;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNb_copies() {
		return nb_copies;
	}

	public void setNb_copies(int nb_copies) {
		this.nb_copies = nb_copies;
	}


	public String toString() {
		return "Documents [num_Enregistrement=" + 
							num_Enregistrement + ", titre=" 
							+ titre + ", nb_copies=" 
							+ nb_copies
				+ "]";
	} 
	
	

}

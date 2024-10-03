package Exam;

public class Revue extends Documents{
	
	private int mois ; 
	private int annee ; 

	public Revue(String num_Enregistrement, String titre, int nb_copies , int mois , int annee) {
		super(num_Enregistrement, titre, nb_copies);
		this.mois=mois ; 
		this.annee=annee; 
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}


	public String toString() {
		return (super.toString()+"Revue [mois=" + mois + ", annee=" + annee + "]");
	}
	
	

}

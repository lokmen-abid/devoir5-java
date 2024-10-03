package Exam;

public class Dictionnaire extends Documents{
	
    private final String[] langueDemander = {"Français", "Anglais", "Espagnol", "Latin", "Allemand"};
    private String langue ; 

	public Dictionnaire(String num_Enregistrement, String titre, int nb_copies , String langue) {
		super(num_Enregistrement, titre, nb_copies);
		this.langue = langue; 
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langueSaisie) {
		boolean langueValide = false;
        for (String languedemander: langueDemander) {
            if (languedemander.equals(langueSaisie)) {
                langueValide = true;
                break;
            }
        }
        if (!langueValide) {
            System.out.println("La langue spécifié n'est pas valide.");
        }
			this.langue = langueSaisie;
	}

	public String toString() {
		return (super.toString()+"Dictionnaire [langue=" + langue + "]");
	}
	
	
	
	
	

}

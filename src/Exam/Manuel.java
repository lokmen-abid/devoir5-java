package Exam;

public class Manuel extends Livre{
	
	private String domaine ; 
    private final String[] domainesDemander = {"Biologie", "Nutrition", "Ergonomie", "Médecine", "Chiropratique"};

	
	public Manuel(String num_Enregistrement, String titre, int nb_copies, String nom_Auteur, int nb_pages,String domaine) {
		super(num_Enregistrement, titre, nb_copies, nom_Auteur, nb_pages);
		this.domaine=domaine ; 
	}


	public String getDomaine() {
		return domaine;
	}


	public void setDomaine(String domaineSaisie) {
		 boolean domaineValide = false;
	        for (String domainedemander: domainesDemander) {
	            if (domainedemander.equals(domaineSaisie)) {
	                domaineValide = true;
	                break;
	            }
	        }
	        if (!domaineValide) {
	            System.out.println("Le domaine spécifié n'est pas valide.");
	        }
		
		this.domaine = domaineSaisie;
	}


	public String toString() {
		return (super.toString()+"Manuel [domaine=" + domaine + "]");
	} 
	
	

}


package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipale {
	
	static Scanner input = new Scanner(System.in);
	static ArrayList<Documents> listeDocuments = new ArrayList<>();
	static ArrayList<Roman> listeRoman = new ArrayList<>();
	static ArrayList<Manuel> listeManuel = new ArrayList<>();
	static ArrayList<Livre> listeLivres = new ArrayList<>();
	static ArrayList<Dictionnaire> listeDictionnaire = new ArrayList<>();
	static ArrayList<Revue> listeRevue = new ArrayList<>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void ajoutRoman() {
		System.out.print("Saisir le numero d'enregistrement : ");
		String num = input.nextLine();
		System.out.print("Saisir le Titre : ");
		String titre = input.nextLine();
		System.out.print("Saisir le nombre de copie : ");
		int nbrC = input.nextInt();
		System.out.print("Saisir le nom d'auteur : ");
		String nomAuteur = input.nextLine();
		System.out.print("Saisir le nombre de pages : ");
		int nbrP = input.nextInt();
		System.out.print("Saisir le nom de prix : ");
		String nomPrix = input.nextLine();
	}

	public static void ajoutManuel() {
		System.out.print("Saisir le numero d'enregistrement : ");
		String num = input.nextLine();
		System.out.print("Saisir le Titre : ");
		String titre = input.nextLine();
		System.out.print("Saisir le nombre de copie : ");
		int nbrC = input.nextInt();
		System.out.print("Saisir le nom d'auteur : ");
		String nomAuteur = input.nextLine();
		System.out.print("Saisir le nombre de pages : ");
		int nbrP = input.nextInt();
		System.out.print(
				"Saisir le Domaine: Biologie, Nutrition, Ergonomie, Médecine, Chiropratique ");
		//int domaine = listeManuel;
		
		//listeDocuments.add(new Manuel(num, titre, nbrC, nomAuteur, nbrP, domaine));
	}

	public static void ajoutRevue() {
		System.out.print("Saisir le numero d'enregistrement : ");
		String num = input.nextLine();
		System.out.print("Saisir le Titre : ");
		String titre = input.nextLine();
		System.out.print("Saisir le nombre de copie : ");
		int nbrC = input.nextInt();
		System.out.print("Saisir le mois de publication : ");
		String mois = input.nextLine();
		System.out.print("Saisir lannee de publication : ");
		String annee = input.nextLine();
	}
	
	

}

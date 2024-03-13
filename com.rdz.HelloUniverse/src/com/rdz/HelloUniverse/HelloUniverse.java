package com.rdz.HelloUniverse;

public class HelloUniverse {
	public static void main(String[] args) {

		String phraseIntroduction = "En %d, les planètes du système solaire était au nombre de : %d";
		String phraseErreur = "Le programme ne peut pas fournir de résultat pour l'année %d";
		int annee = 2006;
		int nbPlanete = 0;

		if (annee < 1600 || annee > 2020) {
			System.out.printf(phraseErreur, annee);
		} else {
			if (annee < 1700) {
				nbPlanete = 7;
			} else if (annee < 1800 || annee >= 2006) {
				nbPlanete = 8;
			} else if (annee < 2006) {
				nbPlanete = 9;
			} else {
				nbPlanete = 8;
			}

			System.out.printf(phraseIntroduction, annee, nbPlanete);
		}

	}

}

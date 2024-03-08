package com.rdz.HelloUniverse;

public class HelloUniverse {
	public static void main(String[] args) {

		String phraseIntroduction = "En %d, les planètes du système solaire était au nombre de : %d";
		short annee = 2006;
		int nbPlanete = 0;

		if (annee < 2006) {
			nbPlanete = 9;
		}

		if (annee >= 2006) {
			nbPlanete = 8;
		}

		System.out.printf(phraseIntroduction, annee, nbPlanete);

	}

}

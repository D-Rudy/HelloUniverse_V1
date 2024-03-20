package com.rdz.HelloUniverse;

public class Planete {
	String nom;
	String matiere; // (telluric or gaseous)
	long diametre;
	int totalVisiteur = 0;

	void revolution(int angle) {
		int tour = angle / 360;
		System.out.printf("%s a effectué %d tours complets autour de son étoile.", this.nom, tour);
	}

	void rotation(int angle) {
		int tour = angle / 360;
		System.out.printf("%s a effectué %d tours complets autour d'elle même.", this.nom, tour);
	}

	void accueillirVaisseau(int voyageur) {
		this.totalVisiteur += voyageur;

	}

	void accueillirVaisseau(String vaisseau) {
		if (vaisseau.equals("CHASSEUR")) {
			this.totalVisiteur += 3;
		}
		if (vaisseau.equals("FREGATE")) {
			this.totalVisiteur += 12;
		}
		if (vaisseau.equals("CROISEUR")) {
			this.totalVisiteur += 50;
		}
	}
}

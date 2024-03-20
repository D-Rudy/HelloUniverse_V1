package com.rdz.HelloUniverse;

public class HelloUniverse {
	public static void main(String[] args) {

		Planete mercure = new Planete();
		mercure.nom = "mercure";
		mercure.diametre = 4879L;
		mercure.matiere = "Tellurique";

		Planete venus = new Planete();
		venus.nom = "Venus";
		venus.diametre = 12104L;
		venus.matiere = "Tellurique";

		Planete terre = new Planete();
		terre.nom = "Terre";
		terre.diametre = 12742L;
		terre.matiere = "Tellurique";

		Planete mars = new Planete();
		mars.nom = "Mars";
		mars.diametre = 6779L;
		mars.matiere = "Tellurique";

		Planete jupiter = new Planete();
		jupiter.nom = "Jupiter";
		jupiter.diametre = 139822L;
		jupiter.matiere = "Gazeuse";

		Planete saturne = new Planete();
		saturne.nom = "Saturne";
		saturne.diametre = 116460L;
		saturne.matiere = "Gazeuse";

		Planete uranus = new Planete();
		uranus.nom = "Uranus";
		uranus.diametre = 50724L;
		uranus.matiere = "Gazeuse";

		Planete neptune = new Planete();
		neptune.nom = "Neptune";
		neptune.diametre = 49244L;
		neptune.matiere = "Gazeuse";

		Planete planet = new Planete();

		System.out.println(
				"Planète: " + jupiter.nom + "\ndiameter: " + jupiter.diametre + " km \nmaterial: " + jupiter.matiere);
		System.out.println(
				"Planète: " + planet.nom + "\ndiameter: " + planet.diametre + " km \nmaterial: " + planet.matiere);

		neptune.revolution(-3542);
		System.out.println();
		mars.rotation(-768);
		System.out.println();
		venus.rotation(1280);
		System.out.println();

		mars.accueillirVaisseau(8);
		mars.accueillirVaisseau("FREGATE");
		System.out.printf("Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d.", mars.nom,
				mars.totalVisiteur);
	}

}

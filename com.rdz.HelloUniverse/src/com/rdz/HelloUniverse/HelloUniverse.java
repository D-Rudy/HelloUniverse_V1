package com.rdz.HelloUniverse;

public class HelloUniverse {
	public static void main(String[] args) {

		int nbPlanete = 8;
		String texte = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
		System.out.println();
		System.out.println(texte + nbPlanete);
		texte =  "Il y a quelques années cependant, elles étaient au nombre de : ";
		nbPlanete ++;
		System.out.println(texte + nbPlanete);
	}

}

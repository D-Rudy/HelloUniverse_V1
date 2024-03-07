package com.rdz.HelloUniverse;

public class HelloUniverse {
	public static void main(String[] args) {

		int nbPlanete = 8;
		String texte1 = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
		String texte2 = "\n Il y a quelques années cependant, elles étaient au nombre de : ";
		System.out.println(texte1 + nbPlanete + texte2 + (++nbPlanete));
		
	}

}

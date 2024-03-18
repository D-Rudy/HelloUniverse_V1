package com.rdz.HelloUniverse;

public class Planet {
	String name;
	String material; // (telluric or gaseous)
	long diameter;

	void revolution() {
		System.out.printf("Je suis la planète %s et je tourne autour de mon étoile.", this.name);
	}

	void rotation() {
		System.out.printf("Je suis la planète %s et je tourne sur moi-même.", this.name);
	}
}

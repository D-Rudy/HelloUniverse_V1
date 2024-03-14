package com.rdz.HelloUniverse;

public class HelloUniverse {
	public static void main(String[] args) {
		Planet mercury = new Planet();
		mercury.name = "mercury";
		mercury.diameter = 4879L;
		mercury.material = "Telluric";

		Planet venus = new Planet();
		venus.name = "Venus";
		venus.diameter = 12104L;
		venus.material = "Telluric";

		Planet earth = new Planet();
		earth.name = "Earth";
		earth.diameter = 12742L;
		earth.material = "Telluric";

		Planet mars = new Planet();
		mars.name = "Mars";
		mars.diameter = 6779L;
		mars.material = "Telluric";

		Planet jupiter = new Planet();
		jupiter.name = "Jupiter";
		jupiter.diameter = 139822L;
		jupiter.material = "Gaseous";

		Planet saturn = new Planet();
		saturn.name = "Saturn";
		saturn.diameter = 116460L;
		saturn.material = "Gaseous";

		Planet uranus = new Planet();
		uranus.name = "Uranus";
		uranus.diameter = 50724L;
		uranus.material = "Gaseous";

		Planet neptune = new Planet();
		neptune.name = "Neptune";
		neptune.diameter = 49244L;
		neptune.material = "Gaseous";

		Planet planet = new Planet();

		System.out.println(
				"Planet: " + jupiter.name + "\ndiameter: " + jupiter.diameter + " km \nmaterial: " + jupiter.material);
		System.out.println(
				"Planet: " + planet.name + "\ndiameter: " + planet.diameter + " km \nmaterial: " + planet.material);

	}

}

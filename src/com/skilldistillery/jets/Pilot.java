package com.skilldistillery.jets;

public class Pilot {
	// FIELDS
	private String name;
	String names[] = { "Kylar Stern", "Durzo Blint", "Azoth", "Acaelus Thorne", "Doll Girl" };

	// CONSTRUCTORS
	public Pilot() {
	}

	public Pilot(String name) {
		this.name = name;
	}

	// Getter
	public String getName() {
		return name;
	}

	public String toString() {
		return name;
	}

	public void randomPilot() {
		boolean nameChanged = false;
		do {
			int randomNumber = (int) (Math.random() * names.length);
			if (names[randomNumber] != null) {
				this.name = names[randomNumber];
				names[randomNumber] = null;
				nameChanged = true;
			}
		} while (nameChanged == false);
	}

}

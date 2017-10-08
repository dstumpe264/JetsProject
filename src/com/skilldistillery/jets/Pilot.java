package com.skilldistillery.jets;

public class Pilot{
	//FIELDS
	private String name;
	String names[] = {"David","Dan","Ben","Blake","Adam"};
	
	//CONSTRUCTORS
	public Pilot() {
	}

	public Pilot(String name) {
		this.name = name;
	}

	//Getter
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}

	public void randomPilot() {
		int randomNumber = (int)(Math.random()*names.length);	
		this.name = names[randomNumber];
	}
	

}

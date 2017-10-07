package com.skilldistillery.jets;

import java.util.Scanner;

public class Jets{
	// Fields
	private Integer jetSpeed;
	private Integer jetRange;
	private String jetName;
	private Pilot pilot;
	Scanner sc = new Scanner(System.in);

	// User Story #1 There is a menu with 5 otions:
	// 1. List fleet
	// 2. View fastest jet
	// 3. View jet with longest range
	// 4. Add a jet to Fleet
	// 5. Quit

	// CONSTRUCTORS

	public Jets() {
		this(0,0,null,null);
	}

	public Jets(Integer jetSpeed, Integer jetRange, String jetName) {
		this(jetSpeed, jetRange, jetName, null);
		this.jetSpeed = jetSpeed;
		this.jetRange = jetRange;
		this.jetName = jetName;
	}

	public Jets(int jetSpeed, int jetRange, String jetName, Pilot pilot) {
		this.jetSpeed = jetSpeed;
		this.jetRange = jetRange;
		this.jetName = jetName;
		this.pilot = pilot;
	}

	// Getters

	public int getJetSpeed() {
		return jetSpeed;
	}

	public int getJetRange() {
		return jetRange;
	}

	public String getJetName() {
		return jetName;
	}

	public Pilot getPilot() {
		return pilot;
	}
	
	public String toString() {
		return (jetName + ": Top speed : " + jetSpeed + " MPH. Range: " + jetRange + " miles. Pilot: " + pilot + ".\n");
		
	}
	


	// User Story #2 List fleet prints out the model, speed, range, and
	// price of each jet. (There must be at least 5 jets stored when the program
	// starts).

	// User Story #3 The view fastest jet and longest range options both print out
	// all of the information about their jets.

	// User Story #4 Quit exits the program

	// User Story #5 A user can add custom jets to the fleet.

}

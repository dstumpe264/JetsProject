package com.skilldistillery.jets;

import java.util.Scanner;

public class Jets{
	// Fields
	private int jetSpeed;
	private int jetRange;
	private String jetModel;
	private Pilot pilot = new Pilot();
	private int price;
	Scanner sc = new Scanner(System.in);

	// User Story #1 There is a menu with 5 options:
	// 1. List fleet
	// 2. View fastest jet
	// 3. View jet with longest range
	// 4. Add a jet to Fleet
	// 5. Quit

	// CONSTRUCTORS

	public Jets() {
		pilot.randomPilot();
	}

	public Jets(int jetSpeed, int jetRange, String jetModel, int price) {
		this(jetSpeed, jetRange, jetModel, price, null);
		this.jetSpeed = jetSpeed;
		this.jetRange = jetRange;
		this.jetModel = jetModel;
		this.price = price;
		this.pilot.randomPilot();
	}

	public Jets(int jetSpeed, int jetRange, String jetModel, int price, Pilot pilot) {
		this.jetSpeed = jetSpeed;
		this.jetRange = jetRange;
		this.jetModel = jetModel;
		this.price = price;
		this.pilot.randomPilot();
	}

	// Getters

	public int getJetSpeed() {
		return jetSpeed;
	}

	public int getJetRange() {
		return jetRange;
	}

	public String getJetModel() {
		return jetModel;
	}

	public Pilot getPilot() {
		return pilot;
	}
	
	
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public String toString() {
		return (jetModel + ": Price: " + price + " USD. Top speed : " + jetSpeed + " MPH. Range: " + jetRange + " miles. Pilot: " + pilot + ".\n");
		
	}
	



	// User Story #2 List fleet prints out the model, speed, range, and
	// price of each jet. (There must be at least 5 jets stored when the program
	// starts).

	// User Story #3 The view fastest jet and longest range options both print out
	// all of the information about their jets.

	// User Story #4 Quit exits the program

	// User Story #5 A user can add custom jets to the fleet.

}

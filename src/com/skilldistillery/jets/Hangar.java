package com.skilldistillery.jets;

import java.util.Scanner;

public class Hangar {
	private Jets jets[];
	// private PilotLounge pl = new PilotLounge();
	Scanner sc = new Scanner(System.in);

	public void printFleet() {
		for (Jets jets : jets) {
			if (jets != null) {
				System.out.println(jets);
			}
		}
	}

	public Hangar() {
		// Pilot pilots = new Pilot();
		jets = new Jets[10];
		jets[0] = new Jets(439, 800, "Warthog", null);
		jets[1] = new Jets(2200, 3355, "Black Bird", null);
		jets[2] = new Jets(1498, 1839, "Raptor", null);
		jets[3] = new Jets(1544, 1841, "Tomcat", null);
		jets[4] = new Jets(1305, 2113, "Chengdu J-20", null);
	}

	public void displayOptions() {
		int largest = 0;
		int index = 0;
		do {
			System.out.println("What would you like to do?");
			System.out.println("1: List Fleet");
			System.out.println("2: View Fastest Jet");
			System.out.println("3: View jet with longest range");
			System.out.println("4: Add Jet");
			System.out.println("5: Quit");
			System.out.print("Enter 1-5: ");
			int option = sc.nextInt();

			if (option == 1) {
				this.printFleet();
			} else if (option == 2) {
				for (int i = 0; i < jets.length; i++) {
					if (jets[i].getJetSpeed() >= largest) {
						largest = jets[i].getJetSpeed();
						index = i;
						break;
					}
				}
				System.out.println("The fastest jet in the fleet is the " + jets[index]);
			} else if (option == 3) {
				for (int i = 0; i < jets.length; i++) {
					if (jets[i].getJetRange() >= largest) {
						largest = jets[i].getJetRange();
						index = i;
						break;
					}
				}
				System.out.println("The fastest jet in the fleet is the " + jets[index]);
			} else if (option == 4) {
				char c;
				do {
					addJet(newJet());
					System.out.print("Would you like to add another one? ");
					String input = sc.next();
					c = input.charAt(0);
				} while (c == 'y' || c == 'Y');
				System.out.println();
				printFleet();
			} else if (option == 5) {
				System.out.println("Have a great day!");
				System.exit(0);
			} 
		} while (true);
	}

	public Jets newJet() {
		boolean added = false;
		System.out.println("Enter a new jet. \nReminder there is only space for 10 jets in the hangar.");
		System.out.print("Enter the jet's top speed: ");
		int newSpeed = sc.nextInt();
		System.out.print("Enter the jet's range: ");
		int newRange = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the jet's name: ");
		String newName = sc.nextLine();
		System.out.print("Enter the pilot's name: ");
		String pilotName = sc.nextLine();
		Jets j = new Jets(newSpeed, newRange, newName);
		return j;
	}

	public boolean addJet(Jets j) {
		boolean added = false;
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = j;
				System.out.print("New jet created: " + jets[i]);
				added = true;
				break;
			}
		}
		return added;
	}
}

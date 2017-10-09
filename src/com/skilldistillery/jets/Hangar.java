package com.skilldistillery.jets;

import java.util.Scanner;

public class Hangar {
	// Fields
	private Jets jets[];
	int space = 5;
	Scanner sc = new Scanner(System.in);

	// Constructor
	public Hangar() {
		jets = new Jets[10];
		jets[0] = new Jets(439, 800, "Blue Falcon", 33_000_000);
		jets[1] = new Jets(2200, 3355, "FUBAR", 18_000_000);
		jets[2] = new Jets(1498, 1839, "Raptor", 150_000_000);
		jets[3] = new Jets(1544, 1841, "Tomcat", 38_000_000);
		jets[4] = new Jets(1305, 2113, "Drogon", 110_000_000);
	}

	// Methods

	// Method to display the users options and perform action he chooses.
	public void displayOptions() {
		do {
			// Text user interface
			System.out.println("What would you like to do?");
			System.out.println("1: List Fleet");
			System.out.println("2: View Fastest Jet");
			System.out.println("3: View jet with longest range");
			System.out.println("4: Add Jet");
			System.out.println("5: Hire a new Pilot");
			System.out.println("6: Quit");
			System.out.print("Enter 1-6: ");
			int option = sc.nextInt();

			// Option 1 allows the user to view all aircraft in the hangar
			if (option == 1) {
				this.printFleet();
				// Option 2 allows user to view the fastest jet in the fleet and all it's
				// information.
			} else if (option == 2) {
				System.out.println("The fastest jet is " + fastestJet());
				// Option 3 allows user to view the jet with the longest range and all it's
				// information
			} else if (option == 3) {
				System.out.println("The jet with the longest range in the fleet is the " + longestJet());
				// Option 4 allows the user to add a new jet to the fleet.
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
				// option 5 quits the program.
			} else if (option ==5) {
				System.out.print("Pilot's name? ");
				sc.nextLine();
				Pilot newPilot = new Pilot(sc.nextLine());
				printFleet();
				System.out.println("Which jet will he be flying? ");
				System.out.print("Don't enter a number not listed. Enter the number of the jet. ");
				int jetI = sc.nextInt();
				jets[jetI-1].setPilot(newPilot);
				System.out.println(newPilot.getName() + " has been added to jet " + jets[jetI-1].getJetModel());
				
			
			} else if (option == 6) {
				System.out.println("Have a great day!");
				System.exit(0);
			}
		} while (true);
	}

	// newJet() constructs a jet under the user's specifications
	public Jets newJet() {
		System.out.println(
				"Enter a new jet. \nReminder there are only " + space + " more spaces(s) available in the hangar.");
		System.out.print("Enter the jet's top speed: ");
		int newSpeed = sc.nextInt();
		System.out.print("Enter the jet's range: ");
		int newRange = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the jet's name: ");
		String newName = sc.nextLine();
		System.out.print("Enter the price: ");
		int price = sc.nextInt();
		sc.nextLine();
		Jets j = new Jets(newSpeed, newRange, newName, price);
		return j;
	}

	// addJet() adds the jet created to the fleet.
	public void addJet(Jets j) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = j;
				System.out.print("New jet created: " + jets[i]);
				System.out.println("Space remaining: " + --space);
				break;
			}
			if (space == 0) {
				System.out.println("No more space in hangar.");
			}
		}
	}

	// method called in option 2 to display the fastest jet
	public Jets fastestJet() {
		int largest = jets[0].getJetSpeed();
		Jets fastest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getJetSpeed() > largest) {
					largest = jets[i].getJetSpeed();
					fastest = jets[i];
				}
			}
		}
		return fastest;
	}

	// method in option 3 to display the jet with the longest range
	public Jets longestJet() {
		int largest = jets[0].getJetRange();
		Jets longest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getJetRange() > largest) {
					largest = jets[i].getJetRange();
					longest = jets[i];
				}
			}
		}
		return longest;
	}

	public void printFleet() {
		int i = 0;
		for (Jets jets : jets) {
			i++;
			if (jets != null) {
				System.out.println(i + ":" + jets);
			}
		}
	}
}

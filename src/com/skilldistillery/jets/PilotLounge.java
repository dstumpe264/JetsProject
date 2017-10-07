package com.skilldistillery.jets;

public class PilotLounge {
	private Pilot pilot[];
	
	public PilotLounge() {
		pilot = new Pilot[10];
		pilot[0] = new Pilot("David");
		pilot[1] = new Pilot("Dan");
		pilot[2] = new Pilot("Adam");
		pilot[3] = new Pilot("Ben");
		pilot[4] = new Pilot("Blake");
		
	}

	public Pilot getPilot(int i) {
		return pilot[i];
	}
	
	public Pilot randomPilot() {
		int index = (int) (Math.random()*pilot.length+1);
		return pilot[index];
	}
	public void createPilots() {
		
	}

}

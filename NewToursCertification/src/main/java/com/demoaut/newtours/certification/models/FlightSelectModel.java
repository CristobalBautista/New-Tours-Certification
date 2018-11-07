package com.demoaut.newtours.certification.models;

public class FlightSelectModel {

	private String outFlight;
	private String inFlight;
	
	public String getoutFlight() {
		char letter = outFlight.charAt(outFlight.lastIndexOf(" ")+1);
		outFlight = outFlight.replaceAll(" [357]", "\'\\$-");
		outFlight = outFlight.replace('-', letter).replace('\'', '\\');;
		return this.outFlight;
	}

	public String getinFlight() {
		inFlight = inFlight.replaceAll(" 6", "\'\\$6");
		inFlight = inFlight.replace('\'', '\\');
		return this.inFlight;
	}
}
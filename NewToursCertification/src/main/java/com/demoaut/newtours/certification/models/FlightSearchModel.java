package com.demoaut.newtours.certification.models;

public class FlightSearchModel {

	private String tripType;
	private String passCount;
	private String fromPort;
	private String fromMonth;
	private String fromDay;
	private String toPort;
	private String toMonth;
	private String toDay;
	private String servClass;
	private String airline;
	
	public String gettripType() {
		String tripType = null;
		switch (this.tripType) {
			case "Round Trip":
				tripType = "roundtrip";
				break;
			case "One Way":
				tripType = "oneway";
				break;
		}
		return tripType;
	}
	
	public String getpassCount() {
		return this.passCount;
	}
	
	public String getfromPort() {
		return this.fromPort;
	}
	
	public String getfromMonth() {
		return this.fromMonth;
	}
	
	public String getfromDay() {
		return this.fromDay;
	}
	
	public String gettoPort() {
		return this.toPort;
	}
	
	public String gettoMonth() {
		return this.toMonth;
	}
	
	public String gettoDay() {
		return this.toDay;
	}
	
	public String getservClass() {
		String servClass = null;
		switch (this.servClass) {
			case "Economy Class":
				servClass = "Coach";
				break;
			case "Business Class":
				servClass = "Business";
				break;
			case "First Class":
				servClass = "First";
				break;
		}
		return servClass;
	}
	
	public String getairline() {
		return this.airline;
	}
}	
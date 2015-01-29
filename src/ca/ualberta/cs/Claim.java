package ca.ualberta.cs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Claim {
	
	// this class is the claim class which contains details about the claim
	// more specifically the name, start, end, and additional details
	protected String claimName;
	protected Date claimStartDate = new Date();
	protected Date claimEndDate = new Date();
	protected String claimDetails;
	SimpleDateFormat fmt = new SimpleDateFormat("yyyy/mm/dd");
	
	// our constructor for Claim class
	public Claim(String claimName, String claimStartDate, String claimEndDate, String claimDetails) {
		this.claimName = claimName;
		try {
			this.claimStartDate = fmt.parse(claimStartDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.claimEndDate = fmt.parse(claimEndDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.claimDetails = claimDetails;
	}

	// returns the claim name
	public String getName() {
		return this.claimName;
	}
	
	// returns the start date of the claim
	public Date getStartDate() {
		return this.claimStartDate;
	}
	
	// returns the end date of the claim
	public Date getEndDate() {
		return this.claimEndDate;
	}
	
	// returns the claim details
	public String getClaimDetails() {
		return this.claimDetails;
	}
	
	// used to get the name of the claim
	public String toString() {
		return getName();
	}
	
	// used to get the start date of the claim
	public Date toStartString() {
		return getStartDate();
	}
	
	// used to get the end date of the claim
	public Date toEndString() {
		return getEndDate();
	}
	
	// used to get the details of the claim
	public String toDetailString() {
		return getClaimDetails();
	}
	
	// allows us to change the name of the claim
	public String modifyName(String Name) {
		this.claimName = Name;
		return claimName;
	}
	
	// allows us to change the start date of the claim
	public Date modifyStartDate(Date Date) {
		this.claimStartDate = Date;
		return claimStartDate;
	}
	
	// allows us to change the end date of the claim
	public Date modifyEndDate(Date Date) {
		this.claimEndDate = Date;
		return claimEndDate;
	}
	
	// allows us to change the details of the claim
	public String modifyClaimDetails(String Details) {
		this.claimDetails = Details;
		return claimDetails;
	}
}

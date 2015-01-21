package ca.ualberta.cs;


public class ClaimListController
{
	
	private static ClaimList claimList = null;
	
	static public ClaimList getClaimList() {
		if (claimList == null) {
			claimList = new ClaimList();
		}
		return claimList;
	}
	
	public void addClaim (Claim claim) {
		getClaimList().addClaim(claim);
	}



}
package com.test;

public class InsurancePolicy {

	private boolean expired;
	private double coverageAmount=5000;
	
	
	public void fileClaim(double claimAmount) throws PolicyExpiredException, InsufficientCoverageException{
		if(expired) {
			throw new PolicyExpiredException("This policy has expired, please reniew it.");
		}
		if(claimAmount>coverageAmount) {
			
			throw new InsufficientCoverageException("Insufficient coverage to cover the claim");
		}
	}
}

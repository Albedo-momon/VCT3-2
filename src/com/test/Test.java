package com.test;

public class Test {

	public static void main(String[] args) {
		InsurancePolicy policy = new InsurancePolicy();
		
		try {
			policy.fileClaim(6000);
		} catch (PolicyExpiredException | InsufficientCoverageException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}

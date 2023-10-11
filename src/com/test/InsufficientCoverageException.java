package com.test;

public class InsufficientCoverageException extends Exception{

	public InsufficientCoverageException(String message) {
		super(message);
		System.out.println("secong commit checking");
		System.out.println("This changes is in feature branch");
		System.out.println("feature-2 commit checking");
		System.out.println("feature-2 commit checking");
		System.out.println("feature-2 commit checking");
		System.out.println("feature-2 commit checking");
		
		System.out.println("inside sub branch of feature-2");
	}
}

package com.test;

public class InsufficientCoverageException extends Exception{

	public InsufficientCoverageException(String message) {
		super(message);
		System.out.println("secong commit checking");
	}
}

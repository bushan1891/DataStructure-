package io.bush.abstraction;

public class Tester extends AbstractEmployee {
	
	static int multiplicationfactor =5;

	public Tester(String name,String email) {
		super(name,email);
				
	}
	
	public Integer salary(){
		return multiplicationfactor*5000;
	}
	
}

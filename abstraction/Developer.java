package io.bush.abstraction;

public class Developer extends AbstractEmployee {

	static int multification_factor=10;
	
	public Developer(String name,String email){
		super(name,email);
		
	}
	
	public Integer salary(){
		return multification_factor*5000;
	}
	
}

package io.bush.abstraction;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer bushan = new Developer("Nagendra","nagendra@jcs.com");
		Tester rugved = new Tester("Rugved","rugved@jcs.com");
		
		
		System.out.println("Developer salary  :" + bushan.salary());
		System.out.println("Tester salary  :" + rugved.salary());
		
		
	}

}

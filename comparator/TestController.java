package io.bush.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class TestController {

	public static void main(String[] args) {
		// testing compareto
		
		HashSet<User> set = new HashSet<User>();
		
		set.add(new User((int)(Math.random()*50+1),"Bushan"));
		set.add(new User((int)(Math.random()*50+1),"Ashwini"));
		set.add(new User((int)(Math.random()*50+1),"Baly"));
		set.add(new User((int)(Math.random()*50+1),"Nidi"));
		set.add(new User((int)(Math.random()*50+1),"Zaib"));
		set.add(new User((int)(Math.random()*50+1),"Kari"));
		
		// sort is using collections 
		
		ArrayList<User> list = new ArrayList<User>(set);
		
		//sorting using comapreto function
		Collections.sort(list);
		
		for(User u : list){
			System.out.println("From sorted list : " + u.getId() + ": " + u.getName() );
		}
		
		//using comparator 
		ArrayList<User> list2 = new ArrayList<User>(set);
		Collections.sort(list2, new Comparator<User>(){
			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				if(o1.getId()>o2.getId()){
					return 1;
				}
				if(o1.getId()<o2.getId()){
					return -1;
				}
				
				return 0;
			}
		});
		
		for(User u : list2){
			System.out.println("From sorted list2 : " + u.getId() + ": " + u.getName() );
		}
		
		// display value using iterator 
		Iterator<User> it = set.iterator();
		
		while(it.hasNext()){
			User user = it.next();
			System.out.println(user.getId() +  " is " + user.getName());
		}
		
		System.out.println("*********Car**********");
		
		HashSet<Car> car = new HashSet<Car>();
		
		car.add(new Car((int)(Math.random()*50+1),"Santro"));
		car.add(new Car((int)(Math.random()*50+1),"Zen"));
		car.add(new Car((int)(Math.random()*50+1),"Mustang"));
		car.add(new Car((int)(Math.random()*50+1),"Camaro"));
		
		ArrayList<Car> carList = new ArrayList<Car>(car);
		
		//sorting using comapreto function
		Collections.sort(carList);
		
		for(Car u : carList){
			System.out.println("From sorted list : " + u.getId() + ": " + u.getModel() );
		}
		
		
		
		
	HashSet<Car> car_it = new HashSet<Car>();
		
	car_it.add(new Car((int)(Math.random()*50+1),"Santro"));
	car_it.add(new Car((int)(Math.random()*50+1),"Zen"));
	car_it.add(new Car((int)(Math.random()*50+1),"Mustang"));
	car_it.add(new Car((int)(Math.random()*50+1),"Camaro"));
		
		
		Iterator<Car> it_car = car_it.iterator();
		
	if(it_car.hasNext()){
		Car temp = it_car.next();
		System.out.println("First if" + temp.getId());
	}
		
	if(it_car.hasNext()){
		Car temp = it_car.next();
		System.out.println("second if" + temp.getId());
	}


	}

	

	
	
	
}

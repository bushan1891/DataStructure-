package io.bush.comparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Tester {

	public static void main(String[] args) {
		
		HashSet<User> set = new HashSet();
		
		// hash set will have all unique values if hash code and equals is implimented 
		
		set.add(new User(1001,"bushan"));
		set.add(new User(1005,"karish"));
		set.add(new User(1002,"zaiba"));
		set.add(new User(1004,"baly"));
		set.add(new User(1004,"baly"));
		set.add(new User(1004,"baly"));
		set.add(new User(1003,"ashwini"));
		set.add(new User(1003,"ashwini"));
		
		System.err.println(set.size());
	    List<User> arraylist = new ArrayList();
	    arraylist.addAll(set);
	    
	    // implement user comparable
	    Collections.sort(arraylist);
	    for(User u : arraylist){
			System.out.println(u.getId());
		}
	    
	    List<User> arraylist1 = new ArrayList();
	    arraylist1.addAll(set);
	    
	    // this uses the external comparator 
		Collections.sort(arraylist1,new Comparator<User>(){
			@Override
			public int compare(User o1, User o2) {
				if(o1.getId()>o2.getId())
					return 1;
				if(o1.getId()<o2.getId())
					return -1;	
				return 0;
			}
		});
		
		for(User u : arraylist){
			System.out.println(u.getId());
		}
	
		// iterator 
		Iterator<User> it = set.iterator();
	
		while(it.hasNext()){
			User user = it.next();
			System.out.println("Element"+ user.getId());
		}
		
	}
	
}

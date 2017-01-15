package io.bush.comparator;

public class Car implements Comparable<Car>{

	int id ;
	String model;
	
	public Car(int id,String model){
		this.id=id;
		this.model=model;
	}
	
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		
		if(this.getId()>o.getId()){
			return 1;
		}
		if(this.getId()<o.getId()){
			return -1;			
				}
		
		return 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}

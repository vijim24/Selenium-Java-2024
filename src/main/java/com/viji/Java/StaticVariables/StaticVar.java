package com.viji.Java.StaticVariables;

public class StaticVar {

	// Local Instance Variables - Coz its tied up to the object
	String name;
	String address;
	// Static Variable - Is dependent on the class, So class variable
	static String city; // When declared as static tht value is shared by all objects, Instead of
						// creating it each and everytime.[ When certain value doesnt change]
	static int i = 0;

	static {
		city = "Chennai";
	}

	public StaticVar(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);

	}

	public void getAddress() {
		System.out.println(address + " " + city);
	}

	public static void getData() { // Static methods will accept only static variables
		System.out.println(city);
	}

	public static void main(String[] args) {
		StaticVar obj = new StaticVar("Viji", "Royapuram");
		StaticVar obj1 = new StaticVar("Vinayagar", "Viji's Home");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getData(); // To call static methods no need of obj
		StaticVar.i = 4;
		obj.address = "India";

	}

}

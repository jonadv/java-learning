package main;

import java.util.List;
import java.util.ArrayList;

public class CompareAutomobiles{
	public static void main(String... arg){
	/*
	1. You are developing an application that allows a user to compare automobiles. Use abstract classes, classes, and interfaces to model Car, Truck, Vehicle, and Drivable entities. Declare and define a method named drive() in appropriate places.
	*/
	System.out.println("Exercise 1:");
	Vehicle car = new Car("Kia", "Picanto", 2021);
	Vehicle truck = new Truck("Dodge", "Traveler", 2020);
	System.out.println("Instance of car and truck created.");
	
	/*
	2. Every vehicle must have a make and model. What can you do to ensure that a method named getMakeAndModel() can be invoked on every vehicle. 
	*/
	System.out.println("\nExercise 2:");
	System.out.println("Made sure getMakeAndModel can be invoked on every vehicle"+
						"by declaring the method in abstract class Vehicle");
						
	System.out.println("Make and model of car instance: "+ car.getMakeAndModel());
	System.out.println("Make and model of truck instance: "+ truck.getMakeAndModel());
	
	/*
	3. You need to be able to get the Vehicle Identification Number (VIN) of a vehicle by calling getVIN() on any vehicle. Furthermore, you don't want any subclass to change the behavior of the getVIN method. Where and how will you code the getVIN method? 
	*/
	System.out.println("\nExercise 3:");
	System.out.println("Implement a method that cant be overridden by making it final.");
	
	System.out.println("VIN of car: "+car.getVIN());
	System.out.println("VIN of truck: "+truck.getVIN());
	
	/*
	4. Create an interface named Drivable with a default method start(). Invoke start() on instances of classes that implement Drivable. Override start() so that it prints a different message in each class. 
	*/
	System.out.println("\nExercise 4:");
	System.out.println("Starting different vehicles.. ");
	car.start();
	truck.start();
	
	/*
	5. Ensure that every vehicle is created with a VIN. 
	*/
	System.out.println("\nExercise 5:");
	System.out.println("Added in constructor of abstract superclass Vehicle");
	
	
	/*
	6. Create a class named ToyCar that extends Car but doesn't require any argument while creation. 
	*/
	System.out.println("\nExercise 6:");
	Vehicle toycar = new ToyCar();
	System.out.println("New ToyCar created");
	
	/*
	7. You have a list of features such as height, width, length, power, and boot capacity, on which you want to compare any two vehicles. New feature names will be added to this list in future. Create a getFeature( String featureName) method such that it will return "N.A" for any feature that is not supported by a particular vehicle. 
	*/	
	
	System.out.println("\nExercise 7, features:");
	System.out.println("Adding height and boot capacity to car and truck...");
	car.featlist.addFeature("height", "150");
	car.featlist.addFeature("boot capacity", "80pk");
	car.featlist.addFeature("height", "300");
	car.featlist.addFeature("boot capacity", "150pk");
	System.out.println("Getting height and width from car: ");
	System.out.println("Car height: "+ car.featlist.getFeature("height"));
	System.out.println("Car width: "+ car.featlist.getFeature("width"));
	
	/*
	8. Create an interface named VehicleHelper with a static method register( Vehicle v) that prints the VIN of the vehicle. Ensure that VehicleHelper's register method is invoked whenever an instance of a vehicle is created.
	*/
	System.out.println("\nExercise 8, interface helper:");
	System.out.println("Implemented interface VehicleHelper which now prints VIN after creation of a new vehicle; see above for prints.");
	}
}

interface Drivable{
	void drive();
	void start();
}

abstract class Vehicle implements Drivable, VehicleHelper{
	String brand;
	String model;
	int yearBuild;
	public static int count;
	public String VIN;
	FeatureList featlist;
	
	public String getMakeAndModel(){
		return this.brand + " " + this.model;
	}
	public final String getVIN(){
		return this.VIN;
	}
	
	/*
	5. Ensure that every vehicle is created with a VIN. 
	*/
	Vehicle(){
		count++;
		this.VIN = "000"+count;
		featlist = new FeatureList();
		VehicleHelper.register(this);
	}
}

class Car extends Vehicle{
	Car(String brand, String model, int yearBuild){
		this.brand = brand;
		this.model = model;
		this.yearBuild = yearBuild;		
	}
	Car(){
		this("Unknown", "Unknown", 2021);
		System.out.println("Car created");
	}
	public void drive(){
		System.out.println("Driving Car");
	};
	public void start(){
		System.out.println("Starting Car");
	}
}

class Truck extends Vehicle{
	Truck(String brand, String model, int yearBuild){
		this.brand = brand;
		this.model = model;
		this.yearBuild = yearBuild;
	}
	Truck(){
		this("Unknown", "Unknown", 2021);
		System.out.println("Truck created");
	}
	public void drive(){
		System.out.println("Driving Truck");
	}
	public void start(){
		System.out.println("Starting Truck");
	}
}

/*
6. Create a class named ToyCar that extends Car but doesn't require any argument while creation. 
*/
class ToyCar extends Car{
	public ToyCar(){
		super("ToyCar", "Vroom", 2021);
	}
}

/*
7. You have a list of features such as height, width, length, power, and boot capacity, on which you want to compare any two vehicles. New feature names will be added to this list in future. Create a getFeature( String featureName) method such that it will return "N.A" for any feature that is not supported by a particular vehicle. 
*/
class Feature{
	String featureName;
	String feature;
	Feature(String featureName, String feature){
		this.featureName = featureName;
		this.feature = feature;
	}
}

class FeatureList{
	List<Feature> featlist;
	FeatureList(){
		featlist = new ArrayList<Feature>();
	}
	void addFeature(String featureName, String feature){
		featlist.add(new Feature(featureName, feature));
		System.out.println("Added feature: "+featureName+" with value of "+ feature);
	}
	String getFeature(String featureName){
		for(Feature f: featlist){
			if(f.featureName.equals(featureName)) {
				return f.feature;
			}
		}
		return "N.A.";
	}
}

/*
8. Create an interface named VehicleHelper with a static method register( Vehicle v) that prints the VIN of the vehicle. Ensure that VehicleHelper's register method is invoked whenever an instance of a vehicle is created.
*/

interface VehicleHelper{
	static void register(Vehicle v){
		System.out.println("Vehicle helper registered VIN: "+v.VIN);
	}
}
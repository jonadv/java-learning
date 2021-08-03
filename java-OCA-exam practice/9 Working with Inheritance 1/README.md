Exercises Chapter 9
Working with Inheritance 1

1. You are developing an application that allows a user to compare automobiles. Use abstract classes, classes, and interfaces to model Car, Truck, Vehicle, and Drivable entities. Declare and define a method named drive() in appropriate places. 

2. Every vehicle must have a make and model. What can you do to ensure that a method named getMakeAndModel() can be invoked on every vehicle. 

3. You need to be able to get the Vehicle Identification Number (VIN) of a vehicle by calling getVIN() on any vehicle. Furthermore, you don't want any subclass to change the behavior of the getVIN method. Where and how will you code the getVIN method? 

4. Create an interface named Drivable with a default method start(). Invoke start() on instances of classes that implement Drivable. Override start() so that it prints a different message in each class. 

5. Ensure that every vehicle is created with a VIN. 

6. Create a class named ToyCar that extends Car but doesn't require any argument while creation. 

7. You have a list of features such as height, width, length, power, and boot capacity, on which you want to compare any two vehicles. New feature names will be added to this list in future. Create a getFeature( String featureName) method such that it will return "N.A" for any feature that is not supported by a particular vehicle. 

8. Create an interface named VehicleHelper with a static method register( Vehicle v) that prints the VIN of the vehicle. Ensure that VehicleHelper's register method is invoked whenever an instance of a vehicle is created.

Deshmukh, Hanumant; Deshmukh, Hanumant. OCAJP Associate Java 8 Programmer Certification Fundamentals: 1Z0-808 (p. 268). Enthuware. Kindle Edition. 
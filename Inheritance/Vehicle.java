package Inheritance;



public class Vehicle {
	  private String brand = "Ford";        // Vehicle attribute
	  public String getBrand() {
		  return brand;
	  }
	  
	 
	}

	class Car extends Vehicle {
	  private String modelName = "Mustang";    // Car attribute
	  public void honk() {                    // Vehicle method
		    System.out.println("Tuut, tuut!");
		  }

	  
	  public static void main(String[] args) {
		  
		  Vehicle obj = new Vehicle();

	    // Create a myCar object
	    Car myCar = new Car();

	    // Call the honk() method (from the Vehicle class) on the myCar object
	    myCar.honk();

	    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
	    System.out.println(myCar.getBrand() + " " + myCar.modelName);
	  }
	}

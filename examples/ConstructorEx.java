package examples;

public class ConstructorEx {
			int x;
	
	  
	  public ConstructorEx() {
//		  System.out.println("Object has been created ");
		  x = 5;
	  }

	  public static void main(String[] args) {
		  ConstructorEx myObj = new ConstructorEx(); // Create an object of class ConstructorEx (This will call the constructor)
		  System.out.println(myObj.x);

	  }
	}



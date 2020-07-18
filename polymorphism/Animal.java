package polymorphism;

public class Animal {
		
		 
		  }
		
			//Method overriding or run-time polymorphism
class Pet extends Animal {
		public void walk() {
		    System.out.println("Pet is walking");
		  }
		}

class Dog extends Pet {
		public void walk() {
		    System.out.println("Dog is walking");		 
		    }
		}

class MyMainClass {
		public static void main(String[] args) {
			  	Dog d = new Dog();
			  	Pet p = d;
			  	Animal a = d;
			  	d.walk();
			  	p.walk();
		  }
		}



package examples;

//import examples.OuterClass.InnerClass;

class OuterClass {
	
	  int x = 10;

	 class InnerClass {
		 
	   private int y = 5;
	   public int getY() {
		   return y;
	   }
	   public void setY(int y) {
		   this.y = y;
	   }
	  }
	}

	 public class MyMainClass {
	  public static void main(String[] args) {
	    OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.getY() + myOuter.x);
	  }
	}




package encapsulations;

public class Student {
			private int age;
			private String name;
			
			public int getAge() {
				return age;
			}
			 public void setAge(int age) {
				 if(age>20) {
					 System.out.println("Invalid");
					 
				 }
				 else {
					 this.age = age;
				 }
			 }
}
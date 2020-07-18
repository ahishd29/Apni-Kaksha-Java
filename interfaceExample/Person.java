package interfaceExample;

public class Person implements Student, YouTuber{

	public static void main(String[] args) {
		Person ob = new Person();
		ob.study();
		ob.makeVideos();
		
		

	}
	@Override
	public void study() {
		System.out.println("person is studying");
		
		
	}

	@Override
	public void makeVideos() {
		System.out.println("person is making videos");
		
		
	}

	

}

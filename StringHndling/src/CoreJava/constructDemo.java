package CoreJava;

public class constructDemo {
	// Default
	public constructDemo()
	{
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor lecture 1");
		//
	}
	// Parameterized constructor
	
	public constructDemo(int a, int b) 
	{
		System.out.println("I am in the parametrizide constructor");
	}
	
	public constructDemo(String str)
	{
		System.out.println(str);
	}
	
	public void getdate()
	{
		System.out.println("I am the method");
	}
	//will not return values
	//name of constructor should be the class name
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructDemo cd = new constructDemo("World");
		constructDemo c = new constructDemo(4,5);
		// when ever you create an object constructor is called
		//block of code when ever an object is created
		
	}

}

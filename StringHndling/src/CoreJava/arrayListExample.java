package CoreJava;

import java.util.ArrayList;

public class arrayListExample {
	//can accept dublicate valoes
	//Arraylist,LinkList,vektor - implementing list interface
	//array have fixed size where as arraylist can grow dynamicaly
	//you can access and insert any value in any index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		/*a.remove(1);
		a.remove("Java");
		System.out.println(a);*/
		System.out.println(a.get(2));
		System.out.println(a.contains("Testing"));
		System.out.println(a.indexOf("Rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}

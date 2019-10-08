package CoreJava;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int [5];
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		for (int i=0; i<a.length; i++)
		{
		System.out.print(a[i]);
		System.out.println(i);
		}
		System.out.println(a.length);
	}
	
}

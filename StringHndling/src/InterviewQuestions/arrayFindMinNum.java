package InterviewQuestions;

public class arrayFindMinNum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find min number in the array
		int a[] = {12,34,45,56,42,12,34,56,67,10};
		int min = a[0];
		for (int i=0;i<a.length;i++)
		{
			if (a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

}

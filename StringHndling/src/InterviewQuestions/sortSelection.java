package InterviewQuestions;

public class sortSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a[] = {3,5,7,9,8,6,4};
		 //0 1 2 3 4 5 6 
		//One by one move boundary of unsorted subarray
	for (int i=0; i<a.length-1;i++) 
	{
		// Find the minimum element in unsorted array
		int min_idx = i;
		for (int j=i+1;j<a.length;j++) 
		{
			if (a[j]<a[min_idx])
			{
		// Swap the found minimum element with the first 
	    // element 
				min_idx = j;				
				int temp = a[min_idx];
				a[min_idx] = a[i];
				a[i] = temp;
			}
		}
		
	}
	for (int i=0; i<a.length;i++)
	{
	System.out.print(a[i]);
	}
}
}


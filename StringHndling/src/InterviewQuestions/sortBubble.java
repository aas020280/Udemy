package InterviewQuestions;

public class sortBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {9,8,7,6,4,3,2};
         //0 1 2 3 4 5 6
for (int i=0; i<a.length-1; i++) 
	{
		for (int j=0; j<a.length-i-1; j++)
		{
			if (a[j]>a[j+1])
			{
				//swap a[j+1] and a[i]
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1] = temp;
				
			}
			
		}
	}
for (int i=0; i<a.length; ++i) { 
        System.out.print(a[i] + " "); 
    }

	}

}

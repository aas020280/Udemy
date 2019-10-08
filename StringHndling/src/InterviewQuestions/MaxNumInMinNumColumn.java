package InterviewQuestions;

public class MaxNumInMinNumColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2 4 5
		//3 0 7
		//1 10 9
		//output = 4
		//Step 1: Find the minimum number
		//Step 2: Identify the coloumn of minimum number
		//Step 3: Find the maximum number in identified coloumn
		
		int abc[][] = {{2,4,5},{3,0,7},{1,10,9}};
		int min = abc[0][0];
		int mincoloumn = 0;
		for (int i=0;i<3;i++)
		{
			for (int j=0; j<3; j++)
			{
				if (abc[i][j]<min)
				{
					min = abc[i][j];
					mincoloumn=j;
				}
			}
		}
		int max=abc[0][mincoloumn];
		int k = 0;
		while (k<3)
		{
			if(abc[k][mincoloumn]>max)
			{
				max=abc[k][mincoloumn];
			}
			k++;
		}
		
		System.out.println(max);
	}

}

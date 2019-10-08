package InterviewQuestions;

public class MinNumMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 4 5
		//3 4 7
		//1 2 9
		// Print minimum number from above matrix
		
		int abc[][]= {{21,12,16},{13,24,37},{31,11,19}};
		int min = abc[0][0];
		for (int i=0;i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				if(abc[i][j]<min)
				{	
				min=abc[i][j];
				}
			}
		}
		System.out.println(min);
	}

}

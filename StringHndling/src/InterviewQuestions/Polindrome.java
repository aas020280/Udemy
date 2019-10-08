package InterviewQuestions;

public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Alex good";
		String t ="";
		for(int i=s.length()-1; i>=0;i--)
		{
			t= t+ s.charAt(i);
		}
		
		System.out.println(t);
		
		/*if(s==t)
		{
			System.out.println("Polindrome");
		}
		
			System.out.println("Not polindrome");*/
		
	}

}

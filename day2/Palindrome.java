package week1.day2;


public class Palindrome {

	public static void main(String[] args) {
    int input; int output; int a; int s;
    input = 121;
    a=input;
    
    		for (s=0; a>0; a/=10) {
    			output=a%10;
    			System.out.println(output);
    			s=(s*10)+output;

		}
    		if (s==a)
    			System.out.println(a + " is palindrome");
    		else
    			System.out.println(a + " is not palindrome");
    		
	}
    		

}

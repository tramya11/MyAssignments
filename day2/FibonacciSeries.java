package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;int n1 = 1;int n2 = 2;
		System.out.println(n1);
		System.out.println(n2);

		for (int i=2;i<=range;i++) {
		int n3 = n1 + n2;
		System.out.println(n3+ ",");
		n1=n2;
		n2=n3;
				
		}
		

	}

}

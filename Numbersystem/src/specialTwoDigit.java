import java.util.Scanner;

public class specialTwoDigit {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the first digit");
	int d1= sc.nextInt();
	 	
		int n1=d1/10;
		int n2=d1%10;
		int sum= n1+n2+n2*n1;
		if(sum==d1)
		{
			System.out.println(d1 + "is a special number");
			
		}
		else
		{
				System.out.println( d1 + "is not a special number");
	
			}
	
	

	}

}

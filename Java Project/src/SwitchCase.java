
public class SwitchCase {

	public static void main(String[] args) {
		//calCi or calculator

		int n1=223;
		int n2=344;

		int value = 1;


		switch(value)

		{
		case 1:
		{
			System.out.println(n1+n2);

		}
		break;
		case 2:
		{
			System.out.println(n1-n2);

		}
		break;
		case 3:
		{
			System.out.println(n1*n2);
		}
		break;
		case 4:
		{
			System.out.println(n1/n2);
		}


		break;

		default:
		{
			System.out.println("invalid data");
		}
		break;

		}


         ///CHECKING VOWELS


		char ch= 'E';

		switch(ch)
		{
		 case 'A':
		{
			System.out.println("vowel");
		}
		break;
		 case 'E':

		 {
			 System.out.println("vowel");
		 }
		  break;
		 case 'I':
		 {
			 System.out.println("vowel");

		 }
		 break;
		 case 'O':
		 {
			 System.out.println("vowel");

		 }
		 break;
		 case 'U':
		 {
			 System.out.println("vowel");

		 }
		 break;
		 default:
		 {
			 System.out.println("is a constant");
		 }
		}

















}
}
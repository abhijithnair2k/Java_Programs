
public class PreOrPostIncrement {

	public static void main(String[] args) {

		   int n1 =26;
		   int n2 =44;
		   int res1= n1++ + ++n2;
		   int res2 =++n2 + ++n1 + n1++;
		   System.out.println(res1);
		   System.out.println(res2);


	}

}

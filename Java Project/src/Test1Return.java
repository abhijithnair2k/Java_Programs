
public class Test1Return {

	String Fname(String first)
	{
		return first;

	}
	String lname(String last)
	{
		return last;

	}
	 String fullname(String F,String l)
	 {
		 String full = F+ l;
		// System.out.println(full);
		return full;

		 //return full;

	 }


	public static void main(String[] args) {

		Test1Return t1= new Test1Return();
	String A=t1.Fname("Abhijith");
	String B=t1.lname("S.L");

	  String S=t1.fullname(A,B);


		System.out.println(S);
	}

}

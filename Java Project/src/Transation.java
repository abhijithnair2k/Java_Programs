
public class Transation {

	void transation1(String UPI, String pwd)
	{
		System.out.println("payment done via upi");
	}

	void transation1(int card, int pwd)

	{
		System.out.println("payment done via card");
	}
	void transation1( int cash)

	{
		System.out.println("payment done using cash");

	}
	public static void main(String[] args) {

		Transation t1=new Transation();

		t1.transation1("abhijith113@icic","abhi1234");
		t1.transation1(123344567,0000);
		t1.transation1(200);



	}

}

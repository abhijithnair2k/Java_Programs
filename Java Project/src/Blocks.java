
public class Blocks {
	void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void mult(int a, int b, int c)
	{
		int sum= a+b-c;
		System.out.println(sum);
	}
	String s()

	{
		System.out.println("I am a good boy");
		return "java";

	}



	public static void main(String[] args) {
		Blocks b1=new Blocks();
		Blocks b2= new Blocks();

        b1.add(34, 66);
        b2.mult(22, 55, 11);
       String r= b2.s();
       System.out.println(r);
	}

}

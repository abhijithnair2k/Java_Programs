
public class Programs {
	
	
	String name="abhijith";

		
	void add(int a ,int b)
	{
		int add=(a+b)-(20);
		 String d2= name;
		String name ="Shalu";
	System.out.println(name);
	
	
		System.out.println(add);
		System.out.println(d2);
		System.out.println(this.name);
	}
		void display ()
		{
			System.out.println(this.name);
			
		
		
		
	}
	
	
	public static void main(String[] args) {

		
		Programs p1=new Programs();
		p1.add(20, 34);
		p1.display();
		
		
	}

}

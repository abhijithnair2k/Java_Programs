
public class Son extends Father {
    
	
	
	String name;
	void son()
	{
		System.out.println("He has a girl friend");
	}
	
	public static void main(String[] args) {
	Son s1=new Son();
	s1.name="Abhijith";
	s1.bike="CBR";
	s1.drinking();
	s1.food();
	s1.son();
	
	
	
	System.out.println( s1.name);
	System.out.println(s1.bike);
	
	}

}

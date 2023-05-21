
public class ToString {
	String name; 
	int saL;
	
	
	@Override
	
	public String toString()

	{
		return this.name+""+this.saL;
	}
	
	public static void main(String[]args)
	{
		ToString t1=new ToString();
		t1.name="Abhijith";
		t1.saL=300000;
		System.out.println(t1);
		
	}
	

}

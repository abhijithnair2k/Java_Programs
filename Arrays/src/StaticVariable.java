
public class StaticVariable {
	
	
	String name;
	static int sal;
	
	
	

	public static void main(String[] args) {
		
		StaticVariable s1=new StaticVariable();
		s1.name="Abhijith";
		s1.sal=12222;
		
		StaticVariable s2=new StaticVariable();
		s2.name="Ajith";
		
		StaticVariable s3=new StaticVariable();
		s3.name="Ebin";
		
		System.out.println(s1.name  + "" +  s1.sal);
		System.out.println(s2.name  + "" +  s2.sal);
		System.out.println(s3.name  + "" +  s3.sal);


	}

}

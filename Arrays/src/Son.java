
public class Son extends Father {

	String car="Audi";
	int tax=100000;
	void service()
	{
		System.out.println("good service center");
	}
	public static void main(String[] args) {
		Father  f= new Son();
		//System.out.println(f.car);
		System.out.println(f.sal);
		f.details();
		Son s=(Son)f;
		System.out.println(s.car);
		
		
		
	}

}

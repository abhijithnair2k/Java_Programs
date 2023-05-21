
public class Employee2 {



	String name;
	String company;
	int sal;

	Employee2(String n, String c,int p)

	{
		this.name=n;
		this.company=c;
		this.sal=p;

	}
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.company);
		 System.out.println(this.sal);
	}

	public static void main(String[] args) {

		Employee2 e1 = new Employee2(" Abhijith ", " Google ",1000000);
		Employee2 e2 = new Employee2(" Ebin "," wipro ",2000000);
		 e1.sal=3000000;


		 e1.display();

		 e2.display();

	}

}

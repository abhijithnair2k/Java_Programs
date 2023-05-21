
public class Employee {
	
	
	// using both constructors and methods togethe

	String name;
	String company;
	int salary;
	int tax;
	
	Employee(String n,String c,int s,int t)// constructor
	{
		this.name=n;
		this.company=c;
		this.salary= s;
		this .tax=t;
	}
	
	void Employeedetails()// method
	{
		System.out.println(this.name);
		System.out.println(this.company);
		System.out.println(this .salary + this.tax +"as total salary");
		

	}

		public static void main(String[] args) {
			
			
		Employee e1= new Employee("Abhijith","google",27500,4000);
		Employee e2= new Employee("Ajith","yahoo",30000,2500);
		
		
e1.Employeedetails();
System.out.println();
e2.Employeedetails();
System.out.println();
e1.Employeedetails();
e2.Employeedetails();


	}

}

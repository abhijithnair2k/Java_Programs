
public class Employee


// Initializati0n using constructor--------
{
	String name;
	int salary;
	int empno;
	String company;


		Employee(String n,int s,int no,String c) //--- parameters
		{
	this.name= n;
	this.salary =s;
	this.empno = no ;
	this.company = c;
		}

	public static void main(String[] args) {

		Employee e1=new Employee("Abhijith",200000,001,"TCS");
		Employee e2= new Employee("Ebinraj",300000,226,"CTS");
		Employee e3= new Employee("Ajith",400000,007,"Infosys");

		e1.name="abhishek";	//REINITIALIZATION

		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(e1.empno);
		System.out.println(e1.company);


		System.out.println();

		System.out.println(e2.name);
		System.out.println(e2.salary);
		System.out.println(e2.empno);
		System.out.println(e2.company);

		System.out.println();


		System.out.println(e3.name);
		System.out.println(e3.salary);
		System.out.println(e3.empno);
		System.out.println(e3.company);






	}

}

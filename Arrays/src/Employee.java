
public class Employee {
	String name,company,floor;
	int sal;
	
	Employee(String n,String c,String f,int s)
	{
		this.name=n;
		this.company=c;
		this.floor=f;
		this.sal=s;
		
	}

	public static void main(String[] args) {
		Employee e1=new Employee("Abhijith","TCs","1st floor",200000);
		Employee e2=new Employee("Ebin raj","CTS","2nd floor",30000);
		 
		Employee w[]= {e1,e2};
			for (int i=w.length-1;i>=0;i--)
			//System.out.println(w[i]);
		System.out.println(w[i].name+""+w[i].company+""+w[i].floor+""+w[i].sal);
			
		
		

	}

}


public class Precentage {
	void student(int phy, int che,int maths)
	{
		int total= phy+ che +maths;
		double pers = total / 300.0*100.;
		System.out.println(pers);
	}
	public static void main(String[] args) {

		Precentage p1= new Precentage();
		 p1.student(56,73 ,53 );


	}




}

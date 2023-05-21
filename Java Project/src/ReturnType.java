
public class ReturnType {

	double addition(double a,int b,double c)
	{
		double d=a+b+c;
		double D= d;
		return D;

	}

   int display()
   {
	   return 100;

   }
   String dispaly1()
   {

	   System.out.println("display");
	   return "java";

   }
   int display2(int a,int b)

   {
	   return a*b+(a-b);


   }



	public static void main(String[] args) {

		 ReturnType t1=new ReturnType();
		 double u= t1.addition(22.0, 58, 10.0);
		 System.out.println(u);
		int x= t1.display();
		 System.out.println( x);

	 String r=t1.dispaly1();

	System.out.println(r);
int w=	t1.display2(13, 10);
System.out.println(w);




	}


}

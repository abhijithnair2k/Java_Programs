class LeapYear
{
	public static void main(String [] args)


	{
		int year =2001;

		if(year%400==0)
			System.out.println(year +"is a leap year");
		else if(year%4==0)
			System.out.println(year +"is a leap year ");
		else if (year%100!= 0)
			System.out.println(year +"is not a leap year");
		else
			System.out.println(year +"is not a leap year");


		// or else we can write in these following manner



		int year1=2021;

		if((year1%4==0)&&(year1%100!=0)||(year1%400==0))

		{
		System.out.println(year1+"is a leap year");
		}
		else
		{
			System.out.println(year1+"is not  a leap year");
		}






}
}

public class Vehicle {
	String name;
	int price;
	 void details()
	 {
		 System.out.println(this.name);
		 System.out.println(this.price);
	 }


	void turningLight1()
	{
		System.out.println("turning light ON");

	}
	void turningLight2()
	{
		System.out.println("turning light OFF");

	}



	public static void main(String[] args) {
		Vehicle v1= new Vehicle();
		v1.turningLight1();
		v1.turningLight2();


	}

}


public class CarInch  extends Vehicle{

	public static void main(String[] args) {

		CarInch c1=new CarInch();

		c1.name="Audi";
		c1.price=100000000;
		//System.out.println(c1.name);
		//System.out.println(c1.price);
		c1.turningLight1();
		c1.turningLight2();
		c1.details();
	}
}

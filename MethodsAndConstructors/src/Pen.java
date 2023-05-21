
public class Pen {// USING ONLY METHODS,///
	
	
	String brand;
	String color;
	int price;
	  
	void Pendetails()
	{
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.price);
		
	}
	

	public static void main(String[] args) {
		
		Pen p1=new Pen();
		p1.brand="lexi";
		p1.color="blue";
		p1.price=10;
		 Pen p2=new Pen();
		 p2.brand="cello";
		 p2.color="red";
		 p2.price=20;
		 
		p2.Pendetails(); 
		System.out.println();
		p1.Pendetails();
		

	}

}

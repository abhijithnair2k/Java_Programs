import java .util.Scanner;
class Areaofperimeterofrectangle {
	
		

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		double len=sc.nextDouble();
		System.out.println("Enter Breath");
		double br=sc.nextDouble();
		double area=len*br;
		System.out.println("area is :"+ area);
		double per= 2*(len+br);
		System.out.println("breath is:"+ per);
		
		
		
		
	

	}

}

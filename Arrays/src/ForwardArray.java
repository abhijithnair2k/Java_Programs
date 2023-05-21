
public class ForwardArray {

	public static void main(String[] args) {
		String bike[]= {"Himalayan","Duke","Dominar","Pulsar"};
		System.out.println(bike.length);
		System.out.println(bike.length-1);
		for(int i=0;i<= bike.length-1;i++) 
		System.out.println(bike[i]);
		System.out.println();
		for(int i=bike.length-1;i>=0;i--) 
			System.out.println(bike[i]);
	}

}

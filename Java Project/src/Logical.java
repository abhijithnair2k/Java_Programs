

public class Logical {

	public static void main(String[] args) {
        int n1 =34;
        int n2 = 29;
        int n3 =50;
        boolean result = n1>n2 && n1-n2<n3;
        boolean result1 = n2>n3 || n3!=49;
        boolean result2= (n2!=n3 || n3 > n1|| n3>n1) && n1>n2;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);



	}
}

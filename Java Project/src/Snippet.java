
public class Snippet {
	
	void circle(double radius)

	{
		double pi = 3.14;
		double area = pi * radius * radius;
		System.out.println(area);

	}

	void areaoftriangle(double b, double h) {
		double d1 = 1 / 2.0;

		double area = d1 * b * h;
		System.out.println(area);
	}

	public static void main(String[] args) {
		Area a1 = new Area();
		a1.circle(10);
		a1.areaoftriangle(10, 23);

	}

}
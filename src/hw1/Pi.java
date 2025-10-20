package hw1;

public class Pi {
	public static void main(String[] args) {

		final double pi = 3.1415;
		int r = 5;
		double area = Math.pow(r, 2) * pi;
		double perimeter = 2 * pi * r;
		
		System.out.printf("圓面積 = %.2f , 圓周長 = %.2f ", area, perimeter );

	}

}

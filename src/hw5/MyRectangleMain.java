package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle ob1 = new MyRectangle();
		ob1.setWidth(10);
		ob1.setDepth(20);
		System.out.println(ob1.getArea());
		
		MyRectangle ob2 = new MyRectangle(10, 20);
		System.out.println(ob2.getArea());
	}
}

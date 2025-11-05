package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws CalException {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("請輸入x的值：");
			int x = Integer.parseInt(sc.next());
			System.out.println("請輸入y的值：");
			int y = Integer.parseInt(sc.next());
			Calculator xy = new Calculator();
			System.out.println(x + "的" + y + "次方等於" + xy.powerXY(x, y));
		} catch (NumberFormatException e) {
			System.out.println("輸入格式不正確");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}

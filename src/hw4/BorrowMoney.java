package hw4;

import java.util.Scanner;

public class BorrowMoney {
	public static void main(String[] args) {

		int[][] id = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		System.out.print("欲借的金額：");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		System.out.print("有錢可借的員工編號：");
		int count = 0;
		for (int j = 0; j < id[1].length; j++) {
			if (money <= id[1][j]) {
				System.out.print(id[0][j] + " ");
				count++;
			}
		}
		System.out.print("共" + count + "人!");
		sc.close();
	}

}

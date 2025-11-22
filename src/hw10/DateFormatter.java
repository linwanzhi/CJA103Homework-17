package hw10;

import java.util.Scanner;

public class DateFormatter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dateFormat = "(19|20)\\d\\d(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])";
		String date;
		
		while (true) {
			System.out.print("請輸入日期(年月日，例如:20110131)：");
			date = sc.next();

			if (date.matches(dateFormat)) {
				break;
			} else {
				System.out.print("日期格式不正確，請再輸入一次！");
			}
		}

		String yyyy = date.substring(0, 4);
		String mm = date.substring(4, 6);
		String dd = date.substring(6, 8);

		String choice;
		while (true) {
			System.out.println("欲格式化成(1)年/月/日 (2)月/日/年 (3)日/月/年：");
			choice = sc.next();

			if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
				break;
			} else {
				System.out.println("選項錯誤，請輸入 1、2 或 3！");
			}
		}

		switch (choice) {
		case "1":
			System.out.println("年/月/日： " + yyyy + "/" + mm + "/" + dd);
			break;
		case "2":
			System.out.println("月/日/年： " + mm + "/" + dd + "/" + yyyy);
			break;
		case "3":
			System.out.println("日/月/年： " + dd + "/" + mm + "/" + yyyy);
			break;
		}

		sc.close();
	}
}

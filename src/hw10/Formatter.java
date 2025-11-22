package hw10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Formatter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;

		while (true) {
			System.out.print("請輸入數字：");
			String input = sc.nextLine();

			try {
				num = Double.parseDouble(input);
				break; 
			} catch (NumberFormatException e) {
				System.out.println("輸入格式不正確，再輸入一次！");
			}
		}
		
		String choice;
        while (true) {
    		System.out.println("欲輸入格式化成(1)千分位(2)百分比(3)科學記號");
            choice = sc.nextLine();

            if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
                break;
            } else {
                System.out.println("選項錯誤，請輸入 1、2 或 3！");
            }
        }
		
		if (choice.equals("1")) {
			DecimalFormat df1 = new DecimalFormat("#,###.##");
            System.out.println("千分位：" + df1.format(num));
		} else if (choice.equals("2")) {
			DecimalFormat df2 = new DecimalFormat("#.##%");
			System.out.println("百分比：" + df2.format(num));
		} else if (choice.equals("3")) {
			DecimalFormat df3 = new DecimalFormat("0.##E00");
			System.out.println("科學記號" + df3.format(num));
		}
		
		sc.close();
	}

}

package hw4;

import java.util.Scanner;

public class CountDay {

	public static void main(String[] args) {
		
		System.out.print("請輸入三個整數：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			daysInMonth[1] = 29;
		}
		
		if (month < 1 || month > 12) {
            System.out.println("錯誤：月份應介於 1～12！");
            return;
        }
        if (day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("錯誤：該月最多只有 " + daysInMonth[month - 1] + " 天！");
            return;
        }
		
		int daysOfYear = 0;
		for(int i = 0; i < month - 1; i++) {
			daysOfYear += daysInMonth[i];
		}
		System.out.println("輸入的日期為該年第 " + (daysOfYear + day) + " 天");
		
		
		sc.close();
	}
}

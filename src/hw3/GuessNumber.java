package hw3;

import java.util.Scanner;

public class GuessNumber {
	
	public static void main(String[] args) {
		int answer = (int)(Math.random() * 10);
		System.out.println("開始猜數字吧!");
		
		Scanner sc = new Scanner(System.in);
		int guess;
		
		do {
			guess = sc.nextInt();
			if(guess == answer) {
				System.out.println("答對了!答案就是" + answer);
				break;
			}
			else {
				System.out.println("猜錯囉");
			}
		}while(guess != answer);
		
//		do {
//			guess = sc.nextInt();
//			if(guess == answer) {
//				System.out.println("答對了!答案就是" + answer);
//				break;
//			}
//			else if(guess > answer) {
//				System.out.println(guess + "大於正確答案");
//			}
//			else if(guess < answer) {
//				System.out.println(guess + "小於正確答案");
//			}
//			else {
//				System.out.println("猜錯囉");
//			}
//		}while(guess != answer);
		
		sc.close();
		}
	}


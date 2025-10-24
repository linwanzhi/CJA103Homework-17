package hw3;

import java.util.Scanner;

public class InputDislikedNumber {
	
	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字?");
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		int count = 0;
		int lineCount = 0;
		
		for(int i = 1; i <=49; i++) {
			if (!String.valueOf(i).contains(number)) {
                System.out.print(i + "\t");
                count++;
                lineCount++;
                
                if (lineCount % 6 == 0) {
                    System.out.println();
                }
            }
		}
		System.out.println("總共有 " + count + " 數字可選");
		
		sc.close();
	}
}

package hw3;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
		System.out.println("請輸入三個整數：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a + b > c && a + c > b && b + c > a) {
      
            if (a == b && b == c) {
                System.out.println("正三角形");
            } else if (a == b || a == c || b == c) {
                System.out.println("等腰三角形");
//            } else if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)){
//            	System.out.println("直角三角形");
            }else {
                System.out.println("其它三角形");
            }
        } else {
            System.out.println("不是三角形");
        }
		sc.close();
	}

}

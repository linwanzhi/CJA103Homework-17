package hw1;

public class Rate {
	
	public static void main(String[] args) {

		double money = 1500000;
		double rate = 0.02;
		int year = 10;
		
		double amount = money * Math.pow((1 + rate), year);
		
		System.out.printf("10年後的本金加利息總額為：%.2f 元%n", amount);
	}

}

package hw2;

public class SumOfEvenNumbers {
	
	public static void main(String[] args) {
		int i, sum = 0;
		for(i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.print(sum);
	}

}

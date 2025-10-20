package hw2;

public class ContinuousProductWhile {
	
	public static void main(String[] args) {
		
		int i =1, sum = 1;
		while(i <= 10) {
			sum *= i;
			i++;
		}
		System.out.print(sum);
	}

}

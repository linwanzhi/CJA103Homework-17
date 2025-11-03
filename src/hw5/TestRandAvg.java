package hw5;

public class TestRandAvg {

	public static void main(String[] args) {
		randAvg();
	}
	
	public static void randAvg() {
		
		System.out.println("本次亂數結果：");
		
		int[] randNumbers = new int[10];
		int sum = 0;
		
		for(int i = 0; i < randNumbers.length; i++) {
			randNumbers[i] = (int)(Math.random() * 101);
			System.out.print(randNumbers[i] + " ");
			
			sum += randNumbers[i];
		}
		System.out.println();
		System.out.println((float)sum / randNumbers.length);
		
	}
}

package hw4;

public class ArrayAverage {
	public static void main(String[] args) {
		int[] intArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		double sum = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		System.out.println("平均值: " + sum/intArray.length);
		
		System.out.print("大於平均值的元素: ");
		for(int j = 1; j < intArray.length; j++) {
			if(intArray[j] > sum/intArray.length) {
				System.out.print(intArray[j] + " ");
			};
		}
	}
}

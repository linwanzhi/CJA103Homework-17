package hw10;


public class RandomNumber {
	public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100 + 1);
//			System.out.println(array[i]);
			if(isPrime(array[i])) {
				System.out.println(array[i] + "是質數");
			}
			else {
				System.out.println(array[i] + "不是質數");
			}
		}
		
	}
}

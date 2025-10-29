package hw4;

public class OppositeArray {
	
	public static void main(String[] args) {
		String s = "Hello World";
		
		char[] charArray = s.toCharArray();
//		System.out.println(charArray);
		
//		String reversed = new StringBuilder(s).reverse().toString();
		
		for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }

	}

}

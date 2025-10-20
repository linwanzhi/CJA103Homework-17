package hw2;

public class No4Number {

	public static void main(String[] args) {

		int i, count = 0;
		for(i = 1; i <=49; i++) {
			if (!String.valueOf(i).contains("4")) {
                System.out.print(i + " ");
                count++;
            }
		}
		System.out.println("\n總共有 " + count + " 個號碼可以選擇。");
	}

}

package hw2;

public class ForLetter {

	public static void main(String[] args) {
		
		int i;
		for (i = 0; i < 6; i++) {
			char letter = (char) ('A' + i); // 依序取得 A～F 的字母

			// 印出字母 i+1 次
			for (int j = 0; j <= i; j++) {
				System.out.print(letter);
			}

			System.out.println();
		}
	}

}

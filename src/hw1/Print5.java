package hw1;

public class Print5 {
	
	public static void main(String[] args) {

		 // 第一個運算式：整數加法
        System.out.println("5 + 5 = " + 5 + 5); // 結果為 10
        // 說明：兩個整數相加，直接進行數值加法運算。

        // 第二個運算式：整數加上字元
        System.out.println("5 + '5' = " + 5 + '5'); // 結果為 58
        // 說明：'5' 是字元，其 ASCII 值為 53，所以是 5 + 53 = 58

        // 第三個運算式：整數加上字串
        System.out.println("5 + \"5\" = " + 5 + "5"); // 結果為 "55"
        // 說明：整數與字串相加時，會將整數轉為字串後進行字串串接。
	}

}

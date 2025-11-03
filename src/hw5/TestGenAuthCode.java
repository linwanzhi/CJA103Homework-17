package hw5;

public class TestGenAuthCode {
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為：");
		System.out.println(genAuthCode());		
	}
	
	public static String genAuthCode() {
	    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    StringBuilder code = new StringBuilder();

	    for (int i = 0; i < 8; i++) {
	        int index = (int)(Math.random() * chars.length());
	        code.append(chars.charAt(index));
	    }
	    return code.toString();
	}
}

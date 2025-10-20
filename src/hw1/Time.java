package hw1;

public class Time {
	public static void main(String[] args) {
		
		int totalSeconds = 256559;
		int days = totalSeconds/(24*3600);
		int remainingSeconds = totalSeconds % (24 * 3600);
//		int remainingSeconds = totalSeconds - (days*24*3600);
		
        int hours = remainingSeconds / 3600;
        remainingSeconds %= 3600;

        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println(days + " 天 " + hours + " 小時 " + minutes + " 分 " + seconds + " 秒");
    
	}

}

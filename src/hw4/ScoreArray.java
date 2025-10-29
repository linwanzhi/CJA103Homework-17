package hw4;

public class ScoreArray {
	public static void main(String[] args) {
		int[][] scores = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75}
		};
		
		int students = scores[0].length; 
        int exams = scores.length;
        int[] topCount = new int[students]; 
		
		for (int i = 0; i < exams; i++) {
            int max = scores[i][0];
            // 先找出本次考試最高分
            for (int j = 1; j < students; j++) {
                if (scores[i][j] > max) {
                    max = scores[i][j];
                }
            }

            // 找出誰得到最高分
            for (int j = 0; j < students; j++) {
                if (scores[i][j] == max) {
                    topCount[j]++;
                }
            }
        }
		for (int i = 0; i < students; i++) {
            System.out.println("學生 " + (i + 1) + " 拿最高分的次數: " + topCount[i] + "次");
        }
	}
}

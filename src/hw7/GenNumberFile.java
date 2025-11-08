package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenNumberFile {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\CJA103_Workspace\\CJA103Homework-17\\src\\hw7\\Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for(int i = 0; i < 10; i++) {
				int num = (int)(Math.random() * 1000 + 1);
				pw.write(num + " ");
			}
			pw.println();
			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

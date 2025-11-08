package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestSample {
	public static void main(String[] args) {
		try {
			File file = new File("C:/CJA103_Workspace/hw_pdf/Sample.txt");
			long bytes = file.length();
            int chars = 0;
            int lines = 0;
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                lines++; // 每讀一行就 +1
                chars += line.length(); // 加總每行字元長度
            }
            br.close();
            fr.close();
            
            System.out.println("Sample.txt 檔案共有 " + bytes + " 個位元組，" + chars + " 個字元，" + lines + " 列資料");		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

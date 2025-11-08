package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFileTest {
	public CopyFileTest() {}
	
	public void copyfile(String s1, String s2) {
		File f1 = new File(s1);
		File f2 = new File(s2);
		try {
			FileReader fr1 = new FileReader(f1);
			BufferedReader br1 = new BufferedReader(fr1);
			FileWriter fr2 = new FileWriter(f2);
			BufferedWriter bw2 = new BufferedWriter(fr2);
			PrintWriter pw2 = new PrintWriter(bw2);
			int i;
			while((i = br1.read()) != -1) {
				pw2.write((char) i);
			}
			pw2.close();
			bw2.close();
			fr2.close();
			br1.close();
			fr1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		CopyFileTest f1 = new CopyFileTest();
		f1.copyfile("", "");
	}
}

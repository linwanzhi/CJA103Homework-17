package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj;
		while (true) {
			try {

				obj = ois.readObject();
				if (obj instanceof Cat) {
					((Cat) obj).speak();
				} else if (obj instanceof Dog) {
					((Dog) obj).speak();
				}

			} catch (EOFException e) {
				break;
			}
		}

		ois.close();
		fis.close();
	}
}

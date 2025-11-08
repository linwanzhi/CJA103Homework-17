package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteDogCat {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File dir = new File("C:\\data");
		 if(!dir.exists()) {
			 dir.mkdir();
         }
		Cat cat1 = new Cat("c1");
		Cat cat2 = new Cat("c2");
		Dog dog1 = new Dog("d1");
		Dog dog2 = new Dog("d2");
		
		File file = new File(dir, "Object.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cat1);
		oos.writeObject(cat2);
		oos.writeObject(dog1);
		oos.writeObject(dog2);
		oos.close();
		fos.close();
        
	}
}

package hw9;

class Person implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i <= 10; i++) {
			System.out.println(name + "吃第" + i + "碗飯");
			int rand = (int) ((Math.random() * 3000) + 500);
			try {
				Thread.sleep(rand);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了!");
	}

}

public class TwoThread {
	public static void main(String[] args) {
		System.out.println("-----大胃王快食比賽開始-----");
		Person p1 = new Person();
		Person p2 = new Person();
		Thread t1 = new Thread(p1, "饅頭人");
		Thread t2 = new Thread(p2, "詹姆士");
		t1.start();
		t2.start();

		// t1, t2兩條執行緒用join()方法，讓main執行緒等待
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----大胃王快食比賽結束！-----");

	}

}

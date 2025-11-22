package hw9;


class Account {
	private int deposit = 0; 

	synchronized public void save(int i) {
		String name = Thread.currentThread().getName();
		
		while (deposit > 3000) {
			System.out.println(name + "看到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "被熊大要求匯款!");
		}
		deposit += i;
		System.out.println(name + "存了" + i + "，帳戶共有：" + deposit);
		notify();
	}

	synchronized public void withdraw(int i) {
		String name = Thread.currentThread().getName();
		
		while (deposit < i) {
			System.out.println(name + "看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name + "被老媽告知帳戶已經有錢!");
		}
		int sum = deposit;
		sum -= i;
		System.out.println(name + "領了" + i + "，帳戶共有：" + sum);
		deposit = sum;
		if (deposit <= 1000){
			System.out.println(name + "看到餘額在1000以下，要求匯款");
			notify();
		}
	}
}

class Mom implements Runnable {
	Account account;

	public Mom(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.save(3000);
		}
	}
}

class Son implements Runnable {
	Account account;

	public Son(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.withdraw(1000);
		}
	}
}

public class TestWait {
	public static void main(String[] args) {
		Account account = new Account();
		Mom mom = new Mom(account);
		Son son = new Son(account);
		Thread t_mom = new Thread(mom, "媽媽");
		Thread t_son = new Thread(son, "熊大");
		t_mom.start();
		t_son.start();
	}
}

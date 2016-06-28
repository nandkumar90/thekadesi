package multiThreading;

import java.util.concurrent.Semaphore;

public class AlternateTwoThread {
	static Semaphore a = new Semaphore(1);
	static Semaphore b = new Semaphore(0);

	public static void main(String[] args) {
		for(int i=0;i<=10;i++){
			new Thread(new AA(a, b)).start();
			new Thread(new BB(a, b)).start();
		}

	}
}

class AA implements Runnable {
	Semaphore a = null;
	Semaphore b = null;

	public AA(Semaphore a, Semaphore b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			a.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("A");
		b.release();

	}

}

class BB implements Runnable {
	Semaphore b = null;
	Semaphore a = null;

	public BB(Semaphore a, Semaphore b) {
		// TODO Auto-generated constructor stub
		this.b = b;
		this.a = a;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			b.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("B");
		a.release();
	}
}
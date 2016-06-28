package multiThreading;

import java.util.concurrent.Semaphore;

public class PrintA implements Runnable {
	Semaphore saSemaphore;
	Semaphore sbSemaphore;
	public PrintA(Semaphore sa,Semaphore sb) {
		// TODO Auto-generated constructor stub
	this.saSemaphore=sa;
	this.sbSemaphore=sb;
	}
	@Override
	public void run() {
		
		try {
			while(true){
			saSemaphore.acquire();
			System.out.println("A");
			sbSemaphore.release();
			
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

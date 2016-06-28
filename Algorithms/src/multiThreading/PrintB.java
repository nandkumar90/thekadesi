package multiThreading;

import java.util.concurrent.Semaphore;

public class PrintB implements Runnable {
     Semaphore sbSemaphore;
     Semaphore saSemaphore;
	public PrintB(Semaphore sa,Semaphore sb) {
		// TODO Auto-generated constructor stub
	this.sbSemaphore=sa;
	this.saSemaphore=sb;
	}
	
	
	@Override
	public void run() {

		try {
			while(true){
			sbSemaphore.acquire();
			System.out.println("B");
			saSemaphore.release();}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

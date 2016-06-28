package multiThreading;

import java.util.concurrent.Semaphore;

public class AlternatePrintingAB {
	static Semaphore sa=new Semaphore(1);
    static Semaphore sb=new Semaphore(0);
	public static void main(String[] args) {
		     
		    Thread threadA = new Thread(new PrintA(sa,sb));
	        Thread threadB = new Thread(new PrintB (sa,sb));
	        threadA.start();
	        threadB.start();
	}

}




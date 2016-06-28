import java.util.concurrent.Semaphore;


public class PrintUSingTwoTHread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaphore s1=new Semaphore(1);
		Semaphore s2=new Semaphore(0);

		Thread t1=new Thread(new PrintEvenNo(s1,s2));
        Thread t2=new Thread(new PrintOddThread(s1,s2));
        t1.start();
        t2.start();
	}

}



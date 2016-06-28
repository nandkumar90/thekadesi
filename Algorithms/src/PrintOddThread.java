import java.util.concurrent.Semaphore;


public class PrintOddThread implements Runnable{
    Semaphore s2;
    int i=2;
    Semaphore s1;
	public PrintOddThread(Semaphore s1,Semaphore s2) {
		// TODO Auto-generated constructor stub
		this.s2= s2;
		this.s1=s1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
		try {
			s2.acquire();
			System.out.println(i);
			i+=2;
			s1.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

}

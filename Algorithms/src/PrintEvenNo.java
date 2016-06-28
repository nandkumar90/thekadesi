import java.util.concurrent.Semaphore;


public class PrintEvenNo implements Runnable{
    Semaphore s1;
    Semaphore s2;
    int i=1;
	public PrintEvenNo(Semaphore s1,Semaphore s2) {
		// TODO Auto-generated constructor stub
	this.s1=s1;
	this.s2=s2;
	}

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				s1.acquire();
				System.out.println(i);
				i+=2;
				s2.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
	}

}

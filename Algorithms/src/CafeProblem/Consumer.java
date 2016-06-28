package CafeProblem;

import java.util.List;

public class Consumer  implements Runnable {
	  private final List<Integer> taskQueue;
	  
	  public  Consumer(List<Integer> taskQueue) {
		  this.taskQueue=taskQueue;
	}
	   
	   
	   
	@Override
	public void run() {
		
		while(taskQueue.isEmpty())
		{
			
				try {
					consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			
			
		}
		// TODO Auto-generated method stub
		
	}
	
	
	 private void consume() throws InterruptedException
	   {
	      synchronized (taskQueue)
	      {
	         while (taskQueue.isEmpty())
	         {
	            System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
	            taskQueue.wait();
	         }
	         Thread.sleep(1000);
	         int i = (Integer) taskQueue.remove(0);
	         System.out.println("Consumed: " + i);
	         taskQueue.notifyAll();
	      }
	   }

}

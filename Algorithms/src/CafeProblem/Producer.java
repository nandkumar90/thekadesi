package CafeProblem;

import java.util.List;

public class Producer implements Runnable {
	  private final List<Integer> taskQueue;
	   private final int           MAX_CAPACITY;

	public Producer(List<Integer> taskQueue2, int mAX_CAPACITY2) {
		this.taskQueue=taskQueue2;
		this.MAX_CAPACITY=mAX_CAPACITY2;
	}

	@Override
	public void run() {
		

	      int counter = 0;
	      while (true)
	      {
	         try
	         {
	            produce(counter++);
	         }
	         catch (InterruptedException ex)
	         {
	            ex.printStackTrace();
	         }
	      }
	}
	
	
	 private void produce(int i) throws InterruptedException
	   {
	      synchronized (taskQueue)
	      {
	         while (taskQueue.size() == MAX_CAPACITY)
	         {
	            System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
	            taskQueue.wait();
	         }
	           
	         Thread.sleep(1000);
	         taskQueue.add(i);
	         System.out.println("Produced: " + i);
	         taskQueue.notifyAll();
	      }
	   }

}

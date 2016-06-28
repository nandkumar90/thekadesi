package multiThreading;

import java.util.concurrent.Callable;

class Task implements Runnable,Callable
{
    private String name;
 
    public Task(String name)
    {
        this.name = name;
    }
     
    public String getName() {
        return name;
    }
 
    @Override
    public void run()
    {
        Long duration = (long) (Math.random() * 10);
		System.out.println("Doing a task during : " + name);
		//TimeUnit.SECONDS.sleep(duration);
    }

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return "NANd";
	}
}
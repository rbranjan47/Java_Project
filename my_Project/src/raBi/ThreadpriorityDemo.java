package raBi;

class myThreads extends Thread
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}

	}
}

public class ThreadpriorityDemo 
{

	public static void main(String[] args) 
	{
		myThreads t=new myThreads();
		
		//t.setPriority(10);
		
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}

	}

}

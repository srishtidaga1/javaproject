package PracticeProject2;

public class WaitSleep {
	private static Object abc = new Object();   

	public static void main(String[] args) throws InterruptedException   {
		Thread.sleep(1000);
		System.out.println( Thread.currentThread().getName() + " Thread is woken after one second");
		
		synchronized (abc)
		{
			abc.wait(1000);
			System.out.println(abc + " Object is in waiting state and woken after 1 seconds");   
		}

	}

}

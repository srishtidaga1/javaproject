package PracticeProject1;



public class MyRunnable implements Runnable {

	public static void main(String[] args) {
		MyRunnable r =new MyRunnable();
		Thread a = new Thread(r);
		a.start();
		System.out.println("Hello world!!");
		

	}

	@Override
	public void run() {
		System.out.println("Thread is ended....");
		
		
	}

}

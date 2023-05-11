package PracticeProject1;



public class Multi extends Thread{
	public void run() {
		System.out.println("Thread is running.....");		

	}

	public static void main(String[] args) {
		Multi  m1 = new Multi();
		m1.start();
		
	}

}

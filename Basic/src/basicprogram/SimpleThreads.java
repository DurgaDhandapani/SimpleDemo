package basicprogram;

public class SimpleThreads extends Thread{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleThreads obj = new SimpleThreads();
		obj.start();
		
		System.out.println("Threads starts");

	}
	public void run() {
		System.out.println("Threads runs");

	}

}

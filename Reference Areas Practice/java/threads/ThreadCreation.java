package java.threads;

public class ThreadCreation implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread started");
		
	}
	
	public static void main(String[] args) {
		ThreadCreation tc= new ThreadCreation();
		Thread thread=new Thread(tc);
	    thread.start();
	}
}

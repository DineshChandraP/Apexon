package java.threads;

public class ThreadCreationV2 extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		ThreadCreationV2 thread = new ThreadCreationV2();
		thread.run();
		//thread.start();
	}
}

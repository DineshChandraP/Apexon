package LambdaExpressions;

public class CreatingThread {
	public static void main(String[] args) {

		Runnable myThread= ()->{
			//Thread.currentThread().setName("Dinesh Thread");
			//Thread.currentThread().setName("Dinesh Thread");
			System.out.println(Thread.currentThread().getName()+ "is running");
		};
		
		Thread thread1= new Thread(myThread);
		Thread thread2= new Thread(myThread);
		thread1.start();
		thread2.start();
	}
}

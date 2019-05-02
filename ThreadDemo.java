package Java_coding_Assignment;

public class ThreadDemo implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
		ThreadDemo t3=new ThreadDemo();

		Thread tt1=new Thread(t1);
		Thread tt2=new Thread(t2);
		Thread tt3=new Thread(t3);
		
		        tt1.start();
				tt1.run();
				//tt1.start();
				tt2.start();
				tt2.run();
				tt3.start();
				tt3.run();
				
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long threadId=Thread.currentThread().getId();
		System.out.println("Thread##"+threadId+" ->>is doing this task");
		 //logger.debug("Thread # " + threadId + " is doing this task");
	}

}

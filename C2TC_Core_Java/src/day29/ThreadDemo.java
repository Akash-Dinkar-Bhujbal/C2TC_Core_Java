package day29;

class MyThread implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
//			Thread.yield();
		}
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread m = new MyThread();
		Thread t = new Thread(m);
		t.start();
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}

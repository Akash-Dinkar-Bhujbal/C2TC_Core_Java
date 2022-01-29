package day28;

class MyThread implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m = new MyThread();
//		m.start();
//		We can not create object for Runnable Interface
//		That's why we create object for Thread class
//		and pass the object in that
		Thread t = new Thread(m);
		t.start();
//		System.out.println("***************");
//		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
//		System.out.println(Thread.currentThread().getThreadGroup().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}

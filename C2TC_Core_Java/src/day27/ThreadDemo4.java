package day27;

public class ThreadDemo4 {
	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hii");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();

		System.out.println(t1.isAlive());

		t1.join();
		t2.join();

		System.out.println(t1.isAlive());

		System.out.println("Bye");
	}
}

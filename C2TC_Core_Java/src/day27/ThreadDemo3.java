package day27;

// Lambda Expression 
public class ThreadDemo3 {
	public static void main(String[] args) {

		Runnable obj2 = new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		};

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hii");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});
		Thread t2 = new Thread(obj2);

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();

	}
}

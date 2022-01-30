package day27;

class thread1 extends Thread {
    public void run() {
        String name=Thread.currentThread().getName();
        for(int i=0;i<2;i++) {
            System.out.println(name);
           
        }
    }
}
class thread2 extends Thread {
    public void run() {
        String name=Thread.currentThread().getName();
        for(int i=0;i<2;i++) {
            System.out.println(name);
            Thread.yield();
        }
    }
}
class trial1 {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        
        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

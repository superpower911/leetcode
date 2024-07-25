/**
 * @author Zonda
 * @version 1.0
 * @description TODO
 * @2024/7/17 11:34
 */
public class luoxuanjuzhen {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread thread = new Thread(() -> {
            synchronized (lock) {
                try {
                    for (int i = 0; i < 2; i++) {
                        System.out.println("等待线程释放：" + i);
                        lock.wait(10000);
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }
        });
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("我是第二个线程");
                    lock.notify();
                }
            }
        });
        thread.start();
        thread1.start();
    }



}
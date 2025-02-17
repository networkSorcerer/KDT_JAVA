package 동기화;
// 동기화(Synchronized) : 한번에 한개의 스레드만 공유 자원에 접근 할 수 있도록,
// 락(Lock)을 걸어서 다른 스레드가 진행 중인 작업을 간섭하지 못하도록 하는 것

import static java.lang.Thread.sleep;

public class SyncMainEx {
    public static void main(String[] args) {
        ShareThread shareThread = new ShareThread();
        Thread thread1 = new Thread(() -> {
            try {
                shareThread.setValue(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread2 = new Thread(()-> {
            try {
                shareThread.setValue(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.setName("쓰레드 1");
        thread2.setName("쓰레드 2");
        thread1.start();
        thread2.start();
    }
}

class ShareThread {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void setValue(int value) throws InterruptedException {
        this.value = value;
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"의 Value 값은 " +this.value + "입니다.");
    }
}
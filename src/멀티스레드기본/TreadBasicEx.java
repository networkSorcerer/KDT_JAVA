package 멀티스레드기본;
// 멀티 스레드란? 하나의 어플리케이션 내에서 동시에 여러가지 일을 수행하는 것
// 자바는 main() 메서드 호출시 하나의 스레드가 생성됨
// 멀티스레드가 수행중인 경우 main() 스레드가 종료되더라도 어플리케이션은
// 종료되지 않음
// - 스레드 생성 방법은 Tread 클래스를 상속하는 방법 (상속 받으면 다른 상속을 받을 수 없음)
// - Runnable 인터페이스를 상속받아 구현하는 방법

public class TreadBasicEx {
    public static void main(String[] args) {
        Thread subThread1 = new CustomThread(); // Thread 를 상속 받은 객체 생성
        Runnable runTask = new CustomRunnable(); // 작업 내용은 가지고 있지만 실제 쓰레드 동작은 없음
        Thread subThread2 = new Thread(runTask); // Thread 객체 생성

        subThread1.start();
        subThread2.start();
        //System.out.println("여기는 메인 스레드가 끝나는 지점 입니다.");

        // 익명의 객체로 만드는 방법

        Runnable task = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i <= 10; i++) {
                    sum += i;
                    System.out.println(Thread.currentThread() + " : "+ sum);
                }
                System.out.println(Thread.currentThread() + "최종 합 : " + sum);
            }
        };
        Thread subThread3 = new Thread(task);
        subThread3.start();
    }
}

// Thread 클래스를 상속받음
class CustomThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i=0; i <= 10; i++) {
            sum+=i;
            System.out.println(Thread.currentThread() + " : " + sum);        }
        System.out.println(Thread.currentThread() + " 합계 : " + sum);
    }
}

//Runnable 인터페이스 구현
class CustomRunnable implements Runnable{

    @Override
    public void run() {
        int sum = 0;
        for (int i=0; i <= 10; i++) {
            sum+=i;
            System.out.println(Thread.currentThread() + " : " + sum);        }
        System.out.println(Thread.currentThread() + " 합계 : " + sum);
    }
}
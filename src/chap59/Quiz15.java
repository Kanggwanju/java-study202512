package chap59;
// 스레드, Runnable, 인터페이스, 빈칸

// Car 클래스가 Runnable 인터페이스 구현
class Car implements Runnable {
    int a;

    public void run() {
        System.out.println("message");
    }
}

public class Quiz15 {
    public static void main(String[] args) {
        // 빈칸 -> Car
        // 스레드 생성: Thread 생성자에는 Runnable 객체 필요
        // new Car()로 Runnable 객체 생성
        Thread t1 = new Thread(new Car());
        t1.start();
    }
}

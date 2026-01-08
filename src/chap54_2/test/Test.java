package chap54_2.test;

public class Test {
    
    // final 변수의 초기화
    // 아래 세가지 방법 중 반드시 한 가지 방법만 사용해서 초기화 해야함

    // 1. 선언과 동시에 초기화
    public final int VALUE1 = 10;

    // 2. static 블록에서 초기화
    public static final int VALUE2;
    static {
        VALUE2 = 20;
    }

    // 3. 생성자에서 초기화
    public final int VALUE3;
    public Test() {
        VALUE3 = 30;
    }

    // 4. 컴파일 에러! 초기화하지 않음
    // public final int VALUE4;
}

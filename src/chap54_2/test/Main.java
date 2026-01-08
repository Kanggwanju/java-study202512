package chap54_2.test;

public class Main {

    public static void main(String[] args) {

        Parent p = new Child();
        // "Parent 클래스" 출력 (오버라이딩이 아님, 메서드 숨김이 일어남)
        // static 메서드는 참조 변수의 타입을 기준으로 호출될 메서드가 결정됨
        p.showInfo();

        // 일반 인스턴스 메서드라서 오버라이딩이 적용,
        // 오버라이딩된 메서드는 실제 객체의 타입을 기준으로 실행
        p.showName();

        Child c = new Child();
        c.showInfo(); // "Child 클래스" 출력
        c.showName();

    }
}

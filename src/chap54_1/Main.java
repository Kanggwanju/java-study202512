package chap54_1;

public class Main {
    
    public static void main(String[] args) {
        Idol idol1 = new Idol("지민", "BTS");
        Idol idol2 = new Idol("태형", "BTS");
        Idol idol3 = new Idol("정국", "BTS");
        
        // static 변수는 클래스 이름, 객체 이름으로 직접 접근
        System.out.println("총 아이돌 수 : " + Idol.totalIdolCount);
        System.out.println("총 아이돌 수 : " + idol1.totalIdolCount);
        
        // static 메서드는 객체 없이도 호출 가능
        Idol.showCompanyInfo();

        // 인스턴스 메서드는 객체가 있어야 호출 가능
        idol1.perform(); // 정상 동작
        // Idol.perform(); // 컴파일 에러

    }
}

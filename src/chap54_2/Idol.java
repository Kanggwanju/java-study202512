package chap54_2;

public class Idol {

    // final 변수 (static final - 완벽한 상수)
    /*
        장점
        메모리 효율성: 모든 객체가 공유
        불변성: 값 변경 불가
        명확성: 상수임을 명확히 표현
     */
    public static final String COMPANY_NAME = "HYBE";
    public static final int MAX_GROUP_SIZE = 7;

    private final String name; // final 인스턴스 변수
    public String groupName;

    public Idol (String name, String groupName) {
        this.name = name; // 생성자에서 한 번만 설정 가능
        this.groupName = groupName;
    }

    public void showInfo() {
        System.out.println("멤버 이름: " + this.name);
        System.out.println("그룹 이름: " + this.groupName);
    }
    
    // final 메서드 - 자식 클래스에서 오버라이딩 불가
    public final void showCompanyInfo() {
        System.out.println("소속사: HYBE");
    }
}

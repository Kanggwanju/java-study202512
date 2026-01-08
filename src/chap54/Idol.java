package chap54;

public class Idol {
    // 인스턴스 변수 (각 개체마다 별도로 가짐)
    private String name;
    private String groupName;

    // static 변수 (클래스 변수) - 모든 객체가 공유
    public static int totalIdolCount;
    public static String companyName;

    public Idol(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
        // 새로운 아이돌이 생성될 때마다 카운터 증가
        totalIdolCount++;
    }

    // static 메서드 - 객체 없이도 호출 가능
    // 제약사항: 인스턴스 변수에 접근할 수 없음, 이유: 객체 생성 전에 호출 될 수 있기 때문
    public static void showCompanyInfo() {
        System.out.println("소속사: " + companyName);
        System.out.println("총 아이돌 수 : " + totalIdolCount);
    }

    // 인스턴스 메서드 - 객체가 있어야 호출 가능
    public void perform() {
        System.out.println(name + "이(가) 공연합니다!");
    }

    // static 블록 - 클래스 로딩 시 한 번만 실행
    static {
        System.out.println("Idol 클래스가 로딩되었습니다!");
        totalIdolCount = 0;
        companyName = "HYBE";
        System.out.println("초기화 완료: " + companyName);
    }
}

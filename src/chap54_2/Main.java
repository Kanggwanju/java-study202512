package chap54_2;

public class Main {

    public static void main(String[] args) {

        Idol idol = new Idol("지민", "BTS");
        idol.showInfo();
        
        // idol.name = "새이름"; // 컴파일 에러! final 필드는 변경 불가
        // Idol.COMPANY_NAME = "새소속사"; // 컴파일 에러! final 변수는 변경 불가

        idol.groupName = "새그룹"; // 정상 동작 (final이 아님)
    }
}

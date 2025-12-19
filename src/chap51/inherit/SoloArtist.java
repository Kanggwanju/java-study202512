package chap51.inherit;

// 상속의 키워드는 extends
// 하위 클래스 (sub class)
// Idol과 Is a 관계, 그룹 아이돌은 아이돌이다.
public class SoloArtist extends Idol {

    String soloSong;

    // 생성자
    public SoloArtist(String name, String soloSong) {
        // 자식 생성자 첫 줄에서만 super() 호출 가능
        super(name, "솔로");
        this.soloSong = soloSong;
        System.out.println("솔로 가수가 생성됨!");
    }

    // 단독 기능
    public void singSolo() {
        System.out.printf("%s 님이 %s 노래를 부릅니다.\n"
                , this.name, this.soloSong);
    }

    // 오버라이딩: 자식 클래스에서 부모 클래스의 메서드를 재정의
    // 매개변수, 반환 타입, 메서드명은 부모와 동일
    @Override // 컴파일러 체크
    public void perform() { // 부모 메서드의 접근 제어자 수준보다 더 넓게 설정해야 함
        System.out.println(name
            + "이(가) 솔로 무대에서 특별한 공연을 합니다.");
    }
}

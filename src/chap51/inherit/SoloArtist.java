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
}

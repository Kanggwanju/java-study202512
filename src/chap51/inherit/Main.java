package chap51.inherit;

public class Main {

    public static void main(String[] args) {
        
        // 배우 생성
        new Actor("차은우");

        // 솔로 가수 생성
        SoloArtist iu = new SoloArtist("아이유", "좋은 날");

        iu.singSolo();
        iu.introduce();
        iu.perform();

        // 그룹 가수 생성
        GroupIdol wonyoung = new GroupIdol("장원영", "아이브", 6);

        wonyoung.groupDance();
        wonyoung.introduce();
        wonyoung.perform();
    }
}

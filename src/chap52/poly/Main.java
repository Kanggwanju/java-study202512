package chap52.poly;

import chap51.inherit.*;

public class Main {

    public static void main(String[] args) {

        // 부모의 타입을 사용할 수 있음, 모든 클래스의 부모는 Object
        // 업캐스팅(자식 타입의 객체를 부모 타입의 변수에 저장, 자동으로 형변환됨
        Idol iu = new SoloArtist("아이유", "분홍신");
        Idol chaewon = new GroupIdol("김채원", "르세라핌", 5);
        Idol jongguk = new SoloArtist("김종국", "한남자");
        Idol sakura = new GroupIdol("사쿠라", "르세라핌", 5);

        Idol[] idols = {iu, chaewon, jongguk, sakura};

        for (Idol idol : idols) {
            // 동적 바인딩: 메서드가 호출 되었을 때 실제 객체의 타입을 확인하여
            //              해당 클래스의 메서드를 실행
            idol.perform();
        }

//        SoloArtist[] idols1 = {iu, jongguk, new SoloArtist("Jennie", "Mantra")};
//        for (SoloArtist soloArtist : idols1) {
//            soloArtist.perform();
//        }
//
//        GroupIdol[] idols2 = {chaewon, sakura};
//        for (GroupIdol groupIdol : idols2) {
//            groupIdol.perform();
//        }

    }
}

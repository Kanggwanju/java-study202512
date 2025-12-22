package chap52.poly;

import chap51.inherit.GroupIdol;
import chap51.inherit.Idol;
import chap51.inherit.SoloArtist;

public class Main2 {

    public static void main(String[] args) {

        Idol iu = new SoloArtist("아이유", "분홍신");
        Idol chaewon = new GroupIdol("김채원", "르세라핌", 5);

        iu.introduce();
        iu.perform();

        // 업캐스팅의 한계, 부모 타입 변수로는 자식 클래스만의 고유한 멤버에 접근 불가
        // 다운캐스팅: 부모 타입의 변수를 자식 타입으로 변환, 명시적 캐스팅 필요
        //             잘못된 타입 변환시 에러 발생 (안전하게 instanceof 사용)
        if (iu instanceof SoloArtist) {
            SoloArtist castIu = (SoloArtist) iu;
            castIu.singSolo();
        }

        System.out.println("==================");

        chaewon.introduce();
        chaewon.perform();

        if (chaewon instanceof GroupIdol) {
            GroupIdol castChaewon = (GroupIdol) chaewon;
            castChaewon.groupDance();
        }

    }
}

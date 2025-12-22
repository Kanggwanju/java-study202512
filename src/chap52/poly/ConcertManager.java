package chap52.poly;

import chap51.inherit.*;

public class ConcertManager {

    // 매개변수 다형성
    public void startConcert(Idol idol) {
        System.out.println("공연을 시작합니다!");
        idol.introduce();
        idol.perform();
        System.out.println("공연이 끝났습니다.");
    }

    // 리턴 타입 다형성
    public Idol createIdol(String idolName, String type) {
        if ("solo".equals(type)) {
            return new SoloArtist(idolName, "미정");
        } else if ("group".equals(type)) {
            return new GroupIdol(idolName, "미정", 0);
        }
        return null;
    }
}

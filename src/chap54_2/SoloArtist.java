package chap54_2;

public class SoloArtist extends Idol {

    public SoloArtist(String name, String groupName) {
        super(name, groupName);
    }

    // final 메서드는 오버라이딩 불가
    // @Override
    // public void showCompanyInfo() {} // 컴파일 에러!

}

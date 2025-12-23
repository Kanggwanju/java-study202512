package chap53.abs;

public class GroupIdol extends Idol {

    int memberCount;

    // 생성자
    public GroupIdol(String name, String groupName, int memberCount) {
        super(name, groupName);
        this.memberCount = memberCount;
    }

    // 단독 기능
    public void groupDance() {
        System.out.printf("%s의 %d명이 함께 춤을 춥니다.\n"
            , this.groupName, this.memberCount);
    }


    // 아이돌이면 반드시 자기소개 기능과 공연하기 기능이 필수
    // 반드시 구현해야 하는 추상 메서드들, 구현하지 않으면 컴파일 에러
    @Override
    public void introduce() {

    }

    @Override
    public void perform() {
        System.out.println(name
            + "이(가) 그룹 무대에서 화려한 공연을 합니다.");
    }
}

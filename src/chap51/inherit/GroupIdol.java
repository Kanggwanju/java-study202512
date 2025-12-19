package chap51.inherit;

// 상속의 키워드는 extends
// 하위 클래스 (sub class)
// Idol과 Is a 관계, 그룹 아이돌은 아이돌이다.
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

    // 오버라이딩
    @Override
    public void perform() {
        System.out.println(name
            + "이(가) 그룹 무대에서 화려한 공연을 합니다.");
    }
}

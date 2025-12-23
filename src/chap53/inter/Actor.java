package chap53.inter;

// Performer를 구현, Actor는 구현체
// 상속과 구현 동시에 가능
public class Actor implements Performer, Singer {

    // 필드
    private String name;

    // 생성자
    public Actor(String name) {
        this.name = name;
    }

    // 인터페이스들의 추상 메서드를 구현
    @Override
    public void perform() {
        System.out.println(name + "이(가) 공연합니다.");
    }

    @Override
    public void practice() {
        System.out.println(name + "이(가) 연습합니다.");
    }

    @Override
    public void sing() {
        System.out.println(name + "이(가) 노래합니다.");
    }

    @Override
    public void vocalTraining() {
        System.out.println(name + "이(가) 노래 연습을 합니다.");
    }
}

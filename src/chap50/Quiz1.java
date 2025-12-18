package chap50;

public class Quiz1 {

}

class Member {

    // 1. 정보 은닉을 위한 private
    private int age;

    public Member(int age) {
        this.age = age;
    }

    // 2. 나이 정보 조회를 위한 메서드 getAge
    public int getAge() {
        return this.age;
    }


}

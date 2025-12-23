package chap53.inter;

public class Main {

    public static void main(String[] args) {

        // 다형성
        Performer actor1 = new Actor("김종국");
        Singer actor2 = new Actor("장혁");
        Actor actor3 = new Actor("아이유");

        actor1.perform();
        actor2.sing();
        actor3.vocalTraining();
    }
}

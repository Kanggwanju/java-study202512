package chap49;

public class Quiz2 {

    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
    }
}

class Car {
    String name;
    int year;

    public Car(String name) {
        this(name, 2024);
        System.out.println("출고 완료!");
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
        System.out.println("생산 완료!");
    }
}

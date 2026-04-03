package chap57;

import java.util.ArrayList;
import java.util.List;

public class Quiz1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add(1, "Cherry"); // 1번 인덱스에 끼워넣기

        // fruits: [Apple, Cherry, Banana]
        System.out.println(fruits.get(2)); // Banana
    }
}

package chap60;

public class Quiz36 {

    public static class Collection<T> {
        T value; // 컴파일 시점에 T는 Object로 취급
        
        public Collection(T t) { value = t; }

        public void print() { new Printer().print(value); }

        class Printer {
            void print(Integer a) {
                System.out.print("A" + a);
            }
            // 가장 상위 타입인 Object 매개변수 선택,
            // 실제 값은 Integer이지만 Object로 처리
            void print(Object a) {
                System.out.print("B" + a);
            }
            void print(Number a) {
                System.out.print("C" + a);
            }
        }
    }

    public static void main(String[] args) {
        new Collection<>(0).print(); // T = Integer
        // 정답: B0
    }
}

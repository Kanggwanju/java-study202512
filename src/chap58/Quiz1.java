package chap58;

@FunctionalInterface
interface TextProcessor {
    String process(String text);
}
public class Quiz1 {
    public static void main(String[] args) {
        TextProcessor processor = (s) -> s + s;
        System.out.println(processor.process("Java"));
    }
}

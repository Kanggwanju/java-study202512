package chap49;

public class Quiz1 {
    public static void main(String[] args) {
        Book book = new Book("불편한 편의점");
    }
}

class Book {
    String title;
    Book(String title) {
        this.title = title;
        System.out.println(this.title + " 읽는 중");
    }
}
package chap48;

// 실습 퀴즈 1
public class Quiz1 {

    public static void main(String[] args) {
        Webtoon favoriteWebtoon = new Webtoon();
        favoriteWebtoon.title = "가비지타임";
        favoriteWebtoon.author = "2사장";
        favoriteWebtoon.rating = 9.5;

        // 정답: 제목: 가비지타임 (작가: 2사장)
        favoriteWebtoon.printInfo();
    }
}

class Webtoon {
    String title;
    String author;
    double rating;
    void printInfo() {
        System.out.println("제목: " + title
                + " (작가: " + author + ")");
    }
}

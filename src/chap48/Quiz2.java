package chap48;

// 실습 퀴즈 2
public class Quiz2 {

    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
        myPlaylist.owner = "케데헌";
        myPlaylist.songTitles = new String[] {
            "Golden", "Soda Pop", "Your Idol"
        };
        // 정답: Soda Pop
        System.out.println(myPlaylist.songTitles[1]);
    }
}

class Playlist {
    String owner;
    String[] songTitles; // 문자열 배열을 필드로 가짐
}

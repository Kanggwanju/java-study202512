package chap59;
// 싱글톤 패턴
class Connection {
    private static Connection _inst = null;
    private int count = 0;

    // 싱글톤 패턴, private 생성자로 외부 생성 차단
    private Connection() {}

    public static Connection get() {
        if (_inst == null) {
            _inst = new Connection();
        }
        return _inst;
    }

    public void count() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Quiz14 {

    public static void main(String[] args) {
        // conn1, conn2, conn3 모두 같은 객체
        // 최초의 Connection.get 에서 _inst에 Connection 객체 생성하여 할당
        // 이후 get은 이미 할당된 객체 가져옴.
        Connection conn1 = Connection.get();
        conn1.count();

        Connection conn2 = Connection.get();
        conn2.count();

        Connection conn3 = Connection.get();
        conn3.count();
        // count 변수를 conn1, 2, 3의 모든 객체 참조 변수가 공유함
        // 정답: 3
        System.out.println(conn3.getCount());
    }
}

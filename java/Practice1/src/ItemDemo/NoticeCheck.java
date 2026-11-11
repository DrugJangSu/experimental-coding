import java.util.ArrayList; // 여러 개를 담는 목록(ArrayList)을 쓰기 위해 가져옴

// 게시글의 설계도(클래스)
class Post {
    String title; // 글 제목을 저장하는 변수

    // 글 정보를 화면에 출력하는 기능(메서드)
    void print() {
        System.out.println("title=" + title); // 제목 출력
    }
}

// Post를 물려받는(상속) 공지글 클래스 → title, print()를 그대로 가짐
class NoticePost extends Post {
    String place; // 공지글에만 있는 장소 변수

    @Override // 부모(Post)의 print()를 내 방식으로 다시 만든다는 표시
    void print() {
        System.out.println("[공지] title=" + title); // 앞에 [공지]를 붙여서 출력
    }
}

// 프로그램을 실행하는 클래스
public class NoticeCheck {
    // 프로그램이 시작되는 곳
    public static void main(String[] args) {
        Post p1 = new Post(); // 일반 글 객체 생성
        p1.title = "exam";    // 제목 저장

        NoticePost p2 = new NoticePost(); // 공지글 객체 생성
        p2.title = "closed";              // 제목 저장
        p2.place = "hall";                // 장소 저장

        Post p3 = new Post(); // 일반 글 객체 생성
        p3.title = "quiz";    // 제목 저장

        NoticePost p4 = new NoticePost(); // 공지글 객체 생성
        p4.title = "fire drill";          // 제목 저장
        p4.place = "gym";                 // 장소 저장

        // Post를 담는 목록 만들기 (NoticePost도 Post의 자식이라 담을 수 있음)
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(p1); // 목록에 첫 번째 글 추가
        posts.add(p2); // 목록에 두 번째 글 추가
        posts.add(p3); // 목록에 세 번째 글 추가
        posts.add(p4); // 목록에 네 번째 글 추가

        // 목록의 처음부터 끝까지 한 개씩 반복
        for (int i = 0; i < posts.size(); i++) {
            Post p = posts.get(i); // i번째 글 꺼내기
            p.print();             // 출력 (실제 객체 종류에 맞는 print()가 실행됨)

            // 꺼낸 글이 공지글(NoticePost)인지 확인
            if (p instanceof NoticePost) {
                NoticePost e = (NoticePost) p; // 공지글로 형변환해야 place를 쓸 수 있음
                System.out.println("   place=" + e.place); // 장소 출력
            }
        }
    }
}

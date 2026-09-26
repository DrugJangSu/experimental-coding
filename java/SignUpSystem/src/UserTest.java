public class UserTest {
    public static void main(String[] args) {
        System.out.println(" --- 1번 회원 가입 ---");
        UserProfile user1 = new UserProfile("assassin", 25);
        user1.printUserInfo();


        System.out.println(" --- 2번 회원 가입 ---");
        UserProfile user2 = new UserProfile("hacker9999", 130);
        user2.printUserInfo();

        System.out.println(" --- 2번 회원 가입 ---");
        UserProfile user3 = new UserProfile("lol", 10);
        user3.printUserInfo();



    }
}

public class UserProfile {
    private final String userName;
    private int age;

    public UserProfile(String userName, int age) {
        this.userName = userName;
        setAge(age);
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 14) {
            System.out.println("14세 미만은 가입할 수 없습니다. 14세로 고정합니다");
            this.age = 14;
        } else if (age > 120) {
            System.out.println("입력하신 나이는 유효하지 않습니다. 120세로 고정합니다");
        } else {
           this.age = age;
        }
    }

    public void printUserInfo() {
        System.out.println("아이디 : " + userName + "| 나이 : " + age + "세");
    }
}

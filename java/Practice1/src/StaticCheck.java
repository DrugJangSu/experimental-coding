public class StaticCheck {
    public static void main(String[] args) {
        System.out.println("count=" + Student2.getCount());
        Student2 s1 = new Student2(1, "kim", "java", 90);
        Student2 s2 = new Student2(2, "lee", "db", 75);
        System.out.println("count=" + Student2.getCount());

        Student2 s3 = new Student2(3, "park", "java", 85);
        System.out.println("count=" + Student2.getCount());
    }
}

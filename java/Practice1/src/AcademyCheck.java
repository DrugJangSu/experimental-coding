public class AcademyCheck {
    public static void main(String[] args) {
        // 1. 학원 만들기 (지금 2번 줄을 여기로)
        Academy academy = new Academy();

        // 2. 학생 3명 만들고 setInfo  ← StudentCheck에서 복사 + 3번 학생 추가
        Student student1 = new Student();
        student1.setInfo(1, "kim", "java", 90);

        Student student2 = new Student();
        student2.setInfo(2, "lee", "db", 75);


        Student student3 = new Student();
        student3.setInfo(3, "park", "java", 85);

        // 3. 학원에 등록
        academy.addStudent(student1);
        academy.addStudent(student2);
        academy.addStudent(student3);

        academy.printOne(2);
        academy.printOne(9);

        System.out.println("------");
        academy.updateScore(2, 95);
        academy.updateScore(2, 150);
        academy.updateScore(9, 80);
        System.out.println("------");
        academy.printAll();
        System.out.println("------");
        academy.deleteStudent(1);
        academy.deleteStudent(9);

        System.out.println("------");
        academy.printBySubject("java");
        academy.printBySubject("db");
        academy.printBySubject("python");

        System.out.println("------");
        // 4. 전체 출력
        academy.printAll();
        academy.printOne(1);
    }
}
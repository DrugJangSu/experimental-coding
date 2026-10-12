public class RepositoryCheck {
    public static void main(String[] args) {
        StudentRepository repo = new StudentRepository();

        // 학생 3명 만들고 setInfo (AcademyCheck에서 복사)
        // repo.save(student1); 처럼 3명 저장
        Student student1 = new Student();
        student1.setInfo(1, "kim", "java", 90);

        Student student2 = new Student();
        student2.setInfo(2, "lee", "db", 75);


        Student student3 = new Student();
        student3.setInfo(3, "park", "java", 85);

        repo.save(student1);
        repo.save(student2);
        repo.save(student3);

        for (Student s : repo.findAll()) {
            s.printInfo();
        }
        System.out.println("---");
        repo.findById(2).printInfo();
        System.out.println(repo.findById(9));
        repo.deleteById(1);
        System.out.println("count=" + repo.findAll().size());
    }
}
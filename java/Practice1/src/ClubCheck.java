public class ClubCheck {
    public static void main(String[] args) {
        Club club = new Club();
        Member member1 = new Member();
        member1.setInfo(1, "amy");

        Member member2 = new Member();
        member2.setInfo(2, "ben");

        Member member3 = new Member();
        member3.setInfo(3, "cody");

        club.addNumber(member1);
        club.addNumber(member2);
        club.addNumber(member3);

        club.printAll();
        club.printOne(2);
        club.printOne(5);


    }

}

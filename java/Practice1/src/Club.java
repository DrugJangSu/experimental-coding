import java.util.ArrayList;
import java.util.HashMap;

public class Club {
    ArrayList<Member> list = new ArrayList<Member>();
    HashMap<Integer, Member> map = new HashMap<Integer, Member>();

    void addNumber(Member member) {
        list.add(member);
        map.put(member.no, member);
    }

    void printAll() {
        for (Member member : list) {
            member.printInfo();
        }
    }

    void printOne(int no) {
        if (map.containsKey(no)) {
            map.get(no).printInfo();
        } else {
            System.out.println("not found");
        }
    }

}

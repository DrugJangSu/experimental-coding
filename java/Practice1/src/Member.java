public class Member {
    int no;
    String name;

    void setInfo(int pNo, String pName) {
        no = pNo;
        name = pName;
    }

    void printInfo() {
        System.out.println("No " + no + " name: " + name);
    }

}

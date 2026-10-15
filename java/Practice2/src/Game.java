public class Game {
    private int no;
    private String name;
    private int price;

    public Game(int no, String name, int price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void printInfo() {
        System.out.println(no + " " + name + " " + price);
    }

}

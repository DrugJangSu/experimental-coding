public class Room {
    String name;
    int price;
    int fee;


    public int basic() {
        return price + fee;
    }

    public int stay(int days) {
        return (price * days) + fee;
    }
}

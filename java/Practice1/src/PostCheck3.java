public class PostCheck3 {
    public static void main(String[] args) {

        Post1 first = new Post1();
        first.title = "closed";
        first.body = "no class";

        Post1 second = new Post1();
        second.title = "exam";
        second.body = "bring id" ;

        first.print();
        second.print();

    }
}

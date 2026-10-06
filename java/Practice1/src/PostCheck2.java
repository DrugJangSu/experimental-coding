public class PostCheck2 {
    public static void main(String[] args) {
        Post1 first = new Post1();
        first.title = "closed";
        first.body = "no class";

        Post1 second = new Post1();
        second.title = "exam";
        second.body = "bring id";

        System.out.println(first.title);
        System.out.println(first.body);
        System.out.println(second.title);
        System.out.println(second.body);
    }
}

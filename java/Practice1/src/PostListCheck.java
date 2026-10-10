import java.util.ArrayList;

public class PostListCheck {
    public static void main(String[] args) {
        Post1 first = new Post1();
        first.title = "closed";
        first.body = "no class";

        Post1 second = new Post1();
        second.title = "exam";
        second.body = "bring id";

        Post1 third = new Post1();
        third.title = "lunch";
        third.body = "at noon";

        ArrayList<Post1> posts = new ArrayList<>();

        posts.add(first);
        posts.add(second);
        posts.add(third);

        for (int i = 0; i < posts.size(); i++) {
            posts.get(i).print();
        }

        System.out.println("count=" + posts.size());
    }
}

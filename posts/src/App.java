import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow, that's awesome!");

        Post p1 = new Post(
                sdf.parse("21/10/2023 13:15:03"),
                "Trip for England",
                "I'm travallig for England",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the force be with you!");

        Post p2 = new Post(
                sdf.parse("28/10/2023 22:30:55"),
                "Good night falks!",
                "See you tomorrow",
                12);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);

    }
}

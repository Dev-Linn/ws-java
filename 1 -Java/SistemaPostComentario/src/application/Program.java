package application;

import entities.Comment;
import entities.Posts;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Posts p1 = new Posts("I'm going to visit this wonderful contrty",
                        sdf.parse("21/06/2018 13:05:44"),
                        "Treveling to new zeland",
                12);

        p1.addComments(c1);
        p1.addComments(c2);
        System.out.println(p1);

    }

}


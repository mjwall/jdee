package sample;

import java.util.List;
import java.util.ArrayList;

public class ForLoopExample {

    public static void main(String[] args) {
        List<String> things = new ArrayList<String>();
        things.add("thing 1");
        things.add("thing 2");
        for(String s : things) {
            System.out.println(s);
        }

    }
}

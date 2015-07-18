package sample;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    static List strings;
    static List<String> genericStrings;

    public List makeStrings() {
        List list = new ArrayList();
        list.add("Does");
        list.add("this");
        list.add("work");
        return list;
    }

    public void printStrings(List strings) {
        for (int i=0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    public List<String> makeGenericStrings() {
        List<String> list = new ArrayList<String>();
        list.add("What");
        list.add("about");
        list.add("this");
        return list;
    }

    public void printGenericStrings(List<String> strings) {
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        System.out.println("Do something");
        GenericsExample ex = new GenericsExample();
        strings = ex.makeStrings();
        ex.printStrings(strings);
        genericStrings = ex.makeGenericStrings();
        ex.printGenericStrings(genericStrings);
    }
}

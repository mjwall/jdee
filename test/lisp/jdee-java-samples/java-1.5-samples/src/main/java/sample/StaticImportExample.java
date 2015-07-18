package sample;

import static java.lang.Math.abs;

public class StaticImportExample {

    public static void main(String[] args) {
        int a = abs(-23);
        double b = Math.random(); //no static import
        System.out.println("a :" + a + " | b: " + b);
    }
}

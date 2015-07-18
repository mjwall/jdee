package sample;

public class VarargsExample {

    public void printThis(String one, String... rest) {
        System.out.println(one);
        for(String s : rest) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        VarargsExample ex = new VarargsExample();
        ex.printThis("One", "Two", "Three");
        ex.printThis("A", "B", "C", "D", "E");
    }
}

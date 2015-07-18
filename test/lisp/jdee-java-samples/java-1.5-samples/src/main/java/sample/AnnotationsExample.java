package sample;

public class AnnotationsExample {

    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated");
    }

    public static void main (String[] args) {
        new AnnotationsExample().deprecatedMethod();
    }
}

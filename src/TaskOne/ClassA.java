package TaskOne;

public class ClassA {
    ClassA () {
        System.out.println("A");
        ClassC c = new ClassC();
    }
}
class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA ();
    }
}
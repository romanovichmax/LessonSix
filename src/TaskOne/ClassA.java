package TaskOne;

public class ClassA {
    ClassC c = new ClassC();
    ClassB b = new ClassB();

    ClassA() {
        System.out.println("A");
        c.methodC();
        b.methodB();
    }
}

class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA();
    }
}
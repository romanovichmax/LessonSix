package TaskFour;

public class Test {
    public static void main(String[] args) {
        Class_Car class_car = new Class_Car(1100, 3.5, 350);
        Class_Car class_car1 = new Class_Car(1200, 4.0, 360);
        class_car.race(class_car1);
        System.out.println(class_car.race(class_car1));

        Class_B class_b = new Class_B(1100, 3.5, 350);
        Class_B class_b1 = new Class_B(1200, 4.0, 360);
        class_b.race(class_b1);
        System.out.println(class_b.race(class_b1));
    }
}

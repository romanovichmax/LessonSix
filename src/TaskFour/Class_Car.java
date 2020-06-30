package TaskFour;

public class Class_Car {
    public int weight;
    public double acceleration;
    public int maxSpeed;

    public Class_Car(int weight, double acceleration, int maxSpeed) {
        this.weight = weight;
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
    }

    public boolean race(Class_Car anotherCar) {
        if (weight > anotherCar.weight && acceleration >= anotherCar.acceleration && maxSpeed <= anotherCar.maxSpeed) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Class_Car class_car = new Class_Car(1100, 3.5, 350);
        Class_Car class_car1 = new Class_Car(1200, 4.0, 360);
        class_car.race(class_car1);
        System.out.println(class_car.race(class_car1));
    }
}

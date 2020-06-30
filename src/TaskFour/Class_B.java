package TaskFour;

public class Class_B extends Class_Car {
    public Class_B(int weight, double acceleration, int maxSpeed) {
        super(weight, acceleration, maxSpeed);
    }

    @Override
    public boolean race(Class_Car anotherCar) {
        if (weight > anotherCar.weight && acceleration >= anotherCar.acceleration && maxSpeed <= anotherCar.maxSpeed) {
            return false;
        } else {
            return true;
        }
    }
}


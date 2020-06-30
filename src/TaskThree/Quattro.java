package TaskThree;

public class Quattro extends Audi {
    public Quattro(String name, String model) {
        super(name, model);
    }
    static Quattro quattro = new Quattro("Audi", "Quattro");

    @Override
    public void steer(int direction) {
        super.steer(direction);
        System.out.println("Direction = " + quattro.getCurrentDirection());
    }

    public static void main (String [] args){
        System.out.println(quattro.getName());
        System.out.println(quattro.getSize());
        quattro.steer(66);
        quattro.move(22, 99);
        System.out.println("Direction = " +quattro.getCurrentDirection());
        System.out.println("Velocity = " + quattro.getCurrentVelocity());
    }
}

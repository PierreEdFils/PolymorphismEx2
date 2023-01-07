// Base Class
class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car( int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;


    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car  -> startEngine()";
    }
    public String accelerate(){
        return "Car  ->  accelerate()";
        }
    public String brake(){
        return "Car  ->  brake()";
    }


}

class Mitsubishi extends  Car{
    public Mitsubishi( int cylinders, String name) {
        super( cylinders, name);
    }

    public String startEngine() {
        return  "Mitsubishi  -> startEngine()";
    }

    public String accelerate() {
        return  "Mitsubishi  -> accelerate()";
    }

    public String brake() {
        return  "Mitsubishi  -> brake()";
    }

}
class Ford extends Car {
    public Ford( int cylinders, String name) {
        super( cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}


class Honda extends Car{
    public Honda( int cylinders, String name) {
        super( cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Honda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+"-> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+"-> brake()";
    }
}



public class Main {
    public static void main(String[] args) {

        Car c = new Car(8,"Base Car");
        System.out.println(c.startEngine());
        System.out.println(c.accelerate());
        System.out.println(c.brake());

        Mitsubishi m = new Mitsubishi(6,"Outlander VRM 4WD");
        System.out.println(m.startEngine());
        System.out.println(m.accelerate());
        System.out.println(m.brake());

        Ford f= new Ford(6,"Ford Falcon");
        System.out.println(f.startEngine());
        System.out.println(f.accelerate());
        System.out.println(f.brake());

        Honda h = new Honda(6,"Accord");
        System.out.println(h.startEngine());
        System.out.println(h.accelerate());
        System.out.println(h.brake());
    }
}
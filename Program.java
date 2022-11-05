enum Type {
    UNKNOWN("This is an Unknown Vehicle"),
    MOTORCYCLE("This vehicle is a Motorcycle."),
    TRUCK("This vehicle is a Truck."),
    SEDAN("This vehicle is a Sedan."),
    SPORTS_CAR("This vehicle is a Sports Car"),
    SUV("This vehicle is a SUV"),
    COUPE("This vehicle is a Coupe");

    String desc;

    Type(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

enum Transmission {
    UNKNOWN,
    MANUAL,
    AUTOMATIC,
}

class Vehicle {

    public int speed;
    public int wheels;
    public String color;
    public String model;
    Type type;

    public Vehicle()
    {
        this.type = Type.UNKNOWN;
        this.speed = 0;
        this.wheels = 0;
        this.model = "Generic";
        this.color = "Factory Silver";
    }

    public Vehicle(int speed, int wheels, String color, String model, Type type)
    {
        this.type = type;
        this.model = model;
        this.speed = speed;
        this.wheels = wheels;
        this.color = color;
    }

    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    public String toString()
    {
        return (String.format("%s | Model is %s | Color is %s | No of wheels on vehicle: %s | Speed is %s", type.desc, model, color, wheels, speed));
    }
}

class Motorcycle extends Vehicle{

    public Motorcycle(){
        this.wheels = 2;
        this.type = Type.MOTORCYCLE;
    }
    public Motorcycle(int wheels, int speed, String color, String model) {
        this.type = Type.MOTORCYCLE;
        this.wheels = wheels;
        this.speed = speed;
        this.model = model;
        this.color = color;
    }
}

class Car extends Vehicle{
    Transmission transmission;

    public Car() {
        this.transmission = Transmission.UNKNOWN;
        this.wheels = 4;
    }
    public Car(int wheels, int speed, String color, String model, Transmission transmission) {
        this.wheels = wheels;
        this.speed = speed;
        this.model = model;
        this.color = color;
        this.transmission = transmission;
    }
}

class Program {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        System.out.println(v1.toString());
        Motorcycle m1 = new Motorcycle();
        System.out.println(m1.toString());
        Motorcycle m2 = new Motorcycle(2,4,"Black", "Kawasaki");
        System.out.println(m2.toString());
        Car c1 = new Car();
        System.out.println(c1.toString());

    }
}
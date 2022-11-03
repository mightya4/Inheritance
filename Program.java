class Vehicle {

    public int speed;
    public int wheels;
    public String color;

    public Vehicle(int speed, int wheels, String color)
    {
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
        return (String.format("Color is %s | No of wheels on vehicle: %s | Speed is %s", color, wheels, speed));
    }
}

class Program {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(0, 0, null);
        System.out.println(v1.toString());
    }
}
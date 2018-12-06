package at.ac.fh_kufstein.uebung_04;

public class Car {
    private String color;
    private int wheels;
    private double speed;

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }

    public int getWheels()
    {
        return wheels;
    }
    public void currentspeed()
    {
        System.out.println("Die Geschwindihkeit beträgt:"+speed);
    }
    public void accelerate(double deltaV)
    {
        this.speed = speed+deltaV;
    }
    public void slowdown(double deltaV)
    {
        this.speed=speed-deltaV;
    }
}




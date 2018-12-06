package at.ac.fh_kufstein.uebung_04.Classes;

import at.ac.fh_kufstein.uebung_04.Car;

public class Bike extends Car
{
    double maxSpeed;

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void accelerate(double deltaV)
    {
        if (getSpeed() + deltaV < maxSpeed)
        {
            super.accelerate(deltaV);
        }
        else if(getSpeed()+deltaV>=maxSpeed)
        {
            setSpeed(maxSpeed);
            System.out.println("Höchstgeschwindigkeit erreicht !");
        }
    }
    public void slowdown(double deltaV)
    {
        if (getSpeed() - deltaV > 0)
        {
            super.slowdown(deltaV);
        }
        else if(getSpeed()-deltaV<=0)
        {
            setSpeed(0);
            System.out.println("Das Fahrzeug steht.");
        }
    }


}


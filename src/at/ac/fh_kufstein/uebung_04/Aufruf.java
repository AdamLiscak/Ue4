package at.ac.fh_kufstein.uebung_04;

import at.ac.fh_kufstein.uebung_04.Classes.Bike;

public class Aufruf {
    public static void main(String[] args) {
Car skoda = new Car();
skoda.setColor("rot");
skoda.setSpeed(200);
skoda.setWheels(4);
skoda.accelerate(20);
skoda.currentspeed();
Bike moto = new Bike();
moto.setColor("blau");
moto.setWheels(2);
moto.setSpeed(20);
moto.setMaxSpeed(40);
moto.accelerate(20);
moto.currentspeed();
Bike roto = new Bike();
roto.setSpeed(20);
roto.slowdown(20);
roto.currentspeed();
    }
}

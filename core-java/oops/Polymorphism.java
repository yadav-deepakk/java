package oops;

public class Polymorphism {

  public static void main(String[] args) {

    Vehicle vehicle = new Vehicle();
    Car car = new Car();
    vehicle.start();
    car.start();

  }

}

class Vehicle {
  private int speed;

  public void start() {
    System.out.println("Vehicle is starting!");
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

}

class Car extends Vehicle {

  @Override
  public void start() {
    System.out.println("Car is starting..");
  }

}

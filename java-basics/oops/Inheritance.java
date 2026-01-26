package oops;

class Vehicle {
  private Double speed;

  public void start() {
    System.out.println("Vehicle is starting...");
  }

  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }
}

class Car extends Vehicle {
}

public class Inheritance {
  public static void main(String[] args) {
    Car car = new Car();
    car.start();
  }
}

package Blatt4.Aufgabe9;

import java.util.List;
enum Color {
    Red, Green, Blue, Yellow;
}
class Engine {
    private int ps = 70;
    public void start () { System.out.println("Engine started");
    }
    public int getPs () { return ps;
    } }
class Car { private String brand; private String model; private Color color; private Engine engine;
    public Car(String brand , String model , Color color) { this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = new Engine(); }
    public String getCarDetails () {
        return "Brand: " + brand + ", Model: " + model + ", Color: " + color;
    } }
class Garage { private List<Car> cars; private int slotsTotal;
    public Garage(int slotsTotal) { this.slotsTotal = slotsTotal;
    }
    public void parkCar(Car car) { if (freeSlots() > 0) {
        cars.add(car); } else {
        System.out.println("The garage is full"); }
    }
    public int freeSlots () {
        return slotsTotal - cars.size();
    } }
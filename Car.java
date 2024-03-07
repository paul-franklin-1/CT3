import java.util.ArrayList;

class Car {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
    public int serialNumber = 0;

    public Car(){};

    public Car(String make, String model, String color, int year, int mileage, int serialNumber) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.serialNumber = ++serialNumber;
    }}
public class CarInventory {
    private ArrayList<Car> inventory;
    private int serialNumber = 0;

    public CarInventory() {
        inventory = new ArrayList<>();
    }
    public void addCar(Car car) {
        inventory.add(car);
    }}











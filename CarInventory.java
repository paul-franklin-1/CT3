import java.util.ArrayList;

public class CarInventory {
    int serialNumber;
    private ArrayList<Car> inventory;

    public CarInventory() {
        inventory = new ArrayList<>();
    }
    public void addCar(Car car) {
        inventory.add(car);

    public void removeCar(Car car);
        inventory.remove(serialNumber);

    public void updateCar(Car car);
        inventory.replaceAll(serialNumber);

    public String getCarInfo(Car car)
        return inventory[serialNumber];

    public String printCars();
        for(int i = 0;i<inventory.size();i++){
            System.out.println(inventory[i]);
        }
    }}




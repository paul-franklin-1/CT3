import java.util.*;

public class autoInventory {

    private List<Car> allCars;

    public autoInventory() {
        allCars = new ArrayList<>();
    }

    public void addCar(Car car) {
        allCars.add(car);
    }

    public List<Car> getCars() {
        return allCars;
    }

    public void removeProduct(int index) {
        allCars.remove(index);
    }

    public static void main(String[] args) {
        autoInventory inventory = new autoInventory();

        // Add some products to the inventory.
        inventory.addCar(new Car("12345", "Product 1", 10.00));
        inventory.addCar(new Car("67890", "Product 2", 20.00));

        // Get the list of products in the inventory.
        List<Car> products = inventory.getCars();

        // Print the list of products to the console.
        for (Car product : products) {
            System.out.println(product.toString());
        }
    }
}

class Car {

    private String autoMake;
    private String autoModel;
    private String autoColor;
    private int autoYear;

    public Car(String autoMake, String autoModel, String autoColor, int autoYear) {
        this.autoMake = autoMake;
        this.autoModel = autoModel;
        this.autoColor = autoColor;
        this.autoYear = autoYear;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}







import java.awt.desktop.QuitEvent;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int optionChoice;
        boolean loopVariable = true;
        while(loopVariable){
            System.out.println("Choose option: \n 1. Add new car \n 2. Remove car \n 3. Update car info \n Get car information \n Display all cars \n Quit");
            optionChoice = scnr.nextInt();
            switch (optionChoice) {
                case 1:
                    CarInventory inventory = new CarInventory();
                    System.out.print("Enter make: ");
                    String make = scnr.next();
                    System.out.print("Enter model: ");
                    String model = scnr.next();
                    System.out.print("Enter color: ");
                    String color = scnr.next();
                    System.out.print("Enter year: ");
                    int year = scnr.nextInt();
                    System.out.println("Enter mileage: ");
                    int mileage = scnr.nextInt();
                    System.out.println("Enter serial number: ");
                    int serialNumber = scnr.nextInt();
                    inventory.addCar(new Car(make, model, color, year, mileage, serialNumber));
                    break;
                case 2:
                    System.out.println("Enter serial number: ");
                    serialNumber = scnr.nextInt();
                    inventory.removeCar(serialNumber);
                    break;
                case 3:
                    System.out.println("Enter serial number: ");
                    serialNumber = scnr.nextInt();
                    inventory.updateCar(serialNumber);
                    break;
                case 4:
                    System.out.println("Enter serial number: ");
                    serialNumber = scnr.nextInt();
                    inventory.getCarInfo(serialNumber);
                    break;
                case 5:
                    inventory.printCars()
                case 6:
                    loopVariable = false;
                    break;
                default:
                    System.out.println("Invalid entry. Please try again");
                    break;
            }

        }
        System.out.println("Goodbye.");
    }}

import java.awt.desktop.QuitEvent;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int optionChoice;
        boolean loopVariable = true;
        while(loopVariable){
            System.out.println("Choose option: \n 1. Add new car \n 2. Remove car \n 3. Update car info \n Get car information");
            optionChoice = scnr.nextInt();
            switch (optionChoice) {
                case 1:
                    addcar;
                    break;
                case 2:
                    remove car;
                    break;
                case 3:
                    update car info
                    break;
                case 4:
                    Get car information
                    break;
                case 5:
                    display entire inventory
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

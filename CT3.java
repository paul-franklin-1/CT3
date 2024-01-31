import java.util.Scanner;

public class CT3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter weekly income:");
        int weeklyIncome = scnr.nextInt();
        if (weeklyIncome < 500) {
            System.out.print("This person has a 10% tax rate.");
        }else if (weeklyIncome >= 500 && weeklyIncome<1500) {
            System.out.print("This person has a 15% tax rate.");
        }else if (weeklyIncome>=1500 && weeklyIncome<2500 )  {
            System.out.print("This person has a 20% tax rate.");
        }else{
            System.out.print("This person has a 30 percen tax rate.");
        }

}}

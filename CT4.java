import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Float.sum;
import static java.lang.Math.min;

public class CT4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        List listInvestments = new ArrayList();
        int i = 0;
        float g = 0;
        float newInvestment = 1.0f;
        System.out.println("Decimal places are optional when entering investment amounts.\n");
        while(i<=9){
            System.out.println("Enter numeric value of Investment #" + (i+1) + ": ");
            newInvestment = scnr.nextFloat();
            listInvestments.add(newInvestment);
            g = g + newInvestment;
            i++;
        }
        int countInvestments = listInvestments.size();
        float sumInvestments = g;
        float meanInvestments = sumInvestments / countInvestments;
        Collections.sort(listInvestments);
        float minInvestment = (float) listInvestments.get(0);
        float maxInvestment = (float) listInvestments.get(9);
        float interestInvestment = (float) (sumInvestments * .2);

        System.out.println("Number of investments: " + countInvestments);
        System.out.println("Sum of investments: " + sumInvestments);
        System.out.println("Average investment: " + meanInvestments);
        System.out.println("Minimum investment: " + minInvestment);
        System.out.println("Maximum investment: " + maxInvestment);
        System.out.println("20% interest from investments: " + interestInvestment);
        System.out.println("Have a nice day!");
    }}





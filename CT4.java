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
        System.out.println();
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
        System.out.print("Your investments: ");
        int p = 0;
        while (p<10){
            float invest =  (float) listInvestments.get(0);
            System.out.print(String.format("$%.2f, ", invest));
            ++p;
        }


        String str1 = String.format("Number of investments: %d\n",countInvestments);
        String str2 = String.format("Sum of investments: $%.2f\n", sumInvestments);
        String str3 = String.format("Average investment: $%.2f\n",meanInvestments);
        String str4 = String.format("Minimum investment: $%.2f\n",minInvestment);
        String str5 = String.format("Maximum investment: $%.2f\n",maxInvestment);
        String str6 = String.format("Interest (at 20%%) from investments: $%.2f\n", interestInvestment);

        System.out.println(str1  + str2 + str3 + str4 + str5 + str6);
        System.out.println("Have a nice day!");
    }
}





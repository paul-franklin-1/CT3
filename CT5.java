import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;
import java.util.stream.DoubleStream;

public class CT5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] monthlyAvgUSA = new double[12];
        String[] months2022 = new String[12];

        //add monthly temperature averages (USA, 2022) to new array
        monthlyAvgUSA[0] = 35.13;
        monthlyAvgUSA[1] = 36.52;
        monthlyAvgUSA[2] = 44.08;
        monthlyAvgUSA[3] = 50.65;
        monthlyAvgUSA[4] = 61.88;
        monthlyAvgUSA[5] = 70.79;
        monthlyAvgUSA[6] = 76.41;
        monthlyAvgUSA[7] = 74.59;
        monthlyAvgUSA[8] = 68.02;
        monthlyAvgUSA[9] = 55.26;
        monthlyAvgUSA[10] = 40.89;
        monthlyAvgUSA[11] = 33.06;

        //add month strings to new array
        months2022[0] = "January";
        months2022[1] = "February";
        months2022[2] = "March";
        months2022[3] = "April";
        months2022[4] = "May";
        months2022[5] = "June";
        months2022[6] = "July";
        months2022[7] = "August";
        months2022[8] = "September";
        months2022[9] = "October";
        months2022[10] = "November";
        months2022[11] = "December";

        //Calculate the sum, count, average, min and max from the above temperature array
        DoubleStream stream = DoubleStream.of(monthlyAvgUSA);
        DoubleStream stream2 = DoubleStream.of(monthlyAvgUSA);
        double sumAvg = stream.sum();
        double countAvg = stream2.count();
        double annualAvg = sumAvg / countAvg;
        double[] monthlyAvgUSACopy = monthlyAvgUSA.clone();
        Arrays.sort(monthlyAvgUSACopy);
        double annualMin = monthlyAvgUSACopy[0];
        double annualMax = monthlyAvgUSACopy[11];

        //user enters month by typing month's name, program outputs temp avg for that month as a double
        System.out.println("For country USA in year 2022, please enter month to get average nationwide temperature " +
                "for that month\nTo exit, enter \"Exit\"");
        String userMonth = scnr.nextLine();
        while (!(userMonth.equals("Exit"))){
        if (userMonth.equals("year") || userMonth.equals("Year")){
            System.out.println("Annual Average 2022: " + annualAvg + " degrees F");
            System.out.println("Maximum Average Temperature: " + annualMax + "degrees F, " +  months2022[11]);
            System.out.println("Minimum Average Temperature: " + annualMin + "degrees F, " +  months2022[0]);
            for(int i=0; i<12; ++i){
                System.out.print(monthlyAvgUSA[i] + " degrees F, " + months2022[i]);}}
        else if (userMonth.equals("January") || userMonth.equals("February") || userMonth.equals("March") || userMonth.equals("April")
                    || userMonth.equals("May") || userMonth.equals("June") || userMonth.equals("July") || userMonth.equals("August")
                    || userMonth.equals("September") || userMonth.equals("October")
                    ||userMonth.equals("November") || userMonth.equals("December")){
            int monthIndex = Arrays.asList(months2022).lastIndexOf(userMonth);
            double monthTemp = monthlyAvgUSA[monthIndex];
            System.out.println("Average temperature for " + userMonth + ": " + monthTemp);
            continue;}
        else{ System.out.println("Error, please try again");
            continue;}}
        System.out.print("Goodbye");
    }}
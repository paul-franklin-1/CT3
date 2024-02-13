import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;
import java.util.stream.DoubleStream;

public class CT5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] monthlyAvgUSA = new double[12];
        String[] months2022 = new String[12];

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

        DoubleStream stream = DoubleStream.of(monthlyAvgUSA);
        DoubleStream stream2 = DoubleStream.of(monthlyAvgUSA);
        double sumAvg = stream.sum();
        double countAvg = stream2.count();
        double annualAvg = sumAvg / countAvg;
        double[] monthlyAvgUSACopy = monthlyAvgUSA.clone();
        Arrays.sort(monthlyAvgUSACopy);
        double annualMax = monthlyAvgUSACopy[0];
        double annualMin = monthlyAvgUSACopy[11];
        //System.out.println(sumAvg + " " + countAvg + " " + annualAvg + " " + annualMax + " " + annualMin);
        System.out.println("For country USA in year 2022, please enter month to get average nationwide temperature for that month:");
        String userMonth = scnr.nextLine();
        int monthIndex = Arrays.asList(months2022).lastIndexOf(userMonth);
        double monthTemp = monthlyAvgUSA[monthIndex];
        System.out.println("Average temperature for " + userMonth + ": " + monthTemp);
    }}
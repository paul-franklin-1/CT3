import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CT4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        List listGPA = new ArrayList();
        int i = 0;
        float gradePointAvg = 1.00f;
        while(i<=9){
            System.out.println("Enter GPA " + (i+1) + " with two decimal places" );
            gradePointAvg = scnr.nextFloat();
            listGPA.add(gradePointAvg);
            i++;
        }
        System.out.println(listGPA);


    }
}
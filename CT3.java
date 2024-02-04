import java.util.Scanner;
public class CT3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputMonth;
        int inputDay;

        System.out.println("Enter the month:");
        inputMonth = scnr.nextLine();
        System.out.println("Enter the day:");
        inputDay = scnr.nextInt();
        int season;

        if ((inputDay > 31) || (inputDay < 1)){
            season = 5;}
        else if ((inputMonth.equals("July")) || (inputMonth.equals("August"))){
            season = 3;}
        else if ((inputMonth.equals("October")) || (inputMonth.equals("November"))){
            season = 4;}
        else if ((inputMonth.equals("January")) || (inputMonth.equals("February"))){
            season = 1;}
        else if ((inputMonth.equals("April")) || (inputMonth.equals("May"))){
            season = 2;}
        else if (inputMonth.equals("March")){
            if (inputDay>=20 && inputDay<32){
                season = 2;}
            else{
                season = 1;}}
        else if (inputMonth.equals("June")){
            if (inputDay >= 21 && inputDay<32){
                season = 3;}
            else{
                season = 2;}}
        else if (inputMonth.equals("September")){
            if ((inputDay >= 22) && (inputDay < 32)){
                season = 4;}
            else{
                season = 3;}}
        else if (inputMonth.equals("December")){
            if ((inputDay >= 20) && (inputDay < 32)){
                season = 1;}
            else{
                season = 4;}}
        else{
            season = 5;}

switch (season){
    case 1: System.out.println("Season: Winter");
        break;
    case 2: System.out.println("Season: Spring");
        break;
    case 3: System.out.println("Season: Summer");
        break;
    case 4: System.out.println("Season: Autumn");
        break;
    default: System.out.println("Error: Invalid Entry");
        break;

}



    }
}
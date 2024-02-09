import java.util.Scanner;
public class discussion {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String rawElGuerroujTime = "3:47.13";
        float elGuerroujMinutes = Float.parseFloat(rawElGuerroujTime.substring(0, 1));
        float elGuerroujMinutesMilli = Float.parseFloat(rawElGuerroujTime.substring(2, 7));
        float elGuerroujSecondsMilli = (elGuerroujMinutes * 60) + elGuerroujMinutesMilli;
        int elGuerroujRecord = (int) elGuerroujSecondsMilli;

        System.out.println("\nThe world record for the mile is held by Hicham El Guerrouj at 3:43.13.\n" +
                "\nEnter your personal best mile time in minutes, seconds, and milliseconds, using the \":\" and \".\" symbol, respectively, like \"4:15.46\":");
        String personalBestMileTime = scnr.nextLine();
        float personalBestMinutes = Float.parseFloat(personalBestMileTime.substring(0, 1));
        float personalBestMinutesMilli = Float.parseFloat(personalBestMileTime.substring(2, 6));
        float personalBestSecondsMilli = (personalBestMinutes * 60) + personalBestMinutesMilli;
        int personalBest = (int) (personalBestSecondsMilli);
        if (personalBest >= elGuerroujRecord) {
            System.out.println("Your time of " + personalBestMileTime + " is not faster than the world record. " +
                    "It's time to start training...");
        } else {
            System.out.print("Your time is faster than the world record! Time to retire.");
            System.exit(0);
        }
        int monthCount = 0;

        while ((monthCount < 3) && (personalBest >= elGuerroujRecord)) {
            monthCount++;
            System.out.println("Training and race complete for month " + monthCount + "?\nEnter 1 for Yes, 2 for No:");
            int trainingBinary = scnr.nextInt();
            if (trainingBinary == 1) {
                System.out.println("Enter this month's race time:");
                String rawNewRaceTime = scnr.next();
                float rawNewRaceMinutes = Float.parseFloat(rawNewRaceTime.substring(0, 1));
                float rawNewRaceMinutesMilli = Float.parseFloat(rawNewRaceTime.substring(2, 6));
                int convertNewRaceTime = (int) (rawNewRaceMinutes * 60) + (int) (rawNewRaceMinutesMilli);
                if (convertNewRaceTime >= elGuerroujRecord) {
                    System.out.println("Your new time did not break the record. Proceeding to month " + (monthCount+1) + "...");
                }
                else {
                    System.out.print("You broke the record! Congratulations! Time to retire.");
                    break;}}
            else if (trainingBinary == 2){
                System.out.println("You have quit your pursuit of your goal. Enjoy your retirement!");
                  break;}}
        System.out.print("You have reached your 3 month time limit. Time to retire.");
    }





    }
import java.util.Scanner;

public class exercise_from_zybook {
    public static void main (String [] args) {
    String meters100 [][] = {{"Thompson-Herah, Elaine", "Gold"}, {"Fraser-Pryce, Shelly-Ann",
"Silver"}, {"Jackson, Shericka", "Bronze"}};
        for(int i =0; i<3; ++i) {
            int z;
            for (z = 0; z < 2;++z){
                if (z == 0) {
                    System.out.print(meters100[i][z] + ": ");}
                else{
                        System.out.print(meters100[i][z] + "\n");
                    }
                }
            }
        }}


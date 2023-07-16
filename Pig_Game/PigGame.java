import java.util.Scanner;
import java.util.Random;

public class PigGame {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int target = 30;
        String rollHold = "r";
        int die;
        int totalscore = 0;
        int turns = 0;

        while (totalscore < target){
            turns++;
            int score=0;
            System.out.println("\nTURN " + turns);
            rollHold = "r"; 

            while (rollHold.equalsIgnoreCase("r")){

                if ((totalscore + score) >= target){
                    totalscore = totalscore + score;
                    System.out.println("Score for turn: " + score);
                    System.out.println("Total Score: " + totalscore);
                    System.out.println("YOU FINISHED IN " + turns + " TURNS");
                    break;
                } 

                System.out.print("Roll or Hold? (r/h): ");
                rollHold = sc.next();

                if (rollHold.equalsIgnoreCase("h")){
                    totalscore = totalscore + score;
                    System.out.println("Score for turn: " + score);
                    System.out.println("Total Score: " + totalscore);
                    break;
                }

                die = random.nextInt(6) + 1;
                System.out.print("Die: " + die + "\t\t");
                if (die==1){
                    score = 0;
                    System.out.println("Turn Over. No Score.");
                    break;
                }
                score = score + die;
                System.out.println("Score: " + score);
            }
        }

    }
}
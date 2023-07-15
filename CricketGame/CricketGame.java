import java.util.Scanner;
import java.util.Random;

public class CricketGame {

	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            Random random = new Random();
            
        while (decision==1){
            
            int randomNum;

            int pointOne = 1;
            int scoreOne = 0;

            int pointTwo = 1;
            int scoreTwo = 0;

            int roundOne = 0;
            int roundTwo = 0;

        
            System.out.print("Enter 1st player name: ");
            String playerOne = sc.next();
            System.out.print("Enter 2nd player name: ");
            String playerTwo = sc.next();

            System.out.print("\nPlayer: " +  playerOne + "\n");
            while (pointOne != 0){
                roundOne ++;
                System.out.print("Enter 1 to open a Book: ");
                int bookdec = sc.nextInt();
                if (bookdec==1){
                    randomNum = random.nextInt(300);
                    System.out.print("Page no. " + randomNum + "\t\t");
                    pointOne = randomNum % 7;
                    System.out.print("Points: " + pointOne + "\t\t");
                    scoreOne = scoreOne + pointOne;
                    System.out.print("Score: " + scoreOne + "\t\t");
                    System.out.print("\n************************************\n");
                }
            }

            System.out.println( playerOne + " Total score: " + scoreOne);
            System.out.println( playerOne + " Rounds " + roundOne + "\n");

            System.out.println("********************************************\n");

            System.out.print("Player: " +  playerTwo + "\n");
            for (roundTwo=0; roundTwo<roundOne; roundTwo++){
                System.out.print("Enter 1 to open a Book: ");
                int bookdec = sc.nextInt();
                if (bookdec==1){
                    randomNum = random.nextInt(300);
                    System.out.print("Page no. " + randomNum + "\t\t");
                    pointTwo = randomNum % 7;
                    System.out.print("Points: " + pointTwo + "\t\t");
                    scoreTwo = scoreTwo + pointTwo;
                    System.out.print("Score: " + scoreTwo + "\t\t");
                    System.out.print("\n************************************\n");
                    if (pointTwo==0 || scoreTwo>=scoreOne){
                        break;
                    }
                }
            }

            System.out.println( playerTwo + " Total score: " + scoreTwo);
            System.out.println( playerTwo + " Rounds " + (roundTwo) + "\n");

            System.out.println("********************************************\n");

            if (scoreOne > scoreTwo){
                System.out.println(playerOne + " wins :)");
            } else if (scoreTwo > scoreOne){
                System.out.println(playerTwo + " wins :)");
            } else if (scoreOne == scoreTwo){
                if (roundTwo < roundOne){
                    System.out.println(playerTwo + " wins :)");
                } else if (roundOne < roundTwo){
                    System.out.println(playerOne + " wins :)");
                }
                else {
                    System.out.println(playerOne + " and " + playerTwo + " tie :|");
                }
            }
        }

    }
    

}

import java.util.Scanner;

class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number = sc.nextInt();
        int answer = 1;
        if (number==0){
            answer=1;
        } else if (number>0){
            for (int i=1;i<=number;i++){
                answer = answer * i;
            }
        } else {
            System.out.println("Invalid Input!");
        }
        System.out.println(answer);
    }
}
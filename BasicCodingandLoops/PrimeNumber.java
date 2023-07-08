import java.util.Scanner;

class PrimeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int number = sc.nextInt();
        int x = 0;
        for (int i=2;i<=number/2;i++){
            if (number%i==0){
                x = 1;
                break;
            }
        }
        if (x==0){
            System.out.println("This is prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }
}
import java.util.Scanner;

class Fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = sc.nextInt();
        int number = 0;
        int previous = 0;
        int current = 1;

        System.out.println("Fibonacci Series is:- ");
        for (int i=1;i<=n;i++){
            number = previous + current;
            System.out.println(current);
            previous = current;
            current = number;
        }
    }
}
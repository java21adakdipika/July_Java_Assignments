import java.util.Scanner;

class RideBill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int dollar = 0;

        System.out.print("Enter your height(in cm):- ");
        int height = sc.nextInt();

        if (height <= 120){
            System.out.println("Can't Ride.");
        }
        else if (height > 120){
            System.out.println("Can Ride.");
            System.out.print("Enter Age:- ");
            int age = sc.nextInt();

            if (age<12){
                dollar = dollar + 5;
            }
            else if (age>=12 && age<18){
                dollar = dollar + 7;
            } 
            else if (age>=18 && age<45) {
                dollar = dollar + 12;
            }
            else {
                dollar = 0;
            }

            System.out.print("Want Photos? Yes or No?:- ");
            String photo = sc.next();

            if (photo.equalsIgnoreCase("no")){
                System.out.println("The Total Bill is " + dollar);
            } else if (photo.equalsIgnoreCase("yes")){
                dollar = dollar + 3;
                System.out.println("The Total Bill is " + dollar);
            }
        } else {
            System.out.println("Invalid Output");
        }
    }
}
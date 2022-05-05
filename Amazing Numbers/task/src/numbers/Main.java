package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        write your code here
        System.out.println("Enter a natural number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input < 1){
            System.out.println("This number is not natural!");
            return;
        }

        if(input % 2 == 0)
            System.out.println("This number is Even");
        else
            System.out.print("This number is Odd");

        if(input % 7 == 0){
            if((input - 7) % 10 == 0 ) {
                System.out.println("It is a Buzz number");
                System.out.println("Explanation: " + input + " is divisible by 7 and ends with 7");
        }
            else {
            System.out.println("It is a Buzz number");
            System.out.println("Explanation: " + input + " is divisible by 7");
        }}else{
            if((input - 7) % 10 == 0 ){
                System.out.println("It is a Buzz number");
                System.out.println("Explanation: " + input + " ends with 7");
            }else{
                System.out.println("It is not a Buzz number");
                System.out.println("Explanation: " + input + " is neither divisible by 7 nor does it end with 7");
            }
        }

    }
}

package ex_11_While;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();

        int factorial = 1;
        if(number<=0){
            System.out.println(factorial);
        }
        else{
            for(int i=1; i<number; i++){
                factorial=factorial* i;
            }
        }

        System.out.println("The factorial of "+number+" is "+factorial);
    }
}

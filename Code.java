import java.util.Scanner;
public class Divisor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number:");
        int num = input.nextInt();
        System.out.print("The divisor of "+ num +" is: ");

        for(int i=1;i<num;i++) {

            if (num % i == 0) {
                System.out.print(i+" ");
            }
        }

    }

}

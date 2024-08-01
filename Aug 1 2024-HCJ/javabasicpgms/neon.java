import java.util.Scanner;

public class neon {
    public static void main(String[] args) {
        int num, multi, sum = 0, div, origNum;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number:");
        num = scn.nextInt();

        origNum = num;

        multi = num * num; // Calculate the square of the number

        while (multi > 0) {
            div = multi % 10; // Get the last digit
            sum = sum + div;  // Add it to the sum
            multi = multi / 10; // Remove the last digit
        }

        if (origNum == sum) {
            System.out.println(origNum + " is a neon number");
        } else {
            System.out.println(origNum + " is not a neon number");
        }

        scn.close();
    }
}

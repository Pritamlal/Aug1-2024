import java.util.Scanner;

public class orefunc {
    public static String OddorEven(int num){
        if(num%2==0){
            return "Even Number";
        }
        else{
            return "Odd Number";
        }
    }


    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number::");
        num = s.nextInt();

        System.out.println("The number is: " + OddorEven(num));
        s.close(); // Close the Scanner
    }
}
import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        int num1,num2,temp;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number::");
        num1 = s.nextInt();

        System.out.println("Enter the number::");
        num2 = s.nextInt();

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("The num1 is: " +num1);
        System.out.println("The num2 is: " +num2);
    }
}

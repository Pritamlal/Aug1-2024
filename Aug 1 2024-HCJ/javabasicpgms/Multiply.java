import java.util.Scanner;

public class Multiply {
    public static void main(String[] args){
        int num1,num2;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number1:");
        num1 = s.nextInt();

        System.out.println("Enter the number2");
        num2 = s.nextInt();

        int res = num1 * num2 ;

        System.out.println("The result is:" +res);
    }
}

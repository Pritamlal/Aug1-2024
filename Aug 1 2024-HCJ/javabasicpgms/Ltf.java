import java.util.Scanner;

public class Ltf {
    public static int largest(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            return num1;
        }
        else if(num2>num1 && num2>num3){
            return num2;
        }
        else{
            return num3;
        }
    }

    public static void main(String [] args){
        int num1,num2,num3;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter num1,num2,num3:");
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();

        System.out.println("This is largest:" +largest(num1,num2,num3));

    }
}

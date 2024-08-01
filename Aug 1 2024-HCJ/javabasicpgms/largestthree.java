import java.util.Scanner;

public class largestthree {
    public static void main(String[] args){
    int num1,num2,num3;

    Scanner s = new Scanner(System.in);

    System.out.println("Enter the number1:");
    num1 = s.nextInt();

    System.out.println("Enter the number2:");
    num2 = s.nextInt();

    System.out.println("Enter the number3:");
    num3 = s.nextInt();

    if(num1>num2 && num2>num3){
        System.out.println("The num1 is greater:"+num1);
    }
    else if(num2>num1 && num2>num3){
        System.out.println("The num2 is greater:"+num2);
    }
    else{
        System.out.println("The num3 is greater:"+num3);
    }

    }
}

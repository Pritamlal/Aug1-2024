import java.util.Scanner;

public class leapyear {
    public static void main (String[] args){
    int num;

    Scanner s = new Scanner(System.in);

    System.out.println("Enter the number::");
    num = s.nextInt();

    if((num%400==0) || ((num%4==0) && (num%100!=0))){
        System.out.println("Leap Year");
    }
    else{
        System.out.println("Not a Leap Year");
    }

    }
}

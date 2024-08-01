import java.util.Scanner;

public class ore {
    public static void main(String[] args){
    int num;

    Scanner s = new Scanner(System.in);

    System.out.println("Enter the number::");

    num = s.nextInt();

    if(num%2==0){
        System.out.println("It is even");
    }
    else{
        System.out.println("It is odd");
    }
}
}

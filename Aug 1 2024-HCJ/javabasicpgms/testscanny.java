import java.util.Scanner;

public class testscanny {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("The entered String is: " +s);

        int a = in.nextInt();
        System.out.println("The entered Integer is: " +a);

        float b =in.nextFloat();
        System.out.println("The entered float is: " +b);
    }
}

import java.util.Scanner;

public class readnumb{
    public static void main(String[] args){
        int num;

        System.out.println("Enter the number::");

        Scanner s = new Scanner(System.in);

        num=s.nextInt();

        System.out.println("The Entered Integer:"+num);
    }
}
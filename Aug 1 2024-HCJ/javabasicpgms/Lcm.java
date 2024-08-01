import java.util.Scanner;

public class Lcm {
    public static void main(String[] args){
        int a,b,ans;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number1:");
        a = s.nextInt();

        System.out.println("Enter the number::");
        b = s.nextInt();

        ans = (a > b)? a : b;

        while(true){
            if(ans % a == 0 && ans % b ==0)
                break;
            ans++;
            }
        
        System.out.println("LCM of" +a + " and " +b +" " + ans);

        
    }
}

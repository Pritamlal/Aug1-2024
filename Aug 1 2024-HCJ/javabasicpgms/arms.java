import java.util.Scanner;


public class arms{
    public static void main(String[] args){

    int rem,num,sum=0,originalNum;

    Scanner s = new Scanner(System.in);

    System.out.println("Enter the number:");
    num = s.nextInt();
        originalNum = num;
    while(num>0){
        rem=num%10;
        sum=sum+(rem*rem*rem);
        num=num/10;
    }

    if(originalNum==sum){
        System.out.println("It is Armstrong Number");
    }
    else{
        System.out.println("It is not Armstrong number");
    }

}
}
public class binarycode {
   static String sum_num(String x,String y){
        int num1 = Integer.parseInt(x,2);

        int num2 = Integer.parseInt(y,2);

        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);

        return result;
    }


public static void main(String[] args){
    String x= "101101" , y= "100100";

    System.out.print(sum_num(x,y));

}
}
public class hcf{

    static int GCD(int x,int y){
        if(y==0)
        return x;
        return GCD(y,x%y);
    }

    public static void main(String[] args){
        int x=23,y=69;
        System.out.println("The GCD is " + x + "and " +y +"is: " +GCD(x,y));
    }
}
class complexNumber{
    int real,img;

    public complexNumber(int r,int i){
        this.real = r;
        this.img = i;
    }//constructor

    public void showC(){
        System.out.println(this.real + " +i"+ this.img);
    }

    public static complexNumber add(complexNumber c1,complexNumber c2){
        complexNumber res = new complexNumber(0,0);

        res.real = c1.real + c2.real;

        res.img = c1.img + c2.img;

        return res;
    }

    public static void main(String[] args){
        complexNumber c1 = new complexNumber(4,5);
        complexNumber c2 = new complexNumber(5,7);

        System.out.println("first Complex Number: ");
        c1.showC();

        System.out.println("Second Complex Number: ");
        c2.showC();

        complexNumber res = add(c1,c2);

        System.out.println("\n Addition is:");
        res.showC();

    }

}
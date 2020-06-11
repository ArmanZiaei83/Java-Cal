public class Cal {
    public static void main(String[] args){
        Cal a = new Cal();
        a.sum(5,6);
        a.minus(4,2);
        a.multiply(5,4);
        a.divide(10,2);
    }
    public void sum (int x , int y ){
        int c = x + y;
        System.out.println("The Sum Result : " + c);
    }
    public void minus(int x , int y){
        int c = x - y ;
        System.out.println("The Minus Result : " + c);
    }
    public void multiply(int x , int y){
        int c = x * y;
        System.out.println("The Multiply Result : " + c);
    }
    public void divide(int x , int y){
        int c = x / y;
        System.out.println("The Divide Result : " + c);
    }
}

public class Cal {
    public static void main(String[] args){
        Cal a = new Cal();
        a.sum(5,6);
        a.minus(4,2);
    }
    public void sum (int x , int y ){
        int c = x + y;
        System.out.println("The Sum Result : " + c);
    }
    public void minus(int x , int y){
        int c = x - y ;
        System.out.println("The Minus Result : " + c);
    }
}

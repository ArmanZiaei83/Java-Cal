public class Cal {
    public static void main(String[] args){
        Cal a = new Cal();
        a.sum(5,6);
        a.minus(4,2);
        a.multiply(5,4);
        a.divide(10,2);
        a.average();
        a.primeNum(15);
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
    public void average(){
        int[] x = {1,2,3};
        int sum = 0 ;
        int y = x.length;
        for (int i : x){
            sum += i;
        }
        System.out.println("The Average Result : " + sum / y);
    }
    public void primeNum(int x ){
        for (int i = 2 ; i <= x /x ; i++){
            if (x%i == 0){
                System.out.println("The " + x + "Isn't a prime number");
            }
            else{
                System.out.println("The " + x + "Is a prime Number");
            }
        }
    }
}

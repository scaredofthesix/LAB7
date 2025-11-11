import java.util.Scanner;
class calculator{
    double x;
    double y;
    public calculator(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double plus(){
        return x + y;
    }
    public double minus(){
        return x - y;
    }
    public double divisor(){
        return x / y;
    }
    public double multiplicator(){
        return x * y;
    }
}



public class lab{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        double ch1 = s.nextDouble();
        double ch2 = s.nextDouble();
        calculator c = new calculator(ch1, ch2);
        System.out.println(c.plus());
        System.out.println(c.minus());
        System.out.println(c.divisor());
        System.out.println(c.multiplicator());


    }

}

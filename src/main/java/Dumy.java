import java.util.Scanner;

class Calculater{
   int  a,b,sum;


    int addition(int a, int b){
         sum= a+b;
        return  sum;
    }
    int subraction(int a, int b){
         sum= a-b;
         return sum;
    }
    int multipication(int a, int b){
         sum= a*b;
         return sum;
    }
    int  division(int a ,int b){
         sum= a/b;
         return sum;
    }
    int modulous(int a, int b){
        sum =a%b;
        return sum;
    }


}
class Roots{
    int  sum;
    int squareRoot(int c){
        sum = c*c;
        return sum;
    }
    int cubeRoot(int d){
        sum = d*d*d;
        return sum;
    }

}
public class Dumy {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("WELCOME TO My CALCULATER:");
        System.out.println ("Enter the Input>");
        int a=input.nextInt ();
        System.out.println ("Enter the Input>");
        int b=input.nextInt ();
        System.out.println ("To get SquareRoot of any number>>>");
        int c=input.nextInt ();
        System.out.println ("To get CubeRoot of any Number> >");
        int d=input.nextInt ();
        Calculater calculater = new Calculater ();
        Roots roots = new Roots ();
        System.out.println ("Here is the Addition>>>"  +calculater.addition (a,b));
        System.out.println ("Here is the Subtraction>>>" +calculater.subraction (a,b));
        System.out.println ("Here is the Division>>>" +calculater.division (a,b));
        System.out.println ("Here is the Multipication>>>" +calculater.multipication (a,b));
        System.out.println ("Here is the Modulous>>>" +calculater.modulous (a,b));
        System.out.println ("Here is the SquareRoot>>>" +roots.squareRoot (c));
        System.out.println ("Here is the CubeRoot>>>" +roots.cubeRoot (d));

    }
}

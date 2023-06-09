import java.util.Scanner;

class S1 {

    int a, b;

    void setData(int a1, int b1) {
         a= a1;
         b=b1;

    }
}

public class Dummy {
    public static void main(String[] args) {
        S1 s1 = new S1 ();
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter the Value 1");
         s1.a=scanner.nextInt ();
        System.out.println ("Enter the Value 2");
        s1.b=scanner.nextInt ();
        s1.setData (s1.a, s1.b);
       int x= s1.b * s1.a;
        System.out.println ("print total>>" +x );
    }
}



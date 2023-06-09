import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int h =0,t=0;
        char z;
        char  Continue='y';
        Scanner scanner = new Scanner (System.in);
        double gameStart;
     /*   gameStart=  Math.random ()*2;
       double D= (int)gameStart;*/
        while (Continue =='y') {
           for (int i = 0; i <= 10; i++)
           {
               gameStart=Math.random() *2;
               int D= (int)gameStart;
               if (D == 1) {
                   h = h + 1;
                 //  c
               } else if (D == 0) {
                   t = t + 1;

               }
           }
            System.out.println ( h);
            System.out.println ( t);

            if (h > t) {
                System.out.println ("Computer Win");
            } else if (t > h) {
                System.out.println ("You Win");
            } else if (t == h) {
                System.out.println ("Tie");
            }
            System.out.println ("if  u you want to continue Enter y:");
               z= scanner.next ().charAt (0);
        }

    }
}

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Sum {



    public static void main(String[] args) {
        int n ,revrsed = 0;
        Scanner scanner= new Scanner (System.in);
        System.out.println ("Enter The Input>");
        n=scanner.nextInt ();
        int reminder = n%10;
       revrsed=revrsed*10+reminder;
        n/=10;

    System.out.println ("Rversed>>>>>>>>" +revrsed);

        }

    }


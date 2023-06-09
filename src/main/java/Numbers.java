import java.util.Scanner;

class PrintNumbers {
    int n,i;

    void printNumber(){
    i=0;
    while(i<=10){
       n= n+1;
        System.out.println (" "+n);
    }
    }
}

public class Numbers {
    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers ();
        printNumbers.printNumber ();
    }
}

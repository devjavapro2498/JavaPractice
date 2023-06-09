import java.util.Scanner;

public class DummyArray {
    public static void main(String[] args) {
        int s=0;
        int ar[]= new int[40];
        Scanner scanner = new Scanner (System.in);
        for (int i = 0; i < 20; i++){
            System.out.println ("Enter the no:");
        ar[i]= scanner.nextInt ();
            if(ar[i]%3==0 || ar[i]%5==0){
           s=s+ar[i];
            }
        }
        System.out.println ("Print ans" +s);
    }
}

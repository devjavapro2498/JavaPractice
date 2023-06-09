import java.util.Scanner;

public class SearchingPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int data;
        int flag =0;

        int ar[] = new  int[10];
        for (int i=0; i<10; i++){
            System.out.println ("Enter the 10 numbers:");
            ar[i]= scanner.nextInt ();
        }
        System.out.println ("Search Any number:");
        data = scanner.nextInt ();
        for (int i=0; i<10; i++){
            if(data== ar[i]){
                flag=1;
                System.out.print ("Postion>>" +i);
                break;
            }
        }
if(flag==1){
    System.out.println ("Present");
}
else {
    System.out.println ("Not Present");
}
    }
}

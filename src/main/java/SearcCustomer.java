import java.util.Scanner;

public class SearcCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int k = 0;
        String data;
        String name[] = new String[10];
        String hotel[][] = new String[2][5];
        System.out.println ("Enter the Name of Vistor:");
        for (int f = 1; f < 10; f++) {
            name[f] = scanner.nextLine ();
        }
        for (int f = 1; f < hotel.length; f++) {
            for (int r = 1; r < hotel.length; r++) {
                hotel[f][r] = name[k];
                k = k + 1;

            }
        }
        System.out.println ("Search Any Person:");
        data = scanner.nextLine ();
        for (int f = 1; f < hotel.length; f++) {
            for (int r = 1; r < hotel.length; r++) {
                if (hotel[f][r] == data) {
                    k = 1;
                    System.out.println ("Here:" +hotel[f][r] );
                    break;
                }
                System.out.println ();
            }
        }
        if(k==1){
            System.out.println ("Present ");
        }else {
            System.out.println ("Not Present");
        }
    }
}

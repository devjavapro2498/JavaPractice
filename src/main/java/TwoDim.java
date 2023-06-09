import java.util.Scanner;

public class TwoDim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a[][] = new  int[3][3];
        int i,j;
      int r=0;
        System.out.println ("Enter the Input:");
        for ( i=0; i<3; i++){
            for ( j= 0; j<3; j++){
                a[i][j]= scanner.nextInt ();

            }
            System.out.println ();
        }
        for ( i=0; i<3; i++){
            for ( j= 0; j<3; j++){
                if(a[i][j]!=a[j][i]){
                    System.out.print ( + a[i][j]);
                }
            }
            System.out.println ();

        }
    }
}

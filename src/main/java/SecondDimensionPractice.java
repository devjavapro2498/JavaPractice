import java.util.Scanner;

public class SecondDimensionPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int i,j;
        int ar[][] = new  int[3][3];
        System.out.println ("Enter the Number");
        for ( i=0; i<3;i++){
            for ( j=0; j<3; j++){
                ar[i][j]= scanner.nextInt ();
            }
        }
        for ( i=0; i<3;i++){
            for ( j=0; j<3; j++){
                if(i==j){
                    System.out.print ( ar[i][j]);
                }
            }
            System.out.println ();
        }


    }
}

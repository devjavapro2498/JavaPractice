import java.util.Scanner;

public class TwoDimensionPractice
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int ar[][]= new int[3][3];
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                    ar[i][j]= scanner.nextInt ();
            }

        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print (ar[i][j]);
            }
            System.out.println ();
        }
    }
}

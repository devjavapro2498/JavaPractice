import java.util.Scanner;

public class Pantaloons {
    public static void main(String[] args) {
        char buy='y';


        Scanner scanner = new Scanner (System.in);
        while (buy=='y')
        {
            System.out.println ("Choose 1 for shirts & 2 for Jeans:");
            int articleNo = scanner.nextInt ();
            switch (articleNo){
                case 1:
                    System.out.println ("Shirt");
                    break;
                case 2:
                    System.out.println ("Jeans");
                    break;
                default:
                    System.out.println ("Welcome to Pantaloons");

            }
            System.out.println ("DO u want to buy more: ");
            buy =scanner.next ().charAt (0);



        }
    }
}

import java.util.Scanner;

public class Restro {
    public static void main(String[] args) {
         char menu='y';
        Scanner scanner = new Scanner (System.in);
        System.out.println ("If u want starters press 1:");
        int food=scanner.nextInt ();


        while (menu =='y'){
            switch (food){
                case 1:
                    System.out.println ("Starers Item  for Veg press-1/NonVeg press-2:");
                    int foodType= scanner.nextInt ();
                    int price;
                    switch (foodType){
                        case 1:
                            int selectNonVegItem= scanner.nextInt ();
                            switch (selectNonVegItem) {
                                case 1:
                                    System.out.println ("tandoori");
                                    price=100;
                                    break;
                                case 2:
                                    System.out.println ("Lolipop");
                                    price=200;
                                    break;
                                case 3:
                                    System.out.println ("CHickien Soup");
                                    price=300;
                                    break;
                                default:
                                    System.out.println ("Not Selected any Item");
                                    break;
                            }
                            case 2:
                    int selectVegItem= scanner.nextInt ();
                    switch (selectVegItem) {
                        case 1:
                            System.out.println ("Chowmin");
                            price=300;
                            break;
                        case 2:
                            System.out.println ("Manchurian");
                            price=800;
                            break;
                        case 3:
                            System.out.println ("Veg Soup");
                            price=900;
                            break;
                        default:
                            System.out.println ("Not Selected any Item");
                            break;
                    }
                case 3:
                    System.out.println ("Dinner Item");

            }

        }
    }
}}

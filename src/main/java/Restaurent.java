import java.util.Scanner;

class Menu {
    char choice ='y';
    char regularCustomer ='l';
    String CHOOSE;
int price,discount,Tdiscount;

    void getOrders(){
        System.out.println ("Welcome to MyRestaurent");
        while (choice =='y'){
            Scanner scanner = new Scanner (System.in);
            System.out.println ("Choose Pizza/Burger/Combo");
            CHOOSE =scanner.nextLine ();
            switch (CHOOSE) {
                case "Pizza":
                        System.out.println ("Congratulations You Ordere a Pizza");
                        price = 300;
                        System.out.println ("Total price of pizaa" + price);
                        discount = price * 15 / 100;
                        System.out.println ("Congratulations For getting 15% offer");
                        price = price - discount;
                        System.out.println ("Now your Bill:" + price);
                    break;
                case "Burger":
                    System.out.println ("Congratulations You Ordere a Burger");
                    price = 600;
                    System.out.println ("Total price of Burger" + price);
                    discount = price * 25 / 100;
                    System.out.println ("Congratulations For getting 25% offer");
                    price = price - discount;
                    System.out.println ("Now your Bill:" + price);
                    break;
                case  "Combo":
                    System.out.println ("Congratulation you have Ordered combo Pack");
                    price =300+600;
                    System.out.println ("Total discount is 15+25%");
                    discount = price *15/100;
                    Tdiscount =discount*25/100;
                    price = price -Tdiscount;
                    System.out.println ("Now your Bill>" +price);
                    break;
                default:
                    System.out.println ("You Have Choosen The Wrong Choice" );
            }
            System.out.println ("Do u want AnythingElse:");
        }


        }
    }

public class Restaurent {
    public static void main(String[] args) {

        Menu menu1= new Menu ();
        menu1.getOrders ();


    }


}

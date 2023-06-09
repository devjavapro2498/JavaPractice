import java.util.Scanner;

class Payments {
    int payment1;
    int payment2;
    int payment3;
    int payment4;
    int totalBalancel;
  void   getData(){
      Scanner input =  new Scanner (System.in);
      System.out.println ("Enter the payment details :");
      System.out.println ("Payement1");
      payment1 =input.nextInt ();
      System.out.println ("Payement2");
      payment2 =input.nextInt ();
      System.out.println ("Payement3");
      payment3 =input.nextInt ();
      System.out.println ("Payement4");
      payment4 =input.nextInt ();
    }

    void  getprocess(){
        getData();
        totalBalancel = payment1+payment2+payment3+payment4;
    }

    void showData(){
        getprocess();
        System.out.println ("Show my Total Balannce" +totalBalancel);
    }
}



public class Shopkeeper {
    public static void main(String[] args) {
        Payments payments = new Payments ();
        payments.showData ();
    }
}

import java.util.Scanner;
class ShoppincartRequest{
    String CartStatus;
    public String getCartStatus() {
        return CartStatus;
    }
    public void setCartStatus(String cartStatus) {
        CartStatus = cartStatus;
    }
}
public class CheckEqulIgnoreCase {
    public static void main(String[] args) {
        char Continue='y';
        Scanner scanner = new Scanner (System.in);
        ShoppincartRequest shoppincartRequest = new ShoppincartRequest ();
        while (Continue=='y'){
            System.out.println ("Enter the firstString:");
            String myString1 = scanner.next ();
            shoppincartRequest.setCartStatus (myString1);
            if(shoppincartRequest.getCartStatus ()==null||shoppincartRequest.getCartStatus ().equals ("Complete") || !shoppincartRequest.getCartStatus ().equals("Draft")){
                System.out.println("Current cart status: " + shoppincartRequest.getCartStatus());
                System.out.println ("PublishQueue");
            }else {
                System.out.println ("Not going to to if conditon");
            }
        }
    }
}

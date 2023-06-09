public class ReverseNew1 {
    public static void main(String[] args) {
       int num= 4321;
       while (num>0){
         int  qu = num/10;
          int rem= num%10;
          num=qu;

           System.out.print("Print rev" +rem);
       }

    }
}

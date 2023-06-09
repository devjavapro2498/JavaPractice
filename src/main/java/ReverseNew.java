public class ReverseNew {
    public static void main(String[] args) {
        int num= 4321;
        while (num>0){
            int q = num/10;
          int  r = num%10;
          num=q;
          System.out.print ("" +r);
        }
    }
}

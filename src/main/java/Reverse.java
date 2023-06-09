public class Reverse {
    public static void main(String[] args) {
        int n =1234;
        int rev, rem,rem2,rem3;
        rem= n%10;
        n=n/10;
        rem2 = n%10;
        n=n/10;
        rem3 = n%10;
        n=n/10;
        rev = n%10;
        n=n/10;



        System.out.println ("print Rev"+rem+rem2+rem3+rev);



    }
}

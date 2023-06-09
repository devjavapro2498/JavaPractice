import java.util.Scanner;

public class PrintMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int i;
        int c1=0 ;int c2=0;
       int count=0;
        int[] math= new int[2];
        int[] eng= new int[2];
        int[] sci= new int[2];
        for(i=0; i<2; i++ ){
            System.out.print("Math");
            math[i]= scanner.nextInt ();
            System.out.print ("Eng");
            eng[i]= scanner.nextInt ();
            System.out.print ("Sci");
            sci[i]= scanner.nextInt ();
            if(math[i]+eng[i]+sci[i]/3.0>=80){
                c1++;

            }
            if(math[i]+eng[i]+sci[i]/3.0>=40){
                c2++;

            }
        }
        System.out.println ("print 80%>" +c1);
        System.out.println ("print 30%>" +c2);
    }
}

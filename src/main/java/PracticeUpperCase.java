import java.util.Scanner;

public class PracticeUpperCase
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter the Input>>");
        String input =scanner.nextLine ();
        String output ="";
        boolean toUpperCase= true;
        for(int i=0; i <input.length (); i++ ){
            char c =input.charAt (i);
            if(c==' '){
                output += c;
            } else if (toUpperCase){
                output += Character.toUpperCase (c);
                toUpperCase=false;

            } else {
                output +=c;

            }
            if(c=='.'){
                toUpperCase= true;
            }
        }
        System.out.println (output);

    }
}

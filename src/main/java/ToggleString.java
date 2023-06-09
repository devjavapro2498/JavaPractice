import java.util.Scanner;

class  UppeCaseToggle{
    String Input,Output;
    // When it's user Input  in java Input -university OutPut=UniVERSITY
   String getData(){
       Scanner scanner = new Scanner (System.in);
       System.out.println ("Enter the Input>");
    Input = scanner.nextLine ();
    Output =Input;
    Output.toUpperCase ().replace ('A','c');
       return Output;

   }
}

public class ToggleString {
    public static void main(String[] args) {
        UppeCaseToggle uppeCaseToggle= new UppeCaseToggle ();
       String upperCase= uppeCaseToggle.getData ();
        System.out.println ("UpperCase>" +upperCase);

    }

}

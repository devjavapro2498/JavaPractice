import java.util.Scanner;

public class Employee {




    public static void main(String[] args) {
        int salary;
        String name;
        char level;
        Scanner scanner= new Scanner (System.in);
        System.out.println ("Enter the Compay Details:");
        System.out.println ("Enter the Name:");
        name =scanner.nextLine ();
        System.out.println ("here is name :" +name);
        System.out.println ("Enter the salary:");
        salary =scanner.nextInt ();
        System.out.println ("here is Salary :" +salary);
        System.out.println ("Enter the level:");
        level =scanner.next ().charAt (0);
        System.out.println ("here is Level :" +level);



    }
}

import java.util.Scanner;

class Employe{
    int salary;
    String name;
    char level;
    int hra;
    int AnnualSalary;
    int Da;
    int Ea;
    int GrossSalary;
    int tax;





    void   getdata(){

      Scanner scanner= new Scanner (System.in);

      System.out.println ("Enter the Compay Details:");
      System.out.println ("Enter the Name:");
      name =scanner.nextLine ();
      System.out.println ("Enter the Basic salary:");
      salary =scanner.nextInt ();
        System.out.println ("Enter the DA :");
        Da =scanner.nextInt ();
        System.out.println ("Enter the EA:");
        Ea =scanner.nextInt ();
      System.out.println ("Enter the level:");
      level =scanner.next ().charAt (0);

    }
    int getProcessData(){
       hra = salary*10/100;

      return hra;

      //tds ,travel ,pf,net salary,medical allowncce, diet allownce,security allowance


    }

    public int getAnnualSalary() {
        AnnualSalary=salary *12;
        return AnnualSalary;
    }
    public int getDa() {
        Da=Da *12;
        return Da;
    }
    public int getEa() {
        Ea=Ea *12;
        return Ea;
    }
    public int getGrossSalary(){
        GrossSalary=AnnualSalary+Da+Ea;
        return GrossSalary;
    }



    void  CheckElibilityofTax(){
        if(AnnualSalary>=600000){
            System.out.println ("You're eligible to pay Tax");
            tax =GrossSalary*17/100;
            System.out.println ("You need t pay this much tax>>" +tax);


        } else {
            System.out.println ("Not Eligible to pay tax");
        }

    }


    void  showData(){
        System.out.println ("here is name :" +name);
        System.out.println ("here is Salary :" +salary);
        System.out.println ("here is Level :" +level);
        System.out.println ("Here is my Home Rent Allowance>>" +hra);
        System.out.println ("Here is my Annual Salary" +AnnualSalary);
        System.out.println ("Here is my Gross Salary" +GrossSalary);


    }

}


public class Company {
    public static void main(String[] args) {
        Employe employe = new Employe ();
        employe.getdata ();
        employe.getProcessData ();
        employe.getAnnualSalary ();
        employe.getDa ();
        employe.getEa ();
        employe.getGrossSalary ();
        employe.CheckElibilityofTax ();
        employe.showData ();


    }
}

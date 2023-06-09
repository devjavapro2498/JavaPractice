class ReturStatement{
    int getAddData(int a, int b){
      return  a+b;
    }
    int getSubData(int a, int b){
        return  a*b;
    }
    int getMulData(int a, int b){
        return  a/b;
    }
    int getDivData(int a, int b){
        return  a%b;
    }

    int getMaxValue(int a, int b){
        if(a<b){
            return  b;
        }
        else {
            return a;
        }
    }

}

public class PracticeReturn {

    public static void main(String[] args) {
        ReturStatement pr= new ReturStatement ();
        //int add=pr.getAddData (10,10);
        int sub=pr.getSubData (15,30);
        int Mul=pr.getMulData (10,5);
        int div= pr.getDivData (19,3);
        int Max =pr.getMaxValue (15,16);
        System.out.println("Addition: " + pr.getAddData (10,10) + ", Subtraction: " + sub + ", Multiplication: " + Mul + ", Division: " + div +", Maximum Value:" +Max);


    }
}

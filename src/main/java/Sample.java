class Demo {
    int x, y, sum, Mul, Div, sub, mod;
    double cov;
    float con;
    char conver;


    void setData() {
        x = 30;
        y = 35;
    }

    void setProcess() {
        sum = x + y;
        cov = sum;//implicit

        Mul = x * y;
        con = Mul;//implicit
        Div = x + y;
        conver = (char) Div;//Explicit
    }

    void setOutput() {
        System.out.println ("Addition:" + sum);
        System.out.println ("AdditionDoubleConve:" + cov);
        System.out.println ("Multipication:" + Mul);
        System.out.println ("MultipicationFloat:" + con);
        System.out.println ("Division:" + Div);
        System.out.println ("DivisionConversion:" + conver);
    }
}

public class Sample {
    public static void main(String[] args) {

        Demo demo = new Demo ();
        demo.setData ();
        demo.setProcess ();
        demo.setOutput ();

    }
}

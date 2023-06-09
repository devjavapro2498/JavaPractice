public class Rectangle {
    int l,b,area;
    void  getData(int x, int y)
    {
        l=x;
       b=y;
    }
    int getProcess(){
        area = l*b;
        return  area;


    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle ();
        r1.getData (10,20);
        int area1=  r1.getProcess ();
        System.out.println (" " +area1);
    }
}

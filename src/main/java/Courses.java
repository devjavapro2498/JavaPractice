class  Btech{
   void  getCourseDetails(){
       System.out.println ("This is Btech Course");
    }
}
class  MbA{
    void  getCourseDetails(){
        System.out.println ("This is Mba Course");
    }
}
class Bed{
    void  getCourseDetails(){
        System.out.println ("This is Bed Course");
    }
}
class Diploma{
    void  getCourseDetails(){
        System.out.println ("This is Diploma Course");
    }
        }

// char

public class Courses {
    public static void main(String[] args) {
        Btech btech= new Btech ();
        MbA mbA = new MbA ();
        Bed bed = new Bed ();
        Diploma diploma = new Diploma ();
        btech.getCourseDetails ();
        mbA.getCourseDetails ();
        bed.getCourseDetails ();
        diploma.getCourseDetails ();

    }
}

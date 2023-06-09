import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int[] id = new int[10];
        int hotel[][]= new  int[2][5];
        int k=0;
        System.out.println ("Enter the iD of vistior:");
        for (int i=1; i<10;i++){
            id[i] = scanner.nextInt ();
        }
        for (int f=0; f<2;f++){
            for (int r=0; r<5; r++){
                hotel[f][r]= id[k];
                k=k+1;
            }
        }
        for (int f=0; f<2;f++){
            for (int r=0; r<5; r++){
                System.out.print (+hotel[f][r]);
            }
          //  System.out.println ("floor"+f);
        }
       int flag=0;
        System.out.println ("Find the bookingId:");
        int bookinId= scanner.nextInt ();
        for (int i=1; i<10;i++){
            if(bookinId==id[i]){
            flag=1;
                System.out.println ("Postion" +i);
            }
        }
        if(flag==0){
            System.out.println ("NA");
        }else {
            System.out.println ("Available");
        }


    }
}

import java.util.Arrays;

public class DuplicateElement
{
    public static void main(String[] args) {
        int i,j=0, frequency;
        int ar[] = new int[]{1,2,3,4,1,5,5,1,4,2,2,};
        Arrays.sort (ar);
        for ( i=0; i<ar.length; i++){
            frequency=1;
            for ( j= i+1; j<ar.length; j++){
                if(ar[j]==ar[i]) {
                    System.out.print (ar[j]);
                    frequency++;
                }
                else {
                    break;
                }

            }
           i=j-1;
            if(frequency>1){
                System.out.println (ar[i] +"-->" +frequency);
            }
        }


    }
}

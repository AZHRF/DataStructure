import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
public class COMPARISON {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        int[] R=new int[3];
        int[] T=new int[3];
        System.out.println("please Enter values for matrices:");

        for (int i=0;i<R.length;i++){
            System.out.println("Enter of array 1 number:"+(i+1+"="));
            R[i]=input.nextInt();

        }
        for (int i=0; i<R.length; i++){
            System.out.println("R["+i+"]:"+ R[i]);
        }
        for (int i=0;i<T.length;i++){
            System.out.println("Enter of array 2 number:"+(i+1+"="));
            T[i]=input.nextInt();
        }

        for (int i=0; i<T.length; i++){
            System.out.println("T["+i+"]:"+ T[i]);
        }

        for (int i=0;i<R.length & i< T.length;i++){
            if (R[i]==T[i]){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

    }
}

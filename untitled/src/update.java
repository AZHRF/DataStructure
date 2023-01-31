import java.util.Arrays;
public class update {
    public static void main(String[] args){
        int[] A={1,2,3};
        for (int i=0;i<A.length;i++){
            System.out.println("A["+i+"]:"+A[i]);
        }
        A[0]=7;
        System.out.println(Arrays.toString(A));

    };
}

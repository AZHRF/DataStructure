import com.sun.xml.internal.fastinfoset.util.StringArray;
import java.sql.SQLOutput;
import java.lang.Iterable;
import java.lang.Object;

public class CopyArray{
public static void main(String[] args){
    int[] A={1,2,3,4,5};
    int[] B={2,3,3,5,6};
    int[] copy = new int[5];
    System.arraycopy(A,0,copy,0,A.length);

    for (int i: copy){
        System.out.println(i);
    }

}
}

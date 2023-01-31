import com.sun.glass.ui.Size;

import java.util.Scanner;

import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.S;

public class copy {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9};
        int B[]=new int [A.length];

        for (int i=0; i<A.length; i++){
           B[i]=A[i];
        }
        System.out.println("-------------------B elements----------------------");
        for (int i=0; i<B.length; i++){
            System.out.println("B["+i+"]:"+ B[i]);
        }

    }
}

import com.sun.glass.ui.Size;

import java.sql.SQLOutput;
//دمج مصفوفتين في مصفوفة ثالثة
//-------------------------------------------------------------------------------
public class Main {
  public static void main(String[] args) {

    int[] A={1,2,3,4};
    int[] B={10,20,30,40};

for (int i=0; i<A.length; i++){
  System.out.println("A["+i+"]:"+ A[i]);
}
    System.out.println("-------------------B elements----------------------");
    for (int j=0; j<B.length; j++){
      System.out.println("B["+j+"]:"+ B[j]);
    }
      System.out.println("---------دمج----------");
    int[] H=new int[10];
    int i=0, j=0, k=0;
    while (i<A.length && j<B.length){
        if (A[i]<B[j]){
            H[k]=A[i];
            i++; k++;
        }else {
            H[k]=B[j];
          j++;k++;
        }
    }
      for (int l=0; l< H.length; l++){
          System.out.println("H["+l+"]:"+ H[l]);
      }
    }
  }

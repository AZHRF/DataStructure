public class PRINT {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6,7,8,9};
        int[] B={10,20,30,40,50,60,70,80,90};

        for (int i=0; i<A.length; i++){
            System.out.println("A["+i+"]:"+ A[i]);
        }
        System.out.println("-------------------B elements----------------------");
        for (int i=0; i<B.length; i++){
            System.out.println("B["+i+"]:"+ B[i]);
        }


    }
}
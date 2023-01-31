public class Homework_2_2 {


        public static void main(String[] args)
        {
            int intArray[] = {12,15,17};

            //print original intArray
            System.out.println("Contents of intArray[] before assignment:");
            for (int i=0; i<intArray.length; i++)
                System.out.print(intArray[i] + " ");

            // Create an array b[] of same size as a[]
            int copyArray[] = new int[intArray.length];

            // intArray is assigned to copyArray; so references point to same location
            copyArray = intArray;

            // change element of copyArray
            copyArray[1]++;

            //print both arrays
            System.out.println("\nContents of intArray[]:");
            for (int i=0; i<intArray.length; i++)
                System.out.print(intArray[i] + " ");

            System.out.println("\nContents of copyArray[]:");
            for (int i=0; i<copyArray.length; i++)
                System.out.print(copyArray[i] + " ");
        }
    }


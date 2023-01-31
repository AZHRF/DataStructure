import java.util.Scanner;
public class Homework_2_1
{
    public static void reverse(int arr[],int start,int end){
        //Terminating condition
        if (start>=end)
            return;
        //logic to swap value
int temp;
temp=arr[start];//2
arr[start]=arr[end];//9
arr[end]=temp;//2
//Recursive call
        reverse(arr,start+1,end-1);

    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=in.nextInt();

        //Declare an array
        int arr[]=new int[n];

        System.out.println("Enter an array values");
for (int i=0;i<n;i++){
    arr[i]=in.nextInt();
}
//Reverse an array
        reverse(arr,0,n-1);
        System.out.println("After reversing an array");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }


   /* public static void main(String[] args) {

        getInput();
        reverseInput();
        System.exit(0);
    }

    public static void getInput() {

        Scanner keyboard = new Scanner(System.in);

        int[] values;
        values = new int[10];

        //Ask the user to enter 10 integers
        System.out.println("Please enter ten numbers.");
        for (int i = 0; i<values.length; i++) {//for loop to display the values entered
            values[i] = keyboard.nextInt();
            System.out.println("Value" + (i +1) + " is " + values[i]);
        }
    }

    public static void reverseInput() {

        System.out.println("Now we are going to reverse the numbers.");
        Scanner keyboard = new Scanner(System.in);

       int [] values;
       values = new int[10];

        for (int i = (values.length -1); i>= 0; i--) {//for loop to display integers in reversed order
           // values[i];
            System.out.println(values[i]);
        }
    }*/
}

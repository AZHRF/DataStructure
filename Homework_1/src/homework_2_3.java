import org.jetbrains.annotations.NotNull;

import java.util.Random;
public class homework_2_3 {

    /**
     * Created by sakura on 9/19/16.
     */
    public class Main {
        public static void main(String[] args) {
            int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
            removeElements(array);
        }

        static void removeElements(int @NotNull [] array) {
            Random r = new Random();
            while (array.length > 0) {
                int index = r.nextInt(array.length);
                System.out.println("INDEX = " + index + ", ELEMENT = " + array[index]);
                int[] array1 = new int[array.length - 1];
                for (int i = 0; i < index; i++)
                    array1[i] = array[i];
                for (int i = index; i < array.length - 1; i++)
                    array1[i] = array[i + 1];
                array = array1;
            }
        }
    }
}

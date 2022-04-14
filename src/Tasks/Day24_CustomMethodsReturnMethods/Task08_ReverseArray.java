package Tasks.Day24_CustomMethodsReturnMethods;

import java.util.Arrays;

public class Task08_ReverseArray {

    public static void main(String[] args) {



        int[] arr = {1,2,3,4,5};

        arr=reverse(arr);

        System.out.println(Arrays.toString(arr));


    }


    public static int[] reverse (int[] array){
        int[] result = new int[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {

            result[j]=array[i];

        }
        return result;
    }


}

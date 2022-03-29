package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{};
        if(array == null || array.length ==0){
            sum(array);
        }
        else if( (array != null & array.length != 0) ){
            int result = SumOfEvenNumbers.sum(array);
            System.out.println(result == 8); // true
        }


    }

    public static int sum(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }
        else {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    array[i] = 0;
                }

                sum += array[i];

            }


            //put your code here
            return sum;
        }

        //throw new UnsupportedOperationException();
    }
}

    boolean []res = new boolean[]{};
    int sum = array[0];
       for(int i = 2; i < array.length; i ++ ){
        if(array[i] == array[i-2] + array[i-1]){
        res[i] = true;
        }

        }
        return res;


        package com.epam.rd.autotasks.arrays;

        import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));

    }

    public static boolean getSumCheckArray(int[] array){
        boolean []res = new boolean[]{};
        int sum = array[0];
        for(int i = 0; i < array.length; i ++ ){
            if(array[i] != array[i+1]){
                res[i] = false;
            }

        }
        return true;



        //throw new UnsupportedOperationException();
    }
}

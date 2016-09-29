package module06;

import java.util.stream.IntStream;

public final class ArraysUtils {

    public static double sumArr(int[] arr) {
        int sum = IntStream.of(arr).sum();
        return sum;
        /*int sum = 0;
        for( int i : numbers) {
        sum += i;
        } и по старинке*/

    }

    public static int maxArr(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];


        }
        return max;
    }

    public static int minArr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];

        }
        return min;
    }

    public static int maxPositive(int[] arr) {
        int maxP = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxP & arr[i] > 0)
                maxP = arr[i];


        }
        return maxP;
    }

    public static double multiplication(int[] arr) {
        int result = 1;
        for (int value : arr)
            result *= value;

        return result;
    }

    public static int modulus(int[] arr) {

        int n = arr.length;
        int a = arr[0];
        int b = arr[n - 1];
        int result = a % b;
        return result;
    }

    public static int secondLargest(int[] arr) {
        int largest, secondLargest;

        if (arr[0] > arr[1]) {
            largest = arr[0];
            secondLargest = arr[1];
        } else {
            largest = arr[1];
            secondLargest = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if ((arr[i] <= largest) && arr[i] > secondLargest)
                secondLargest = arr[i];


            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }

        return secondLargest;
    }

    public static int[] reverse (int[] array){
        int[] reversedArray = new int[array.length];
        for (int i=0; i<array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
    public static int[] findEvenElements(int[] array) {
        int countEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                countEvens++;
            }
        }
        int[] evenElements = new int[countEvens];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenElements[count] = array[i];
                count++;
            }
        }
        return evenElements;
    }
}

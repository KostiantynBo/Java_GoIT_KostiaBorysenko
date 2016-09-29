package module02;

import module06.ArraysUtils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task021 {

    /* public double sumArr(int[] arr) {
        int sum = IntStream.of(arr).sum();
        return sum;
        //int sum = 0;
        //for( int i : numbers) {
        //sum += i;
        //} и по старинке

    }

    public int maxArr(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];


        }
        return max;
    }

    public int minArr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];

        }
        return min;
    }

    public int maxPositive(int[] arr) {
        int maxP = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxP & arr[i] > 0)
                maxP = arr[i];


        }
        return maxP;
    }

    public double multiplication(int[] arr) {
        int result = 1;
        for (int value : arr)
            result *= value;

        return result;
    }

    public int modulus(int[] arr) {

        int n = arr.length;
        int a = arr[0];
        int b = arr[n - 1];
        int result = a % b;
        return result;
    }

    public int secondLargest(int[] arr) {
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
    } */


    public static void main(String args[]) {

        Task021 arrays = new Task021();

        int[] arr1 = new int[]{300, -2, 18, 27, 54, 9, 12, -470, 90, 45};

        //System.out.println("The sum is: " + arrays.sumArr(arr1));

        //System.out.println("Maximum is: " + arrays.maxArr(arr1));

        //System.out.println("Minimum is: " + arrays.minArr(arr1));

        //System.out.println("Maximum positive is: " + arrays.maxPositive(arr1));

        //System.out.println("Multiplication is: " + arrays.multiplication(arr1));

        //System.out.println("The modulus of first and last element is: " + arrays.modulus(arr1));

        //System.out.println("The second largest element is: " + arrays.secondLargest(arr1));

        System.out.println("The sum is: " + ArraysUtils.sumArr(arr1));

        System.out.println("Maximum is: " + ArraysUtils.maxArr(arr1));

        System.out.println("Minimum is: " + ArraysUtils.minArr(arr1));

        System.out.println("Maximum positive is: " + ArraysUtils.maxPositive(arr1));

        System.out.println("Multiplication is: " + ArraysUtils.multiplication(arr1));

        System.out.println("The modulus of first and last element is: " + ArraysUtils.modulus(arr1));

        System.out.println("The second largest element is: " + ArraysUtils.secondLargest(arr1));

        System.out.println("The revers array: " + Arrays.toString(ArraysUtils.reverse(arr1)));

        System.out.println("The even elements of array is: " + Arrays.toString(ArraysUtils.findEvenElements(arr1)));

    }
}

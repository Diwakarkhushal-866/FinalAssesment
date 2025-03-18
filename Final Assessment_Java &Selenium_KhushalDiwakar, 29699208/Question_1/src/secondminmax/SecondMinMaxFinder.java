package secondminmax;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        findSecondMinMax(numbers);
    }

    public static void findSecondMinMax(int[] arr) {
 
        Arrays.sort(arr);
        
        int secondMin = arr[1];
        int secondMax = arr[arr.length - 2];


        System.out.println("Results:");
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("2nd Smallest Number: " + secondMin);
        System.out.println("2nd Largest Number: " + secondMax);
    }
}
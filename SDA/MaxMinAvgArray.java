package SDA;
/**
 # Question 1 :

Write a code in Java to create a class named �MaxMinAvgArray� and perform the following functions as listed below :

1. Take input of the Array length and its elements from the user using Scanner class.
2. Sort the Array in Ascending order using bubble sort technique only.
3. Then from the sorted Array, Find :
    1. Greatest valued integer in the Array.
    2. Least valued integer in the Array.
    3. Average value of all the integer elements stored in the Array.

Write the main method as well and call all the objects, print greatest, lowest and average asked above.

Algorithm

1. Start
2. Import the Scanner class and define the `MaxMinAvgArray` class.
3. Declare a public integer array variable called �array�.
4. Create a constructor that assigns the input array to �array�.
5. Implement a `�bubbleSort()�` method.
6. Initialize a Boolean variable �temp�.
7. Iterate over the array, swapping adjacent elements if necessary.
8. Define �`findMax()�` and `�findMin()�` methods.
9. Initialize �max� and �min� variables.
10. Iterate over the array, updating `�max�` and `�min�.`
11. Implement `�calculateAverage()�` method.
12. Initialize �sum� and iterate over the array, adding elements.
13. Return the average as a double.
14. Define `�printArray()�` method to print array elements.
15. Create a Scanner object and read the array size.
16. Read integers for the array.
17. Create a `MaxMinAvgArray` object.
18. Sort the array using bubble sort technique.
19. Find max, min, average and print the result.
20. End
 */
import java.util.Scanner;

class MaxMinAvgArray {
    int[] array;
    MaxMinAvgArray(int[] array) {
        this.array = array;
    }
    void bubbleSort() {
        int n = array.length;
        boolean temp;
        for (int i = 0; i < n - 1; i++) {
            temp = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                    temp = true;
                }
            }
            if (!temp) break;
        }
    }
    int findMax() {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    int findMin() {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    double calculateAverage() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
    void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        MaxMinAvgArray obj = new MaxMinAvgArray(array);

        System.out.println("Unsorted array:");
        obj.printArray();
        obj.bubbleSort();
        System.out.println("Sorted array:");
        obj.printArray();
        
        int max = obj.findMax();
        int min = obj.findMin();
        double average = obj.calculateAverage();

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Average value: " + average);
    }
}

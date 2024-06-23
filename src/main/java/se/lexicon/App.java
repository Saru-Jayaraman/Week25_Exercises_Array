package se.lexicon;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("=======================================================");
        // 1. Write a program which will store elements in an array of type ‘int’ and print it
        // out.
        // Expected output: 11 23 39 etc.
        int[] array = {11, 23, 39, 45, 66};
        System.out.println("Array Elements: " + Arrays.toString(array));

        System.out.println("=======================================================");
        // 2. Create a program and create a method with name ‘indexOf’ which will find and return
        // the index of an element in the array. If the element does not exist your method
        // should return -1 as value. Expected output: Index position of number 5 is: 2.
        int[] array1 = {11, 23, 5, 45, 66};
        int elementToFind = 5;
        int indexPosition = -1;
        for(int i=0; i<array1.length; i++) {
            if(array1[i] == elementToFind) {
                indexPosition = i;
            }
        }
        System.out.println("Index position of number " + elementToFind + " is: " + indexPosition);

        System.out.println("=======================================================");
        // 3. Write a program which will sort string array.
        // Expected output: String array: [Paris, London, New York, Stockholm]
        // Sort string array: [London, New York, Paris, Stockholm]
        String[] array2 = {"Paris", "London", "NewYork", "Stockholm"};
        System.out.println("Before sorting: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array: " + Arrays.toString(array2));

        System.out.println("=======================================================");
        // 4. Write a program which will copy the elements of one array into another array.
        // Expected output: Elements from first array: 1 15 20
        // Elements from second array: 1 15 20
        int[] array3 = new int[]{1, 15, 20};
        int[] array4 = Arrays.copyOf(array3, array3.length);
        System.out.println("Elements copied from first array to second array: " + Arrays.toString(array4));

        System.out.println("=======================================================");
        // 5. Create a two-dimensional string array [2][2]. Assign values to the
        // 2-dimensional array containing any Country and City. Expected output: France Paris
        // Sweden Stockholm
        String[][] countryCity = new String[2][2];
        countryCity[0][0] = "France";
        countryCity[0][1] = "Paris";
        countryCity[1][0] = "Sweden";
        countryCity[1][1] = "Stockholm";
        System.out.println("Country Capital:");
        for (String[] strings : countryCity) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

        System.out.println("=======================================================");
        // 6. Write a program which will set up an array to hold the next values in this order:
        // 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
        // Expected output: Average is: 17.3
        double[] array5 = new double[]{43, 5, 23, 17, 2, 14};
        double sum = 0;
        double average, scale;
        for (double v : array5) {
            sum = sum + v;
        }
        average = sum/array5.length;
        scale = Math.pow(10, 1);
        System.out.println("Average is: " + Math.round(average * scale) / scale);

        System.out.println("=======================================================");
        // 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
        // Expected output: Array: 1 2 4 7 9 12
        // Odd Array: 1 7 9
        int[] array6 = new int[]{1, 2, 4, 7, 9, 12};
        int[] oddArray = new int[array6.length];
        int oddArrayCounter = 0;
        for (int k : array6) {
            if (k % 2 == 1) {
                oddArray[oddArrayCounter] = k;
                oddArrayCounter++;
            }
        }
        System.out.println("Array: " + Arrays.toString(array6));
        System.out.println("Odd Array: ");
        for(int arr : oddArray) {
            if(arr != 0)
                System.out.print(arr + " ");
        }
        System.out.println();

        System.out.println("=======================================================");
        // 8. Write a program which will remove the duplicate elements of a given array
        // [20, 20, 40, 20, 30, 40, 50, 60, 50]. Expected output: Array: 20 20 40 20 30 40 50 60 50
        // Array without duplicate values: 20 40 30 50 60
        int[] array7 = new int[]{20, 20, 40, 20, 30, 40, 50, 60, 50, 200, 70, 100, 70, 70, 70};
        int[] arrayWithoutDuplicates = new int[0];
        boolean isFound = false;
        for(int i=0; i<array7.length; i++) {
            if(i==0) {
                arrayWithoutDuplicates = Arrays.copyOf(array7, 1);
            }
            else {
                int j=0;
                while(j < arrayWithoutDuplicates.length) {
                    if(arrayWithoutDuplicates[j] == array7[i]) {
                        isFound = true;
                    }
                    j++;
                }
                if(!isFound) {
                    arrayWithoutDuplicates = Arrays.copyOf(arrayWithoutDuplicates, arrayWithoutDuplicates.length + 1);
                    arrayWithoutDuplicates[arrayWithoutDuplicates.length - 1] = array7[i];
                }
                isFound = false;
            }
        }
        System.out.println("Array: " + Arrays.toString(array7));
        System.out.println("Array without duplicate values: ");
        for(int arr : arrayWithoutDuplicates){
            System.out.print(arr + " ");
        }
        System.out.println();

        System.out.println("=======================================================");
        // 9. Write a method which will add elements in an array. Remember that arrays are fixed in size, so
        // you need to come up with a solution to “expand” the array.
        int[] array8 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array9 = new int[]{10, 11, 12, 13, 14};
        int[] array10 = Arrays.copyOf(array8, array8.length+array9.length);
        for(int i=array8.length, j=0; i<array10.length && j<array9.length; i++, j++) {
            array10[i] = array9[j];
        }
        System.out.println("Expand the array: " + Arrays.toString(array8) + Arrays.toString(array9));
        for(int arr : array10) {
            System.out.print(arr + " ");
        }
        System.out.println();

        System.out.println("=======================================================");
        // 10. Write a program which will represent multiplication table stored in multidimensional array.
        // Hint: You have two-dimensional array with values [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
        int[] array11 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array12 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [][] tables = new int[array11.length][array12.length];
        for(int i=1; i<=array11.length; i++) {
            for(int j=1; j<=array12.length; j++) {
                tables[i-1][j-1] = i * j;
            }
        }
        System.out.println("Multiplication table stored in multidimensional array: ");
        for(int i=0; i<array11.length; i++) {
            for(int j=0; j<array12.length; j++) {
                System.out.print(tables[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("=======================================================");
        // 11. Write a program that ask the user for an integer and repeat that question until user give you a
        // specific value that user already has been told about as a message in your program. Store these values
        // in an array and print that array. After that reverse the array elements so that the first element becomes
        // the last element, the second element becomes the second to last element, etc. Do not just reverse the
        // order in which they are printed. You need to change the way they are stored in the array.
        int definedMessage = 40;
        int[] array13 = new int[0];
        int userChoice;
        do {
            System.out.println("Enter a number:");
            Scanner scanner = new Scanner(System.in);
            userChoice = scanner.nextInt();
            array13 = Arrays.copyOf(array13, array13.length+1);
            array13[array13.length-1] = userChoice;
        } while(definedMessage != userChoice);
        System.out.println("Printing array which contains entered user choices...");
        for(int arr : array13) {
            System.out.print(arr + " ");
        }
        System.out.println();
        int[] array14 = new int[array13.length];
        for(int i=array13.length, j=0; i>0 && j<array14.length; i--, j++) {
            array14[j] = array13[i-1];
        }
        System.out.println("Reversed user choices...");
        for(int arr : array14) {
            System.out.print(arr + " ");
        }
        System.out.println();

        System.out.println("=======================================================");
        // 12. Write a program which will print the diagonal elements of two-dimensional array. Expected output: 1 4 9
        System.out.println("Diagonal elements of two-dimensional array: ");
        for(int i=0; i<tables.length; i++) {
            for(int j=0; j<tables[i].length; j++) {
                if(i == j) {
                    System.out.print(tables[i][j] + " ");
                }
            }
        }
        System.out.println();

        System.out.println("=======================================================");
        // 13. Create two arrays with arbitrary size and fill one with random numbers. Then copy over the numbers from the array with random
        // numbers so that the even numbers are located in the rear (the right side) part of the array and the odd numbers are located in the
        // front part (the left side).
        int[] array15 = new int[20];
        int[] array16 = new int[20];
        Random random = new Random();
        for(int i=0; i<array15.length; i++) {
            array15[i] = random.nextInt(1, 100);
        }
        int j=0;
        for(int arr : array15) {
            if(arr%2 == 1) {
                array16[j] = arr;
                j++;
            }
        }
        for(int arr : array15) {
            if(arr%2 == 0) {
                array16[j] = arr;
                j++;
            }
        }
        System.out.println("Odd random numbers in left part and Even random numbers in right part of the array:");
        for(int arr : array16) {
            System.out.print(arr + " ");
        }
        System.out.println();
        System.out.println("=======================================================");
    }
}
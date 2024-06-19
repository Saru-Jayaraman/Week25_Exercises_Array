package se.lexicon;

import java.util.Arrays;

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
        // the index of an element in the array. If the element doesn’t exist your method
        // should return -1 as value. Expected output: Index position of number 5 is: 2.
        int[] array1 = {11, 23, 39, 45, 66};
        int elementToFind = 45;
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
        System.out.println("After sorting: " + Arrays.toString(array2));

        System.out.println("=======================================================");
        // 4. Write a program which will copy the elements of one array into another array.
        // Expected output: Elements from first array: 1 15 20
        // Elements from second array: 1 15 20
        int[] array3 = new int[]{1, 15, 20};
        int[] array4 = Arrays.copyOf(array3, array3.length);
        System.out.println(Arrays.toString(array4));

        System.out.println("=======================================================");
        // 5. Create a two-dimensional string array [2][2]. Assign values to the
        // 2-dimentional array containing any Country and City. Expected output: France Paris
        // Sweden Stockholm
        String[][] countryCity = new String[2][2];
        countryCity[0][0] = "France";
        countryCity[0][1] = "Paris";
        countryCity[1][0] = "Sweden";
        countryCity[1][1] = "Stockholm";
        for(int i=0; i<countryCity.length; i++) {
            for(int j=0; j<countryCity[i].length; j++) {
                System.out.print(countryCity[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=======================================================");
        // 6. Write a program which will set up an array to hold the next values in this order:
        // 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
        // Expected output: Average is: 17.3
//        int[] array5 = new int[]{43, 5, 23, 17, 2, 14};
        double[] array5 = new double[]{10, 20, 30, 40, 50, 65};
        double sum = 0;
        double average;
        for(int i=0; i<array5.length; i++) {
            sum = sum + array5[i];
        }
        System.out.println(sum + " " + array5.length);
        average = sum/array5.length;
        System.out.println("Average is: " + average);
    }
}

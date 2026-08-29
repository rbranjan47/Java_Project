package one_code_each_day.Arrays_Code;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class abc_arrays {

    // Arrays are a fundamental data structure in programming that allow you to store multiple values of the same type in a single variable. In Java, arrays are objects that can hold a fixed number of values, and they are indexed starting from 0.
    // Types of arrays in Java:
    // 1. Single-dimensional arrays: These are the most basic type of arrays, where you can store a list of values in a single row. For example, int[] numbers = {1, 2, 3, 4, 5};
    // 2. Multidimensional arrays: These are arrays that can hold multiple rows and columns of values. For example, int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    // 3. Jagged arrays: These are arrays where each row can have a different number of columns. For example, int[][] jaggedArray = {{1, 2}, {3, 4, 5}, {6}};

    // In C++ > Vectors are dynamic arrays that can grow and shrink in size as needed.
    //          They are part of the Standard Template Library (STL) and provide a convenient way to work with collections of data.
    // Example of a vector in C++:
    // #include <vector>
    // std::vector<int> numbers = {1, 2, 3, 4, 5};


    // In Java, ArrayList class, which is part of the Java Collections Framework. ArrayLists are dynamic arrays that can also grow and shrink in size, and they provide various methods for manipulating the elements they contain.
    // In Python, lists are dynamic arrays that can hold elements of different types. They are part of the built-in data structures in Python and provide a flexible way to work with collections of data.

    // In size, there are two types of arrays in Java:
    // 1. Fixed-size arrays: These are arrays that have a predetermined size, which cannot be changed after they are created.
    //                        For example, int[] fixedArray = new int[5]; creates an array that can hold exactly 5 integers.
    // 2. Dynamic-size arrays: These are arrays that can grow or shrink in size as needed. In Java, you can use classes like ArrayList to create dynamic arrays. 
    //                         For example, ArrayList<Integer> dynamicArray = new ArrayList<>(); creates a dynamic array that can hold an arbitrary number of integers.

    public static void main(String[] args) {
        int[] integer_array = new int[]{2, 1, 2, 3, 4, 6, 7, 100, 10, 4};
        System.out.println("Array elements are: ");
        for (int i = 0; i < integer_array.length; i++) {
            System.out.print(integer_array[i] + " ");
        }


        // Operation on arrays:
        // 1. Searching: You can search for a specific element in an array using linear search or binary search algorithms.
        for (int i = 0; i < integer_array.length; i++) {
            if (integer_array[i] == 4) {
                System.out.println("\nElement 4 found at index: " + i);
                break;
            }
        }

        // 2. Sorting: You can sort the elements of an array in ascending or descending order using various sorting algorithms like bubble sort, selection sort, or quicksort.
        // Example of sorting using Arrays.sort() method:
        java.util.Arrays.sort(integer_array);
        System.out.println("Sorted array elements are: ");
        for (int i = 0; i < integer_array.length; i++) {
            System.out.print(integer_array[i] + " ");
        }

        // 3. Insertion: You can insert a new element into an array by creating a NEW array with a larger size and copying the existing elements along with the new element.
        int newElement = 5;
        int[] newArray = new int[integer_array.length + 1];
        for (int i = 0; i < integer_array.length; i++) {
            newArray[i] = integer_array[i];
        }

        //printing the array after insertion
        System.out.println("\nArray elements after insertion of " + newElement + " are: ");
        for (int i = 0; i < integer_array.length; i++) {
            System.out.print(integer_array[i] + " ");
        }


        // 4. Deletion: You can delete an element from an array by creating a NEW array with a smaller size and copying the existing elements except for the one you want to delete.
        int deleteElement = 2;
//        int[] deleteArray = new int[integer_array.length - 1];
//        int index = 0;
//        for (int i = 0; i < integer_array.length; i++) {
//            if (integer_array[i] != deleteElement) {
//                deleteArray[index++] = integer_array[i];
//            }
//        }
        int array_size = integer_array.length;
        for (int i = 0; i < array_size; i++) {
            if (integer_array[i] == deleteElement) {
                break;
            }
            if (integer_array[i] == array_size) {
                System.out.println(array_size);
            }
            for (int j = 0; j < array_size - 1; j++) {
                integer_array[j] = integer_array[j + 1];
            }
            array_size--;
        }

        //Printing the array after deletion
        System.out.println("\nArray elements after deletion of " + deleteElement + " are: ");
        for (int i = 0; i < integer_array.length; i++) {
            System.out.print(integer_array[i] + " ");
        }

        List<Integer> lists = new ArrayList<>(integer_array.length);
        for (int integerArrayNum : integer_array) {
            lists.add(integerArrayNum);
        }
        Collections.sort(lists);
        System.out.println(lists);
    }
}

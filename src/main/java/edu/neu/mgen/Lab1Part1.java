package edu.neu.mgen;

public class Lab1Part1 {

     public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] x = { 1, 2, 3, 4, 5 };
        int[] y = { 6, 7, 8, 9, 10 };

        int[] z = new int[5];

        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.println("Array x = " + arrToString(x));
        System.out.println("Array y = " + arrToString(y));
        System.out.println("Array z = x + y = " + arrToString(z));
    }

    public static String arrToString(int[] arr) {
        String result = "{";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) {
                result += ", ";
            }
        }
        result += " }";
        return result;
    }
}

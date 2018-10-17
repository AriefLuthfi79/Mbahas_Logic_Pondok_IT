package com.pondokit.logic;

public class Logic4 {
    public static void main(String args[]) {
        jumpToSoal7(5);
    }

    static int[] fibonacci(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr;
    }

    static void printArray2D(int n, int p, String[][] array2D) {
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < p; column++) {
                System.out.print(array2D[row][column] + "\t");
            }
            System.out.println();
        }
    }

    static void jumpToSoal3(int leng) {
        int changeLength = (leng*2)-1;
        String[][] initArray2D = new String[leng][changeLength];

        for (int row = 0; row < leng; row++) {
            int counter = 1;
            for (int col = 0; col < changeLength; col++){
                if (col <= leng+row-1 && col >= (leng-1)-row) {
                    initArray2D[row][col] = Integer.toString(counter);
                    counter++;
                } else {
                    initArray2D[row][col] = " ";
                }
            }
        }
        printArray2D(leng, changeLength, initArray2D);
    }

    static void jumpToSoal4(int leng) {
        int triangle = (2*leng) - 1;

        String[][] initArray2D = new String[leng][triangle];

        for (int i = 0; i < leng; i++) {
            int counter = 1;
            for (int j = 0; j < triangle; j++) {
                if (j >= i && j <= (triangle-1) - i) {
                    initArray2D[i][j] = Integer.toString(counter);
                    counter++;
                } else {
                    initArray2D[i][j] = " ";
                }
            }
        }
        printArray2D(leng, triangle, initArray2D);
    }

    static void jumpToSoal5(int leng) {
        String[][] initArr2D = new String[leng][leng];
        int mid = (leng-1)/2;

        for (int row = 0; row < leng; row++) {
            int counter = 1;
            for (int col = 0; col < leng; col++) {
                if (row <= col + mid && col <= row + mid && row >= leng - 1 - col - mid && row <= leng - 1 - col + mid) {
                    initArr2D[row][col] = Integer.toString(counter);
                    counter++;
                } else {
                    initArr2D[row][col] = " ";
                }
            }
        }
        printArray2D(leng, leng, initArr2D);
    }

    static void jumpToSoal6(int length) {
        int changeLength = (2*length)-1;
        int mid = (changeLength-1)/2;
        String[][] initArray2D = new String[length][changeLength];

        for (int row = 0; row < length; row++) {
            int counter = 1;
            for (int col = 0; col < changeLength; col++) {
                if (col <= length+row-1 && col >= (length-1)-row) {
                    initArray2D[row][col] = Integer.toString(counter);
                    if (col < mid) counter += 2; else counter -= 2;
                } else {
                    initArray2D[row][col] = " ";
                }
            }
        }
        printArray2D(length, changeLength, initArray2D);
    }

    static void jumpToSoal7(int length) {
        int changeLength = (2*length)-1;
        int mid = (changeLength-1)/2;
        String[][] initArray2D = new String[length][changeLength];

        for (int row = 0; row < length; row++) {
            int counter = 1;
            for (int col = 0; col < changeLength; col++) {
                if (col >= row && row <= (changeLength-col)-1) {
                    initArray2D[row][col] = Integer.toString(counter);
                    if (col < mid) counter += 2; else counter -= 2;
                } else {
                    initArray2D[row][col] = " ";
                }
            }
        }
        printArray2D(length, changeLength, initArray2D);
    }

    static void jumpToSoal8(int leng) {

    }
}
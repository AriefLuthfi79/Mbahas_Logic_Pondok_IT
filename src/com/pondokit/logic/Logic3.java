package com.pondokit.logic;

import java.util.Scanner;

public class Logic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        jumpToSoal8(length);
    }

    static int[] tribonacci(int n) {
        int[] arrayTri = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                arrayTri[i] = 1;
            } else {
                arrayTri[i] = arrayTri[i - 1] + arrayTri[i - 2] + arrayTri[i - 3];
            }
        }
        return arrayTri;
    }

    static void printArray2D(int n, String[][] array2D) {
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(array2D[row][column] + "\t");
            }
            System.out.println();
        }
    }

    static int[] fibonacci(int n) {
        int[] arrayFbo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                arrayFbo[i] = 1;
            } else {
                arrayFbo[i] = arrayFbo[i - 1] + arrayFbo[i - 2];
            }
        }
        return arrayFbo;
    }

    static int convertCounter(int n, int mid, int leng) {
        int count;
        if (n > mid) {
            count = leng - n - 1;
        } else {
            count = n;
        }
        return count;
    }

    static int counter(int n, int mid, int leng) {
        int count;
        if (n > mid)
            count = leng - n;
        else
            count = n + 1;
        return count;
    }

    static int[] fibGen(int n) {
        int[] arrayFibo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 4)
                arrayFibo[i] = 1;
            else
                arrayFibo[i] = arrayFibo[i - 1] + arrayFibo[i - 2];
        }
        return arrayFibo;
    }

    static int changeToASCII(int n) {
        final int DEFAULT = 65;
        return DEFAULT + (n/2);
    }

    static void soal1() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j : fibonacci(i)) {
            System.out.print(j + " ");
        }
    }

    static void soal2() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        for (int j : tribonacci(length)) {
            System.out.print(j + " ");
        }
    }

    static void jumpToSoal6(int length) {
        int[] arrayFibo = fibonacci(length);
        String[][] initArray2D = new String[length][length];

        for (int row = 0; row < length; row++) {
            for (int column = 0; column < length; column++) {
                if (row == column)
                    initArray2D[row][column] = Integer.toString(arrayFibo[row]);
                else if ((length-column-1) == row )
                    initArray2D[row][column] = Integer.toString(arrayFibo[column]);
                else if (row < column && row < (length-column-1))
                    initArray2D[row][column] = "A";
                else if (row > (length-column-1) && row < column)
                    initArray2D[row][column] = "B";
                else if (row > column && row > (length-column-1))
                    initArray2D[row][column] = "C";
                else if (row > column && row < (length-column-1))
                    initArray2D[row][column] = "D";
            }
        }
        printArray2D(length, initArray2D);
    }

    static void soal7(int leng) {
        int[] arrFibo = fibonacci(leng);
        String[][] initArray2D = new String[leng][leng];
        int mid = (leng-1)/2;

        for (int row = 0; row < leng; row++) {
            for (int column = 0; column < leng; column++) {
                if (row <= column && row <= (leng-column-1) || row >= column && row >= (leng-column-1)) {
                    initArray2D[row][column] = Integer.toString(arrFibo[convertCounter(row, mid, leng)]);
                } else if (row < column && row > leng - column - 1 || row > column && row < (leng-column-1)) {
                    initArray2D[row][column] = Integer.toString(arrFibo[convertCounter(column, mid, leng)]);
                }
            }
        }
        printArray2D(leng, initArray2D);
    }

    static void jumpToSoal8(int leng) {
        String[][] initArray2D = new String[leng][leng];
        int mid = (leng-1)/2;

        for (int row = 0; row < leng; row++) {
            for (int column = 0; column < leng; column++) {
                if (row <= column && row <= (leng-column-1) && row%2==0 || row >= column && row >= (leng-column-1) && row%2==0) {
                    initArray2D[row][column] = Integer.toString(counter(row, mid, leng));
                } else if (row <= column && row >= (leng-column-1) && column%2==0 || row >= column && row <= (leng-column-1) && column%2==0) {
                    initArray2D[row][column] = Integer.toString(counter(column, mid, leng));
                } else {
                    initArray2D[row][column] = "";
                }
            }
        }
        printArray2D(leng, initArray2D);
    }

    static void jumpToSoal9(int leng) {
        String[][] initArray2D = new String[leng][leng];
        int mid = (leng - 1) / 2;
        int[] arrayFib = fibGen(leng);

        for (int row = 0; row < leng; row++) {
            for (int column = 0; column < leng; column++) {
                if (row <= column && row <= (leng - column - 1) || row >= column && row >= (leng - column - 1)) {
                    if (row % 2 == 0)
                        initArray2D[row][column] = Integer.toString(arrayFib[(convertCounter(row, mid, leng))]);
                    else
                        initArray2D[row][column] = " ";
                } else if (row < column && row > (leng-column-1) || row > column && row < (leng-column-1)) {
                    if (column % 2 == 0)
                        initArray2D[row][column] = Integer.toString(arrayFib[convertCounter(column, mid, leng)]);
                    else
                        initArray2D[row][column] = " ";
                } else {
                    initArray2D[row][column] = "";
                }
            }
        }
        printArray2D(leng, initArray2D);
    }

    static void jumpToSoal10(int leng) {
        String[][] initArray2D = new String[leng][leng];
        int mid = (leng - 1) / 2;
        int[] arrayFib = fibGen(leng);

        for (int row = 0; row < leng; row++) {
            for (int col = 0; col < leng; col++) {
                if (row >= col && row >= (leng - col - 1) || row <= col && row <= (leng - col - 1)) {
                    if (row % 2 == 0)
                        initArray2D[row][col] = Integer.toString(arrayFib[convertCounter(row, mid, leng)]);
                    else
                        initArray2D[row][col] = Character.toString((char) changeToASCII(convertCounter(row, mid, leng)));
                } else if (row < col && row > (leng - col - 1) || row > col && row < (leng - col - 1)) {
                    if (col % 2 == 0)
                        initArray2D[row][col] = Integer.toString(arrayFib[convertCounter(col, mid, leng)]);
                    else
                        initArray2D[row][col] = Character.toString((char) changeToASCII(convertCounter(col, mid, leng)));
                } else {
                    initArray2D[row][col] = "";
                }
            }
        }
        printArray2D(leng, initArray2D);
    }
}

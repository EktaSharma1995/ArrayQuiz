/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysquizlab;

import java.util.Scanner;

/**
 *
 * @author ektasharma
 */
public class ArrayUtility {
    private int count, size ;
   
    public ArrayUtility(int size) {
        this.size = size;
        this.count = 0;
    }

    public ArrayUtility() {
        this(10);
    }

    public void fillArray(double[] doubleArray) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int size = keyBoard.nextInt();

        for (int idx = 0; idx < size; idx++) {
            System.out.println("Enter number" + idx);
            double value = keyBoard.nextInt();
            doubleArray[idx] = value;
        }
    }

    public double getAverage(double[] doubleArray) {
        double sum = 0;
        for (int idx = 0; idx < doubleArray.length; idx++) {
            sum = sum + doubleArray[idx];
          }
        double average = sum / doubleArray.length;
        System.out.println("average is :" + average);
        return average;
    }

    public int getAboveAverage(double[] doubleArray, double avg) {
        int count = 0;
        avg = getAverage(doubleArray);
        for (int idx = 0; idx < doubleArray.length; idx++) {
            if (doubleArray[idx] > avg) {
                count++;
            }
        }
        System.out.println("Count is :" + count);
        return count;
    }

    public void printArray(double[] doubleArray) {
        System.out.println("************** List of numbers ***************");
        for (int index = 0; index < doubleArray.length; index++) {
            System.out.println("Numbers are :" + doubleArray[index]);
        }
    }

    public int getsize() {
        return this.size;
    }

    public int getCount() {
        return this.count;
    }
}

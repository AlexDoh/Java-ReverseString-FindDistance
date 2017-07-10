package com.odmytrenko.findmindistance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayOfNumbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int firstMinIndex = findMinIndex(arrayOfNumbers);
        arrayOfNumbers[firstMinIndex] = Integer.MAX_VALUE;
        int secondMinIndex = findMinIndex(arrayOfNumbers);

        System.out.println(Math.abs(firstMinIndex - secondMinIndex));
    }

    public static int findMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}

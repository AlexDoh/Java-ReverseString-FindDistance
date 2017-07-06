package hometask1.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArrayOfNumbers = reader.readLine().split(" ");
        List<Integer> listOfNumbers = new ArrayList<>();
        for(String s : stringArrayOfNumbers) {
            listOfNumbers.add(Integer.parseInt(s));
        }

        int firstMinIndex = findMinIndex(listOfNumbers);
        listOfNumbers.set(firstMinIndex, Collections.max(listOfNumbers));
        int secondMinIndex = findMinIndex(listOfNumbers);

        System.out.println(Math.abs(firstMinIndex - secondMinIndex));
    }

    public static int findMinIndex(List<Integer> list) {
        int minIndex = list.indexOf(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(minIndex)) {
                minIndex = list.indexOf(list.get(i));
            }
        }
        return minIndex;
    }
}

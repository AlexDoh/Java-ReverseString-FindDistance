package com.odmytrenko.reversestring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        printReversedString(reader.readLine());
    }

    public static void printReversedString(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}

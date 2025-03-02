package com.Day_02.map_Interface;


import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("example.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            for (String word : line.toLowerCase().replaceAll("[^a-z ]", "").split(" ")) {
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        br.close();
        System.out.println(wordCount);
    }
}



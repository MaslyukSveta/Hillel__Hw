package com.hillel.hw.hw15.text;

import java.util.HashMap;
import java.util.Map;

public class Worker {
    private String dataString;
    private HashMap<String, Integer> foundWords;

    public Worker(String inputString){
        this.dataString = inputString;
        this.foundWords = new HashMap<>();
        countWords(getWords(trimPunctuation()));
    }

    private String trimPunctuation(){
        return dataString = dataString.replaceAll("[!?,.-]", "");
    }

    private String[] getWords(String inputString) {
        return inputString.split(" ");
    }

    private void countWords(String[] words){
        int value = 1;
        for (String key: words) {
            if (foundWords.containsKey(key)){
                foundWords.put(key, foundWords.get(key) + 1);
            }else {
                foundWords.put(key, value);
            }
        }
    }

    public void printReport () {

        for (Map.Entry entry: foundWords.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }

    }

}

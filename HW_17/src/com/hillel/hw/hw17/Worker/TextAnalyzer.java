package com.hillel.hw.hw17.Worker;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalyzer {

    private String text;

    public TextAnalyzer(String text) {
        this.text = text;
    }
    public Map<String, Integer> countOfWords() {
        Pattern patten = Pattern.compile("(\\w+\\b)(?!.*\\1\\b)");
        Matcher matcher = patten.matcher(text);
        Map<String, Integer> result = new HashMap<>();
        while (matcher.find()) {
            Pattern word = Pattern.compile("\\b" + matcher.group() + "\\b");
            Matcher foundWordToCount = word.matcher(text);
            int count = (int) foundWordToCount.results().count();
            result.put(matcher.group(), count);
        }
        return result;
    }

    public String replaceSymbol(int number, char symbol) {
        return text.replaceAll(String.format("(\\b\\w{%d})\\w", number - 1),"$1" + symbol);
    }


    public int numberOfPunctuationMarks() {
        Pattern pattern = Pattern.compile("\\p{P}");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
    public String getText() {
        return text;
    }
}

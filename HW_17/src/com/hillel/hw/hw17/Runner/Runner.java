package com.hillel.hw.hw17.Runner;

import com.hillel.hw.hw17.Worker.TextAnalyzer;

public class Runner {
    public static void main(String[] args) {
        String inputText = "Computer science is the study of algorithmic processes and computational machines.[1][2] As a discipline, computer science spans a range of topics from theoretical studies of computation and information to the practical issues of implementing computing systems in hardware and software.[3][4] Computer science addresses any computational problems, especially information processes, such as communication, control, perception, learning, and intelligence.[5][6][7]";

        TextAnalyzer textAnalyzer = new TextAnalyzer(inputText);
        System.out.println(textAnalyzer.countOfWords());
        System.out.println(textAnalyzer.replaceSymbol(3, '2'));
        System.out.println(textAnalyzer.numberOfPunctuationMarks());
        System.out.println("Count of punct marks = " + textAnalyzer.numberOfPunctuationMarks());
    }
}

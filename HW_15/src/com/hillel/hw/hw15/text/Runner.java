package com.hillel.hw.hw15.text;

import java.io.File;

public class Runner {
    String data = Reader.readFile(new File("Some Words.txt"));
    Worker finder = new Worker(data);
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.javalearning.purejava.java8.streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Antonov
 */
public class LongWords {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:/Master/Documents/TomographySoftwareDiploma/pom.xml");

        String contents = new String(Files.readAllBytes(path
        ), Charset.defaultCharset());

        String[] wordsArray = contents.split("\\s+");

        List<String> words = Arrays.asList(wordsArray);

        int countLongWords = 0;

        for (String entry : words) {
            if (entry.length() > 12) {
                countLongWords++;
            }
        }

        System.out.println(countLongWords);

        long count = words.stream().filter(w -> w.length() > 12).count();
        System.out.println(count);

    }
}

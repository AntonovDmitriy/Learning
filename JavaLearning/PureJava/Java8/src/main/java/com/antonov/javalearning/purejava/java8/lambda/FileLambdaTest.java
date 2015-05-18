/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.javalearning.purejava.java8.lambda;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 *
 * @author Antonov
 */
public class FileLambdaTest {

    public static void main(String[] args) {

        File file = new File("d:/Master");
        File[] files = file.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return dir.isDirectory();
            }
        });

        for (File entry : files) {
            System.out.println(entry.getName());
        }

        System.out.println("--------------------------------------");

        File[] files4 = file.listFiles((File f, String n) -> f.isDirectory());
        File[] files3 = file.listFiles((File f) -> f.isDirectory());
        File[] files2 = file.listFiles(f -> f.isDirectory());

        for (File entry : files2) {
            System.out.println(entry.getName());
        }

        File[] files5 = file.listFiles(File::isDirectory);

        System.out.println("------------------------------");

        for (File entry : files5) {
            System.out.println(entry.getName());
        }
    }
}

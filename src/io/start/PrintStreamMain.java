package io.start;

import java.io.PrintStream;

public class PrintStreamMain {
    public static void main(String[] args) {
        System.out.println("hello");
        PrintStream printStream = System.out;
        printStream.println("test");

    }
}

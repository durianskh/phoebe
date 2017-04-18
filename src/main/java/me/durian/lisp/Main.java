package me.durian.lisp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by durianskh on 4/18/17.
 */
public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.lines().forEach(line -> System.out.println(line.toUpperCase()));
    }
}

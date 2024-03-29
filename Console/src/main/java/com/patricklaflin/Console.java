package com.patricklaflin;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Console {
    public static String readLine() {
        StringBuilder respsonse = new StringBuilder();
        try {
            BufferedInputStream bin = new BufferedInputStream(System.in);
            int in = 0;
            char inChar;
            do {
                in = bin.read();
                inChar = (char) in;
                if (in != -1) {
                    respsonse.append(inChar);
                }
            } while ((in != -1) & (inChar != '\n'));
            bin.close();
            return respsonse.toString();
        } catch (IOException e) {
            System.out.println("Exception: " +e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.print("You are standing at the end of the road ");
        System.out.print("before a small brick building. Around you ");
        System.out.print("is a forest.  A small stream flows out of  ");
        System.out.println("the building and down a gully.\n ");
        System.out.print("> ");
        String input = Console.readLine();
        System.out.println("That's not a verb I recognize.");


    }
}

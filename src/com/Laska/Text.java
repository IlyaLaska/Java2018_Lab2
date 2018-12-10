package com.Laska;

import java.util.Scanner;

public class Text {
    private String data;

    Text() {this.data = "";}

    @Override
    public String toString() {
        return data;
    }

    /**
     * initialise Text by keyboard input
     */
    void userInit() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\nclose\n");
        System.out.println("Please input your text. When finished, press Enter, type \"close\" and press Enter again");
        data = sc.next();
    }

    /**
     * initialise Text with random values
     */
    void randInit() {
        int length = (int) (Math.random() * 500 + 200);
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < length; i++) {
            temp.append((char) (Math.random() * 256));
        }
        data = temp.toString();
    }

    /**
     * Lab2 task
     *
     * @return returns longest non-word substring
     */
    String getLongestNonLetterSubstring() {
        String[] strings;
        strings = data.split("[a-zA-Z]+");
        //TODO why is strings[0] always empty?
        return findLongest(strings);
    }

    private String findLongest(String[] strings) {
        int maxLen = 0;
        int pos = 0;
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > maxLen) {
                maxLen = strings[i].length();
                pos = i;
            }
        }
        return strings[pos];
    }
}

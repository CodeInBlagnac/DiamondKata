package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Diamond {

    private static final String A = "A";
    private static final String B = "B";
    private static final String SPACE = " ";

    public static String draw(String character) {
        List<String> lines = new ArrayList<>();
        int charNum = character.charAt(0) - 'A';
        String line1;
        if (charNum == 0) {
            line1 = A;
            lines.add(line1);
        }
        if (charNum == 1) {
            line1 = SPACE + A;
            lines.add(line1);
            lines.add(B + SPACE + B);
            lines.add(line1);
        }
        if (charNum == 2) {
            line1 = SPACE + SPACE + A;
            lines.add(line1);
            lines.add(SPACE + B + SPACE + B);
        }
        return String.join("\n", lines);
    }
}

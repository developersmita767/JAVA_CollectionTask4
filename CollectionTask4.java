//Write a program to find the letters which repeated in a given string using any set class

import java.util.HashSet;
import java.util.Set;

public class CollectionTask4 {
    public static void main(String[] args) {
        String inputString = "hello world";
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        for (char c : inputString.toCharArray()) {
            if (!uniqueChars.add(c)) { // If the character is already present, it's a repeat
                repeatedChars.add(c);
            }
        }

        System.out.println("Letters repeated in the string \"" + inputString + "\":");
        for (char c : repeatedChars) {
            System.out.print(c + " ");
        }
    }
}

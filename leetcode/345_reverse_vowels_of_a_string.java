package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        Character[] vowels = new Character[] { 'a', 'e', 'i' , 'o' , 'u' };
        LinkedList<Character> listArray = new LinkedList<Character>();
        var builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) { 
            if (Arrays.asList(vowels).contains(Character.toLowerCase(s.charAt(i)))) {
                listArray.add(s.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (Arrays.asList(vowels).contains(Character.toLowerCase(s.charAt(i)))) {
                builder.append(listArray.getLast());
                listArray.removeLast();
            }
            else {
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();
    }
}

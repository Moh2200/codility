package company.microsoft;// Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.
// Example 1:
//
// Input: "ab-cd"
// Output: "dc-ba"

//Example 2:
//
// Input: "a-bC-dEf-ghIj"
// Output: "j-Ih-gfE-dCba"

// Example 3:
// Input: "Test1ng-Leet=code-Q!"
// Output: "Qedo1ct-eeLg=ntse-T!"


// Note:
// 1. S.length <= 100
// 2. 33 <= S[i].ASCIIcode <= 122
// 2. S doesn't contain \ or "

import java.util.*;


class ReverseOnlyString {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
    }

    public static String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack();
        for (char c: S.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder ans = new StringBuilder();
        for (char c: S.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }

        return ans.toString();
    }

}


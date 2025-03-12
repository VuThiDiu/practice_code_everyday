package leetcode;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class LCArray {

    /*
    link: https://leetcode.com/problems/concatenation-of-array/
    Level: Easy
    * */
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] result = new int[length * 2];
        for (int i = 0; i < length; i++) {
            result[i] = nums[i];
            result[i + length] = nums[i];
        }
        return result;
    }

    /*
    link: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
    Level: Easy 
    * */
    public static int[] replaceElements(int[] arr) {
        int maxInRight = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxInRight;
            maxInRight = Math.max(temp, maxInRight);
        }
        return arr;
    }


    /*
    link: https://leetcode.com/problems/is-subsequence/
    Level: Easy
    * */

    /*C1: Normal */
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        if (s.length() > t.length()) return false;
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) queue.add(s.charAt(i));
        Character character = queue.poll();
        for (int i = 0; i < t.length(); i++) {
            if (character.equals(t.charAt(i))) {
                character = queue.poll();
                if (Objects.isNull(character)) return true;
            }
        }
        return Objects.isNull(character);
    }

    /*C2: recursion*/


    /*C3:Dynamic Program*/


}

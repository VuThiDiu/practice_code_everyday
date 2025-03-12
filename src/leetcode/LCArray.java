package leetcode;

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




}

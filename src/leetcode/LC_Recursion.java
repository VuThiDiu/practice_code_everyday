package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC_Recursion {

    /* Easy: https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/*/
    public static char kthCharacter(int k) {
        StringBuilder stringBuilder = new StringBuilder("a");
        return recursion(k, stringBuilder).charAt(k-1);
    }

    public static String recursion(int k, StringBuilder str){
        if(str.length() >= k) return str.toString();
        else{
            int length = str.length();
            for(int i = 0; i < length ; i++){
                 char c = str.charAt(i);
                 c++;
                 str.append(c);
            }
            return recursion(k, str);
        }
    }

    /*Easy: https://leetcode.com/problems/power-of-three/description/?envType=problem-list-v2&envId=rec*/
    public static boolean isPowerOfThree(int n) {
        if( n < 3 ){
            return n == 1 ? true : false;
        }
        if ( n % 3 != 0) return false;
        return isPowerOfThree(n/3);
    }


    /*Easy: https://leetcode.com/problems/unique-3-digit-even-numbers/description/?envType=problem-list-v2&envId=recursion*/
    //TODO:
}

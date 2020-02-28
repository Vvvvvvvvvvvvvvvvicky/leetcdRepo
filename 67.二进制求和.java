import java.rmi.dgc.Lease;

/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        StringBuffer arrays = new StringBuffer();
        int tempTotal = 0;
        int aIndex = a.length()-1;
        int bIndex = b.length()-1;

        while(aIndex>=0 || bIndex>=0 || tempTotal>0){
            tempTotal += aIndex>=0?a.charAt(aIndex--)-'0':0;
            tempTotal += bIndex>=0?b.charAt(bIndex--)-'0':0;
            arrays.append(tempTotal % 2);
            tempTotal = tempTotal / 2;
        }
        return arrays.reverse().toString();
    }
}
// @lc code=end


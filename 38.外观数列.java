/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        String result = "1";
        if(n==1){
            return result;
        }
        
        for(int i=1;i<n;i++){
            result = say(result);
        }
        return result;
    }

    public String say(String n_str) {
        StringBuilder result = new StringBuilder();

        char temp = n_str.charAt(0);
        int count = 1;
        
        if(n_str.length()>1){
            for(int i=1;i<n_str.length();i++){
                if (n_str.charAt(i) == temp){
                    count++;
                }else{
                    result.append(count).append(temp);
                    temp = n_str.charAt(i);
                    count = 1;
                }
            }
        }
        
        if(temp == n_str.charAt(n_str.length()-1)){
            result.append(count).append(temp);
        }

        return result.toString();
    }

}
// @lc code=end


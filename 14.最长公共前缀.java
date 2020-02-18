/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        String longestCommonPrefix = "";

        //空字符串
        if(strs.length == 0){
            return longestCommonPrefix;
        }
        
        //只有一个字符串
        if(strs.length==1){
            return longestCommonPrefix = strs[0];
        }

        //两个或两个以上比较
        for(int i=0;i<strs.length;i++){
            for(int j=i+1;j<strs.length;j++){
                commonPrefix = getCommonPrefix(strs[i],strs[j]);
                if(i==0){
                    longestCommonPrefix = commonPrefix;
                }
                if(commonPrefix.length()<longestCommonPrefix.length()){
                    longestCommonPrefix = commonPrefix;
                }
            }
        }
        return longestCommonPrefix;
    }

    //获取公共前缀
    public String getCommonPrefix(String i_str,String j_str){
        char[] i_str_chars = i_str.toCharArray();
        char[] j_str_chars = j_str.toCharArray();
        int min_length = i_str.length()<j_str.length()?i_str.length():j_str.length();
        StringBuilder prefix = new StringBuilder();
        for(int i=0;i<min_length;i++){
            if(i_str_chars[i]==j_str_chars[i]){
                prefix.append(i_str_chars[i]);
            }else{
                return prefix.toString();
            }
        }
        return prefix.toString();

    }
}
// @lc code=end


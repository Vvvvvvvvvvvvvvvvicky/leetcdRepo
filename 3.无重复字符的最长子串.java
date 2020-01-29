/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] strChars = s.toCharArray();
        StringBuilder subSeq = new StringBuilder(); //临时字符串变量
        String resultStr = new String(); //结果字符串
       
        for(int i=0;i<strChars.length;i++){
            subSeq = new StringBuilder(String.valueOf(strChars[i]));
            for(int j=i+1;j<strChars.length;j++){
                //查询重复字符串
                if(subSeq.toString().indexOf( strChars[j] ) < 0){
                    subSeq.append(strChars[j]);
                    //当到达最后一个字符时，且当前字符串大于上一个字符串序列
                    if(subSeq.length()>resultStr.length()&&j==strChars.length-1){
                        resultStr = subSeq.toString(); 
                    }
                }else{
                    if(subSeq.length()>resultStr.length()){
                        resultStr = subSeq.toString();
                    }
                    break;
                }
            }
        }
        //处理长度为0、为1的字符串
        if ((resultStr.length()==0)){
            resultStr = subSeq.toString();
        }
        return resultStr.length();
    }
}
// @lc code=end


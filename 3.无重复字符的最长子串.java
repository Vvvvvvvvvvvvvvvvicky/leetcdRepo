/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] strChars = s.toCharArray();
        StringBuilder subSeq = new StringBuilder(); //��ʱ�ַ�������
        String resultStr = new String(); //����ַ���
       
        for(int i=0;i<strChars.length;i++){
            subSeq = new StringBuilder(String.valueOf(strChars[i]));
            for(int j=i+1;j<strChars.length;j++){
                //��ѯ�ظ��ַ���
                if(subSeq.toString().indexOf( strChars[j] ) < 0){
                    subSeq.append(strChars[j]);
                    //���������һ���ַ�ʱ���ҵ�ǰ�ַ���������һ���ַ�������
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
        //������Ϊ0��Ϊ1���ַ���
        if ((resultStr.length()==0)){
            resultStr = subSeq.toString();
        }
        return resultStr.length();
    }
}
// @lc code=end


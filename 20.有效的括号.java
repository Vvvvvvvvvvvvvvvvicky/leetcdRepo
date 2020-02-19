import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        char[] s_chars = s.toCharArray();
        Stack stack_chars = new Stack<Character>();
        if(s_chars.length==0){
            return true;
        }
        if(s_chars.length==1){
            return false;
        }
        stack_chars.push(s_chars[0]);
        Character stack_top ;
        for(int i = 1;i<s_chars.length;i++){
            if(s_chars[i]=='('|s_chars[i]=='{'|s_chars[i]=='['){
                stack_chars.push(s_chars[i]);
            }else{
                if(!stack_chars.isEmpty()){
                     stack_top = (Character)stack_chars.peek();
                     if(isMatch(stack_top, s_chars[i])){
                        stack_chars.pop();
                    }else 
                        return false;
                }else 
                    return false;
            }
        }
        if(!stack_chars.isEmpty()){
            return false;
        }
        return true;
    }

    public boolean isMatch(char s_char_1,char s_char_2){
        switch(s_char_1){
            case '(': if(s_char_2==')') return true; else return false;
            case '[': if(s_char_2==']') return true; else return false;
            case '{': if(s_char_2=='}') return true; else return false;
            default: return false;
        }
    }
}
// @lc code=end


import java.util.Stack;

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        Stack<Character> romanStack = new Stack<>();
        char[] s_chars = s.toCharArray();
        int total = 0;

        for(int i=0; i<s_chars.length;i++){
            if(romanStack.empty()){
                romanStack.push(s_chars[i]);
                continue;
            }

            char stack_char = romanStack.peek();

            //特殊情况需要计算
            if( (('I'==stack_char & (s_chars[i]=='V' | s_chars[i]=='X'))
            || ('X'==stack_char & (s_chars[i]=='L' | s_chars[i]=='C'))
            || ('C'==stack_char & (s_chars[i]=='D' | s_chars[i]=='M'))
            )){
                total = popAndCalculate(romanStack,s_chars[i],total);
            }
            else{
                total = popAndCalculate2(romanStack,s_chars[i],total);
            }
        }
        if(!romanStack.empty()){
            total += transfer(romanStack.pop());
        }
        return total;
    }

    //特殊情况计算，弹出当前栈中值，与当前字符计算数值
    public int popAndCalculate(Stack stack, char current_char, int total){
        Character top_char = (Character)stack.pop();
        total =  total - transfer(top_char) + transfer(current_char);
        return total;
    }

    //不满足特殊匹配的，先弹出当前栈中值求和，再将当前字符入栈
    public int popAndCalculate2(Stack stack, char current_char, int total){
        total += transfer((Character)stack.pop());
        stack.push(current_char);
        return total;
    }

    public int transfer( char character){
        switch(character){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
// @lc code=end


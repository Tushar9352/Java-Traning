import java.util.Stack;
public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{[()]}";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    System.out.println("Invalid");
                    return;
                }
                if(s.charAt(i) == ')' && stack.peek() == '('){
                    stack.pop();
                }else if(s.charAt(i) == '}' && stack.peek() == '{'){
                    stack.pop();
                }else if(s.charAt(i) == ']' && stack.peek() == '['){
                    stack.pop();
                }else{
                    System.out.println("Invalid");
                    return;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}

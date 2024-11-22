import java.util.Stack;
public class DuplicateParenthesis {
    public static void main(String[] args) {
        String s = "((a+b)+(c+d))";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')'){
                if(stack.peek() == '('){
                    System.out.println("Duplicate Parenthesis");
                    return;
                }
                while(stack.peek() != '('){
                    stack.pop();
                }
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        System.out.println("No Duplicate Parenthesis");
    }
}
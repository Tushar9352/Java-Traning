import java.io.*;
import java.util.*;
class SimplifyPath{
    public static void main(String []args){
        String str = "/apnacollege/";
        String res = simplify(str);
        System.out.println(res);
    }
    static String simplify(String A){
        Stack<String> st = new Stack<String>();
        StringBuilder res = new StringBuilder();
        res.append("/");
        int len_A = A.length();
        for (int i = 0; i < len_A; i++){
            StringBuilder dir = new StringBuilder();
            while (i < len_A && A.charAt(i) == '/')
                i++;
            while (i < len_A && A.charAt(i) != '/'){
                dir.append(A.charAt(i));
                i++;
            }
            if (dir.toString().equals("..")){
                if (!st.empty())
                    st.pop();
            }
            else if (dir.toString().equals("."))
                continue;
            else if (!dir.isEmpty())
                st.push(dir.toString());
        }
        Stack<String> st1 = new Stack<String>();
        while (!st.empty()){
            st1.push(st.pop());
        }
        while (!st1.empty()){
            if (st1.size() != 1)
                res.append(st1.pop()).append("/");
            else
                res.append(st1.pop());
        }
        return res.toString();
    }
}
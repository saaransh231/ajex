package leetCode;

//
//nput: exp = “[()]{}{[()()]()}”
//        Output: Balanced
//        Explanation: all the brackets are well-formed
//
//        Input: exp = “[(])”
//        Output: Not Balanced
//        Explanation: 1 and 4 brackets are not balanced because
//        there is a closing ‘]’ before the closing ‘(‘
//
//        Check for Balanced Bracket expre

public class Parenthesis {

    public static boolean areBracketsBalanced(String s)


        {

            int i = -1;
            char[] stack = new char[s.length()];
            for (char ch : s.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[')
                    stack[++i] = ch;
                else {
                    if (i >= 0
                            && ((stack[i] == '(' && ch == ')')
                            || (stack[i] == '{' && ch == '}')
                            || (stack[i] == '[' && ch == ']')))
                        i--;
                    else
                        return false;
                }
            }
            return i == -1;
        }

        public static void main(String[] args)
        {
            String expr = "{()}[]";

            // Function call
            if (areBracketsBalanced(expr))
                System.out.println("Balanced");
            else
                System.out.println("Not Balanced");
        }
    }
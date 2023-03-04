import java.util.Stack;

public class InfixNotation {
    public static void main(String[] args) {
        var exp = "24*65*+".toCharArray();
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++){

            if(Character.isDigit(exp[i])){
                st.push(Integer.parseInt(String.valueOf(exp[i])));
            } else {
                switch (exp[i]) {
                    case '+':
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case '-':
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case '*':
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case '/':
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    
    }
}

import static java.lang.System.*;

public class BalanceChecker {
    private String input;

    BalanceChecker(String ins) {
        input = ins;
    }

    public boolean check() {
        Stack charStack = new Stack(input.length());

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            switch (ch) {
                // push these onto the stack to provide for initial left balance
                case '{':
                case '(':
                case '[':
                    charStack.push(ch);
                    break;

                case '}':
                case ')':
                case ']':
                    if (!charStack.isEmpty()) { // pop left delimiter and check
                        char chx = charStack.pop();
                        if ((ch == '}' && chx != '{') ||
                            (ch == ')' && chx != '(') ||
                            (ch == ']' && chx != '[')) {
                            // e.g. [}
                            out.println("\t\tMismatch Error: " + ch +
                                    " at index " + i);
                            return false;
                        }
                    } else {  // e.g. (()))
                        out.println("\t\tExtra Right Delimiter Error: " + ch +
                                " at index " + i);
                        return false;
                    }
                    break;
                default:  // for all other characters do nothing
                    break;
            }
        }
        if (!charStack.isEmpty()) { // e.g. ((())
            out.println("\t\tError: missing right delimiter!");
            return false;
        }
        return true;
    }
}
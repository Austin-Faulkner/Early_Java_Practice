public class PerformReversal {
    private String input;
    private String output;

    public PerformReversal(String in) {
        input = in;
    }

    public String doRev() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            theStack.push(c);
        }

        output = "";

        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output += ch;
        }
        return output;
    }
}

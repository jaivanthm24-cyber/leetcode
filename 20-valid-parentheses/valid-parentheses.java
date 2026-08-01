class Solution {
    public boolean isValid(String s) {
        char[] arr = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                arr[++top] = c;
            } 
            else {
                if (top == -1) return false;

                char x = arr[top--];

                if (c == ')' && x != '(') return false;
                if (c == '}' && x != '{') return false;
                if (c == ']' && x != '[') return false;
            }
        }

        return top == -1;
    }
}
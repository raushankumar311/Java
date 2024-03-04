class Solution {
    public boolean isValid(String s) {
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
        //return true;
	}
}

/*
 class Solution {
    public boolean isValid(String s) {
        char arr[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : arr)
        {
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else
            {
                if(stack.isEmpty() || !isMatchingPair(stack.pop(), c))
                    return false;
            }
        }
        
        return stack.isEmpty() ? true : false;
        
    }

    boolean isMatchingPair(char open, char close)
    {
        return (open == '(' && close == ')') || 
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
 */
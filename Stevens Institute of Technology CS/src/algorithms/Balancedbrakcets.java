package algorithms;

import java.io.*;
import java.util.*;;

/* public class Balancedbrakcets {
	private static char[] pairings = new char[128];
	private static Stack<Character> stack = new Stack<Character>();
	private static final Scanner scanner = new Scanner(System.in);
	
	// Complete the isBalanced function below.
	
	static {
		pairings['{'] = '}';
		pairings['('] = ')';
		pairings['['] = ']';
		pairings['}'] = '{';
		pairings[')'] = '(';
		pairings[']'] = '[';
	}
	
    static String isBalanced(String s) {
        Stack<String> stack = new Stack<String>();
        stack.clear();
        for(int i = 0, end = s.length(); i < end; i++) {
        	char c = s.charAt(i);
        	if(c=='{' || c=='(' || c=='[') {
        		stack.push(c);
        	}else {
        		if(stack.empty() || stack.pop() != pairings[c]) {
        			return "NO";
        		}
        	}
        }
        if(stack.empty()){
            return "yes";
        }else{
            return "no";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
*/
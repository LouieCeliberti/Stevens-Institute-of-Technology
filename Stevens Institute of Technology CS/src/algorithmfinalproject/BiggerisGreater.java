package algorithmfinalproject;

import java.util.*;

public class BiggerisGreater {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
	        int inputnum = input.nextInt();
	        input.nextLine();

	        for (int i = 0; i < inputnum; i++) {
	            String originalword = input.nextLine();
	            if (originalword.length() == 1) {
	                System.out.println("no answer");
	                continue;
			}

			int ml1 = 0; 
			int ml2 = 0; 

			 for (int x = 1; x < originalword.length(); x++) {
	                boolean condition1 = originalword.charAt(x) > originalword.charAt(x - 1);

				if (condition1) {
					ml1 = (x > ml2) ? x : ml1;
				}
			}

			if (ml1 == 0) {
				System.out.println("No input");
				continue;
			}
			
			// Determine the right most char greater than the pivot in index and in lexo
			for (int j = ml1; j < originalword.length(); j++) {
				
				boolean condition2 = originalword.charAt(j) > originalword.charAt(ml1 - 1);

				if (condition2) {
					ml2 = j;
				}
			}

			StringBuilder sb = new StringBuilder(originalword);

			char tmp = sb.charAt(ml1 - 1);
			sb.setCharAt(ml1 - 1, sb.charAt(ml2));
			sb.setCharAt(ml2, tmp);

			int left = ml1;
			int right = sb.length() - 1;
			
			while (left < right){
				tmp = sb.charAt(left);
				sb.setCharAt(left, sb.charAt(right));
				sb.setCharAt(right, tmp);
				left++;
				right--;
			}
			System.out.println(sb);
		}
	}
}
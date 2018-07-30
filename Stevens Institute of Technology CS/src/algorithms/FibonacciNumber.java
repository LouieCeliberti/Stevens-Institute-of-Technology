package algorithms;

public class FibonacciNumber {

		public static void main(String[] args) {
			int sum = 0 , a = 0, b = 1;
			while(true) {
				int c = a + b;
				if(c > 4000000) {
					break;
				}
				if (c % 2 == 0) {
					sum += c;
				}
				a = b; 
				b = c;
			}
			System.out.println(sum);
			
}
}

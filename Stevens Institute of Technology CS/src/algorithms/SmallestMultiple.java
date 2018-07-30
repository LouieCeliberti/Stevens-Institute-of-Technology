package algorithms;

public class SmallestMultiple {

		public static int gcd(int a , int b) {
			return b == 0 ? a : gcd(b, a% b);
			/* if(b ==0) {
				return a;
			}
			return gcd(b, a % b); */
		}
		public static void main(String[] args) {
			int lcm = 1;
			for(int i = 2; i <= 20; i++) {
				lcm *= i / gcd(lcm, i);
				System.out.println(i + ") " + lcm); 
			}
			System.out.println(lcm);
		}
}

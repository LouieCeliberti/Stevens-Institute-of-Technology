package algorithms;

public class PrimeNumber {
	
			public static boolean isprime(int n) {
				for(int divisor = 2, limit = (int)Math.sqrt(n); divisor <= limit; divisor++) {
					if(n % divisor == 0) {
						return false;
					}
				}
				return true;
			}
			
			public static void main(String[] args) {
				int count =0, number = 2;
				while(true) {
					if(isprime(number)) {
						count++;
					}
					if(count == 10001) {
						break;
					}
					number++;
				}
				System.out.println(number);
			}
		}
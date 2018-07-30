package algorithms;

public class Codingbatrecursion {
	public static int countHi(String str) {
		  if(str.length() < 2) {
			  return 0;
		  }
		  String sub = str.substring(0, 2);
		  if(sub.equals("hi")) {
			  return 1 + countHi(str.substring(2));
		  }
		  return countHi(str.substring(1));
		  }
public static void main(String[] args) {
	System.out.println(countHi("Collehi hi hi hi hi kelkfs hi"));
}
}
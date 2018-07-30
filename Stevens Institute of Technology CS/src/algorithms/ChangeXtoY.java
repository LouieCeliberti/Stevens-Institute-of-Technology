package algorithms;

public class ChangeXtoY {
	public static String changeXY(String str) {
		  if(str.length() == 0) {
			  return str;
		  }
		  char c = str.charAt(0);
		  if(c == 'x') {
			  return "y" + changeXY(str.substring(1));
		  }
		  return c + changeXY(str.substring(1));
	}
	public static void main(String[] args) {
		System.out.println(changeXY("xxxsdmmsiomxx"));
	}
}
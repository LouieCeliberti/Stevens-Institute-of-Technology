package algorithms;

public class NOX {
	public static String noX(String str) {
		if(str.length() <= 1){
		    return str;
		  }
		  char c = str.charAt(0);
		  if(c == 'x'){
		    return str.replace('x', ' ') + noX(str.substring(0));
		  }
		  return c + noX(str.substring(1));
	}
	public static void main(String[] args) {
		System.out.println(noX("xxxsdmmsiomxx"));
	}
}
package algorithms;

public class Changepi {
	public static String changepi(String str) {
		  if(str.length() <= 1) {
			  return str;
		  }
		  String pi = str.substring(0, 2);
		  if(pi.equals("pi")) {
			  return "3.14" + changepi(str.substring(2));
		  }
		  return str.charAt(0) + changepi(str.substring(1));
	}
	public static void main(String[] args) {
		System.out.println(changepi("piepiepiebiudbfasbvapiepiepiepi"));
	}
}
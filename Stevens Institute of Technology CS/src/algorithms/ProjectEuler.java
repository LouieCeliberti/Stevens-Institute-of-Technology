package algorithms;

public class ProjectEuler {
	
	public static void main(String[] args) {
		boolean[] values = new boolean[1000];
		for(int i = 3; i < values.length; i+= 3){
			values[i] = true;
		}
		for(int i = 5; i < values.length; i+= 5){
			values[i] = true;
		}
		int sum = 0;
		for(int i = 0; i < values.length; i++){
			if(values[i]) {
				sum+= i;
			}
		}
		System.out.println(sum);
}
}

package algorithms;

public class useitorloseit {
		private static boolean subsetHelper(int target, int[] values, int index) {
			if(target == 0) {
				return true;
			}
			if(index == values.length) {
				return false;
			}
			return subsetHelper(target - values[index], values, index + 1) || subsetHelper(target, values, index + 1);
		}
		public static boolean subset(int target, int[] values) {
			return subsetHelper(target, values, 0);
		}
		public static void main(String[] args) {
			int[] values = new int[] {4,5,1,8,16};
			System.out.println(subset(28, values));
		}
}

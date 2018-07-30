package algorithms;

import java.util.ArrayList;
import java.util.List;

class Pair<F, S> {
	public F first;
	public S second;

	public Pair(F first, S second) {
		this.first = first;
		this.second = second;
	}

	public String toString() {
		return "[" + this.first + "," + this.second + "]";
	}
}

public class Pairs {

	private static boolean subsetValuesHelper(int target, int[] values, int index, List<Integer> list) {
		if (target == 0) {
			return true;
		}
		if (index == values.length) {
			return false;
		}
		boolean useIt = subsetValuesHelper(target - values[index], values, index + 1, list), loseIt = false;
		if (useIt) {
			list.add(values[index]);
		} else {
			loseIt = subsetValuesHelper(target, values, index + 1, list);
		}
		return useIt || loseIt;
	}

	public static Pair<Boolean, List<Integer>> subsetWithValues(int target, int[] values) {
		List<Integer> list = new ArrayList<Integer>();
		boolean ret = subsetValuesHelper(target, values, 0, list);
		return new Pair<Boolean, List<Integer>>(ret, list);
	}

	public static void main(String[] args) {
		int[] values = new int[] { 4, 5, 1, 8, 16 };
		Pair<Boolean, List<Integer>> result = subsetWithValues(28, values);
		System.out.println(result.toString());
	}
}
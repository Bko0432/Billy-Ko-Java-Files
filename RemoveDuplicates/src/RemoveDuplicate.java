import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] numberSet = { 5,5,7,33,2,33,18,18,1,21 };
		List<Integer> NewSet = new ArrayList<Integer>();

		for (int x = 0; x < numberSet.length; x++) {
			if (NewSet.contains(numberSet[x])) {
			} else {
				NewSet.add(0, numberSet[x]);
			}
		}

		int[] NewArrayResult = new int[NewSet.size()];
		for (int i = NewSet.size() - 1; i >= 0; i--) {
			NewArrayResult[NewSet.size() - 1 - i] = NewSet.get(i);
			
		}
		System.out.println(Arrays.toString(NewArrayResult));

	}

}


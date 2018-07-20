
public class SpaceRemover {
	public static void main(String[] args) {
		String mostFamous = "Rudolph the Red-Nosed Reindeer";
		char[] mfl = mostFamous.toCharArray();
		for (int dex = 0; dex < mfl.length; dex++) {
			char current = mfl[dex];
			if (current != ' ') {
				System.out.print(current);
			} else {
				System.out.print('.');
			}
			
		}
        System.out.println();
	}
public static void SpaceRemover2 (String[] args) {
	String[] reindeerNames = { "Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donder", "Blitzen" };
	System.out.println(mfl[5]);
}
	
	
}
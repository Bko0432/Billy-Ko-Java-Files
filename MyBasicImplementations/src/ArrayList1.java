import java.util.ArrayList;

public class ArrayList1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> Billy = new ArrayList();
Billy.add("loves Alex");
Billy.add("loves Julia");
Billy.add("loves God");
Billy.contains("loves Alex");
Billy.get(0);
Billy.remove(1);

for(int dex = 0; dex < Billy.size(); dex++){
	System.out.println(Billy.get(dex));
}
	}
}



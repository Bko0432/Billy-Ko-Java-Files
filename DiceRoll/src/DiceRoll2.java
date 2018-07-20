
public class DiceRoll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice [] = new int[7]; 
        for(int x = 0 ; x <1000; x++ ) {
            ++dice [(int)(Math.random()*6+1)];
        }
        System.out.println("Number       Frequency" );  
        for(int index = 0; index < dice.length ; index++) {
            System.out.println(index + "            " + dice[index]);
        }
    }

}



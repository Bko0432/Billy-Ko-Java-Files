import javax.swing.*;
import java.util.*;

public class Recap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int cool[] = new int [10];
for(int x = 0; x < 11; x++){
	
	cool[x] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
}
int total = 0;
int currentLowestValue = 9000;
for(int dex = 0; dex < 11; dex++){
for(int i = 0; i < 11; i++)	{
total = cool[dex] - cool[i];

if(total < currentLowestValue){
	currentLowestValue = total;
	

}
	
	
}}
System.out.println(currentLowestValue);

}
}

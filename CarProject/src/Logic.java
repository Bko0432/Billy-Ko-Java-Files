import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Logic {

	private String people [] = {"","","",""};
	
	private static Car c;
	public Logic() {
		
	}
	public Logic(Car c)
	{
		this.c = c;
	}
	public void addPeople(){
		String p;
		boolean flag = false;
		p = JOptionPane.showInputDialog("EnterName");
for(int b = 0; b <= 3 && !flag; b++) {
	if (people[b] == null){
		people [b] = p;
		flag = true;
	} else if (people[b].equalsIgnoreCase(""))
	{
		people [b] = p;
		flag = true;
	}
	
}
//PrintPeople();
	}
	public void RemPeople(){
		String p;
		p = JOptionPane.showInputDialog("Enter Name");
		for(int b = 0; b <= 3; b++) {
			if(people[b] != null)
			{
				if (people[b].equalsIgnoreCase(p)){
					people[b] = "";
				}
			}
			
		}
		PrintPeople();
	}
	public void SearchPeople(){
		String p;
		boolean flag = true;
		p = JOptionPane.showInputDialog("Enter Name");
		for(int b = 0; b <= 3; b++) {
			if(people[b] != null)
			{
			if (people[b].equalsIgnoreCase(p)){
				JOptionPane.showInputDialog("Person is inside");
				flag = false;
			}
			}
		}
		if(flag) {
			JOptionPane.showInputDialog("Person is not inside");
		}

	}
	public void SortPeople(){
		Arrays.sort(people);
		PrintPeople();
	}
	public void PrintPeople(){
		for(String name: people) {
			JOptionPane.showInputDialog(name);
		}
	}
	public void gas(){
		
		c.getGastank().setCurrent( c.getGastank().getCurrent() - c.getEngine().getConsumption());
	JOptionPane.showInputDialog(c.getGastank().getCurrent());
	
	}
	public void Gearchange() {
		String s = JOptionPane.showInputDialog("What gear would you like?");
		c.setGear(s);

}
	public void Turnleft() {
		if (!c.isRightblinker()){
			c.setLeftblinker(true);
			gas();
		}
}
	
	public void Turnright(){
		if (!c.isLeftblinker()) {
		c.setRightblinker(true);
		gas();
		}
	}
	public void Turnoffright(){
		c.setRightblinker(false);
	}
	public void Turnoffleft() {
		c.setLeftblinker(false);
	}
	public void gas(int number) {
	
for(; number > 0; number--){
	gas();
}


	}
	

	
}



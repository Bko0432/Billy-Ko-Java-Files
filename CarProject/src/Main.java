import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		GasTank g = new GasTank();
		CarEngine e = new CarEngine();
		Car c = new Car();
		Logic l = new Logic(c);
		
		g.setCapacity(300);
		g.setCurrent(300);
		
		e.setConsumption(50);
		e.setEngineName("AMG");
		e.setFuelType("Turbo Diesel");
		e.setTorque(150);
		
		c.setBody("black");
		c.setBrake(true);
		c.setGas(false);
		c.setChairs(4);
		c.setEngine(e);
		c.setGastank(g);
		c.setGear("P,R,N,D");
		c.setHeadlights(false);
		c.setLeftblinker(false);
		c.setRightblinker(false);
		c.setWheels(4);
		c.Talk();
		
int x = 0;

while (x!= 10) {
	x = Integer.parseInt(JOptionPane.showInputDialog("What will the car do?"));
	
switch(x){

case 0:l.gas();
System.out.println(g.getCurrent());
l.Turnoffleft();
l.Turnoffright();
	break;
case 1: l.Gearchange();
	break;
case 2:l.Turnleft();
System.out.println(c.isLeftblinker());
	break;
case 3:l.Turnright();
System.out.println(c.isRightblinker());
	break;
case 4: 	Random rn = new Random();
int n = rn.nextInt(3)+ 1;
	l.gas(n);
break;
case 5:
	l.addPeople();
	break;
case 6: 
	l.RemPeople();
break;
case 7:
	l.SearchPeople();
break;
case 8:
	l.SortPeople();
	break;
	default: x = 10;
}
}
}



	}



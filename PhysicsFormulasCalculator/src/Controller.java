import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller { 
	private Logic l;
	private PhysicsCalcGUI g;
	private String formula;
public Controller(Logic l, PhysicsCalcGUI g){
this.l = l;
this.g = g;

g.addSubmit(new SubmitListener());
g.addSelect(new SelectListener());

}

class SubmitListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		switch(formula){
		case "F = m*a":
			g.setFinalAnswer(l.Force(Double.parseDouble(g.getT1().getText()), Double.parseDouble(g.getT2().getText())));
			break;
		case "a = F/m":
			g.setFinalAnswer(l.Acceleration(Double.parseDouble(g.getT1().getText()), Double.parseDouble(g.getT2().getText())));
		    break;
		case "m = F/a":
			g.setFinalAnswer(l.Mass(Double.parseDouble(g.getT1().getText()), Double.parseDouble(g.getT2().getText())));
			break;
		case "W = Fd":
			g.setFinalAnswer(l.Work(Double.parseDouble(g.getT1().getText()), Double.parseDouble(g.getT2().getText())));
			break;
		case "d = W/f":
			g.setFinalAnswer(l.Displacement5th(Double.parseDouble(g.getT1().getText()), Double.parseDouble(g.getT2().getText())));
		    break;
		case "f = W/d":
			g.setFinalAnswer(l.Force5th(Double.parseDouble(g.getT1().getText()), Double.parseDouble(g.getT2().getText())));
			break;
		case "P = W/t":
			g.setFinalAnswer(l.Power(Double.parseDouble(g.getT1().getText()), Double.parseDouble(g.getT2().getText())));
			break;
		case "W = P*t":
			g.setFinalAnswer(l.Work2nd(Double.parseDouble(g.getT1().getText()), Double.parseDouble(g.getT2().getText())));
			break;
		case "t = W/P":
			g.setFinalAnswer(l.Time5th(Double.parseDouble(g.getT1().getText()), Double.parseDouble(g.getT2().getText())));
			break;
		case "a = v - u/ t":
			g.setFinalAnswer(l.Acceleration(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "u = -at + v":
			g.setFinalAnswer(l.InitialVelocity5th(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "v = u + at":
			g.setFinalAnswer(l.FinalVelocity5th(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "t = v - u /a":
			g.setFinalAnswer(l.Time(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "V = D/T":
			g.setFinalAnswer(l.Velocity(Double.parseDouble(g.getT1().getText()), Double.parseDouble(g.getT2().getText())));
			break;
		case "D = V*T":
			g.setFinalAnswer(l.Displacement(Double.parseDouble(g.getT1().getText()), Double.parseDouble(g.getT2().getText())));
			break;
		case "T = D/V":
			g.setFinalAnswer(l.Time(Double.parseDouble(g.getT1().getText()), Double.parseDouble(g.getT2().getText())));
			break;
		case "v^2 = u^2 + 2as":
			g.setFinalAnswer(l.FinalVelocitySquared(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "u^2 = v^2 - 2as":
			g.setFinalAnswer(l.InitialVelocitySquared(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "a = v^2 - u^2/2*s":
			g.setFinalAnswer(l.AccelerationSquared(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "s = v^2 - u^2/2*a":
			g.setFinalAnswer(l.DisplacementSquared(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "s = ((v+u)/2)*t":
			g.setFinalAnswer(l.Displacement3rd(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "v = 2*s/t - u":
			g.setFinalAnswer(l.FinalVelocity3rd(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "u = 2*s/t - v":
			g.setFinalAnswer(l.InitialVelocity3rd(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "t = s/((v+u)/2)":
			g.setFinalAnswer(l.Time3rd(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "s = ut + at^2/2":
			g.setFinalAnswer(l.Displacement4th(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "u = s - a*t^2/2/t":
			g.setFinalAnswer(l.InitialVelocity4th(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "a = 2*s - u*t/t^2":
			g.setFinalAnswer(l.Acceleration4th(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText()), Double.parseDouble(g.getT3().getText())));
			break;
		case "t = sqrt(2*s/a)":
			g.setFinalAnswer(l.Time4th(Double.parseDouble(g.getT1().getText()),Double.parseDouble(g.getT2().getText())));
			break;
		}
	}
}
class SelectListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		formula = g.returnFormula();
		g.hideTextBoxes();
		
switch(formula){
case "F = m*a":
	g.setLabel1("Mass");
	g.setLabel2("Acceleration");
	g.ShowTextBox1();
	g.ShowTextBox2();
	break;
case "a = F/m":
	g.setLabel1("Force");
	g.setLabel2("mass");
	g.ShowTextBox1();
	g.ShowTextBox2();
    break;
case "m = F/a":
	g.setLabel1("Force");
	g.setLabel2("Acceleration");
	g.ShowTextBox1();
	g.ShowTextBox2();
	break;
case "W = Fd":
	g.setLabel1("Force");
	g.setLabel2("distance");
	g.ShowTextBox1();
	g.ShowTextBox2();
	break;
case "d = W/f":
	g.setLabel1("Work");
	g.setLabel2("Force");
	g.ShowTextBox1();
	g.ShowTextBox2();
    break;
case "f = W/d":
	g.setLabel1("Work");
	g.setLabel2("distance");
	g.ShowTextBox1();
	g.ShowTextBox2();
	break;
case "P = W/t":
	g.setLabel1("Work");
	g.setLabel2("time");
	g.ShowTextBox1();
	g.ShowTextBox2();
	break;
case "W = P*t":
	g.setLabel1("Power");
	g.setLabel2("time");
	g.ShowTextBox1();
	g.ShowTextBox2();
	break;
case "t = W/P":
	g.setLabel1("Work");
	g.setLabel2("Power");
	g.ShowTextBox1();
	g.ShowTextBox2();
	break;
case "a = v - u/ t":
	g.setLabel1("Final Velocity");
	g.setLabel2("Initial Velocity");
	g.setLabel3("Time");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "u = -at + v":
	g.setLabel1("Acceleration");
	g.setLabel2("Time");
	g.setLabel3("Final Velocity");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "v = u + at":
	g.setLabel1("Initial Velocity");
	g.setLabel2("Acceleration");
	g.setLabel3("Time");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "t = v - u /a":
	g.setLabel1("Velocity");
	g.setLabel2("Initial Velocity");
	g.setLabel3("Acceleration");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "V = D/T":
	g.setLabel1("Displacement");
	g.setLabel2("Time");
	g.ShowTextBox1();
	g.ShowTextBox2();
	break;
case "D = V*T":
	g.setLabel1("Velocity");
	g.setLabel2("Time");
	g.ShowTextBox1();
	g.ShowTextBox2();
	break;
case "T = D/V":
	g.setLabel1("Distance");
	g.setLabel2("Velocity");
	g.ShowTextBox1();
	g.ShowTextBox2();
	break;
case "v^2 = u^2 + 2as":
	g.setLabel1("Initial Velocity");
	g.setLabel2("Acceleration");
	g.setLabel3("Displacement");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "u^2 = v^2 - 2as":
	g.setLabel1("Final Velocity");
	g.setLabel2("Acceleration");
	g.setLabel3("Displacement");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "a = v^2 - u^2/2*s":
	g.setLabel1("Final Velocity");
	g.setLabel2("Initial Velocity");
	g.setLabel3("Displacement");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "s = v^2 - u^2/2*a":
	g.setLabel1("Final Velocity");
	g.setLabel2("Initial Velocity");
	g.setLabel3("Acceleration");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "s = ((v+u)/2)*t":
	g.setLabel1("Final Velocity");
	g.setLabel2("Initial Velocity");
	g.setLabel3("Time");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "v = 2*s/t - u":
	g.setLabel1("Displacement");
	g.setLabel2("Time");
	g.setLabel3("Initial Velocity");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "u = 2*s/t - v":
	g.setLabel1("Displacement");
	g.setLabel2("Time");
	g.setLabel3("Final Velocity");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "t = s/((v+u)/2)":
	g.setLabel1("Displacement");
	g.setLabel2("Final Velocity");
	g.setLabel3("Initial Velocity");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "s = ut + at^2/2":
	g.setLabel1("Initial Velocity");
	g.setLabel2("Time");
	g.setLabel3("Acceleration");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "u = s - a*t^2/2/t":
	g.setLabel1("Displacement");
	g.setLabel2("Acceleration");
	g.setLabel3("Time");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "a = 2*s - u*t/t^2":
	g.setLabel1("Displacement");
	g.setLabel2("Initial Velocity");
	g.setLabel3("Time");
	g.ShowTextBox1();
	g.ShowTextBox2();
	g.ShowTextBox3();
	break;
case "t = sqrt(2*s/a)":
	g.setLabel1("Displacement");
	g.setLabel2("Acceleration");
	g.ShowTextBox1();
	g.ShowTextBox2();
	break;
}
	}	
	

}


}


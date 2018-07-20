import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PhysicsCalcGUI extends JFrame {
private JFrame Frame = new JFrame();
private	JPanel WestPanel = new JPanel();
private JPanel NorthWestPanel = new JPanel();
private JPanel MiddlePanel = new JPanel();
private JPanel MiddleLeftPanel = new JPanel();
private JPanel MiddleCenterPanel = new JPanel();
private JPanel BottomPanel = new JPanel();
private JComboBox ForcePower = new JComboBox();

//private ArrayList <String> Example = new Arraylist();
private JTextField T1 = new JTextField();
private JTextField T2 = new JTextField();
private JTextField T3 = new JTextField();
private JTextField T4 = new JTextField();

private JLabel Label1 = new JLabel();
private JLabel Label2 = new JLabel();
private JLabel Label3 = new JLabel();
private JLabel Label4 = new JLabel();
private JLabel FinalAnswer = new JLabel();

private JButton Equals = new JButton();
private JButton Select = new JButton();

public PhysicsCalcGUI(){
setTitle("Physics Formula Calculator");
setSize(500,200);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLayout(new BorderLayout());
setResizable(true);

//West

add(WestPanel, BorderLayout.WEST);
WestPanel.setLayout(new BorderLayout());
NorthWestPanel.setLayout(new GridLayout(1,2));
NorthWestPanel.add(ForcePower);
NorthWestPanel.add(Select);
WestPanel.add(NorthWestPanel, BorderLayout.NORTH);
Select.setText("Select");

ForcePower.addItem("F = m*a");
ForcePower.addItem("a = F/m");
ForcePower.addItem("m = F/a");
ForcePower.addItem("W = Fd");
ForcePower.addItem("d = W/f");
ForcePower.addItem("f = W/d");
ForcePower.addItem("P = W/t");
ForcePower.addItem("W = P*t");
ForcePower.addItem("t = W/P");
ForcePower.addItem("a = v - u/ t");
ForcePower.addItem("u = -at + v");
ForcePower.addItem("v = u + at");
ForcePower.addItem("t = v - u /a");
ForcePower.addItem("V = D/T");
ForcePower.addItem("D = V*T");
ForcePower.addItem("T = D/V");
ForcePower.addItem("t = v - u/a");
ForcePower.addItem("v^2 = u^2 + 2as");
ForcePower.addItem("u^2 = v^2 - 2as");
ForcePower.addItem("a = v^2 - u^2/2*s");
ForcePower.addItem("s = v^2 - u^2/2*a");
ForcePower.addItem("s = ((v+u)/2)*t");
ForcePower.addItem("v = 2*s/t - u");
ForcePower.addItem("u = 2*s/t - v");
ForcePower.addItem("t = s/((v+u)/2)");
ForcePower.addItem("s = ut + at^2/2");
ForcePower.addItem("u = s - a*t^2/2/t");
ForcePower.addItem("a = 2*s - u*t/t^2");
ForcePower.addItem("t = sqrt(2*s/a)");
//Center or Middle
add(MiddlePanel, BorderLayout.CENTER);
MiddlePanel.setLayout(new BorderLayout());
MiddleLeftPanel.setLayout(new GridLayout(4,1));
MiddleCenterPanel.setLayout(new GridLayout(4,1));
MiddleLeftPanel.add(Label1);
MiddleCenterPanel.add(T1);
MiddleLeftPanel.add(Label2);
MiddleCenterPanel.add(T2);
MiddleLeftPanel.add(Label3);
MiddleCenterPanel.add(T3);
MiddleLeftPanel.add(Label4);
MiddleCenterPanel.add(T4);
MiddlePanel.add(MiddleLeftPanel, BorderLayout.WEST);
MiddlePanel.add(MiddleCenterPanel, BorderLayout.CENTER);
Label1.setText("Var 1");
Label2.setText("Var 2");
Label3.setText("Var 3");
Label4.setText("Var 4");
//East

//Bottom
WestPanel.add(BottomPanel, BorderLayout.SOUTH);
BottomPanel.setLayout(new GridLayout(1,2));
BottomPanel.add(FinalAnswer);
BottomPanel.add(Equals);
Equals.setText("compute");
hideTextBoxes();
}
public String returnFormula()
{
	return ForcePower.getSelectedItem().toString();
}

public JTextField getT1() {
	return T1;
}


public void setT1(JTextField t1) {
	T1 = t1;
}


public JTextField getT2() {
	return T2;
}


public void setT2(JTextField t2) {
	T2 = t2;
}


public JTextField getT3() {
	return T3;
}


public void setT3(JTextField t3) {
	T3 = t3;
}


public JTextField getT4() {
	return T4;
}


public void setT4(JTextField t4) {
	T4 = t4;
}


public JLabel getLabel1() {
	return Label1;
}


public void setLabel1(String label1) {
	Label1.setText(label1);
}


public JLabel getLabel2() {
	return Label2;
}


public void setLabel2(String label2) {
	Label2.setText(label2);
	
}


public JLabel getLabel3() {
	return Label3;
}


public void setLabel3(String label3) {
	Label3.setText(label3); 
}


public JLabel getLabel4() {
	return Label4;
}


public void setLabel4(String label4) {
	Label4.setText(label4);
}


public JLabel getFinalAnswer() {
	return FinalAnswer;
}


public void setFinalAnswer(Double finalAnswer) {
	FinalAnswer.setText(finalAnswer+"");
}

public void addForcePower(ActionListener FP){
 ForcePower.addActionListener(FP);
}

public void addSubmit(ActionListener Sb){
Equals.addActionListener(Sb);	
}

public void addSelect(ActionListener Sb){
Select.addActionListener(Sb);	
}
public void test(){
	JOptionPane.showMessageDialog(Frame,"It works" , "It works", JOptionPane.WARNING_MESSAGE);
}
public void hideTextBoxes(){
	T1.setVisible(false);
	T2.setVisible(false);
	T3.setVisible(false);
	T4.setVisible(false);
}
public void ShowTextBox1(){
	T1.setVisible(true);
}
public void ShowTextBox2(){
	T2.setVisible(true);
}
public void ShowTextBox3(){
	T3.setVisible(true);
}
public void ShowTextBox4(){
	T4.setVisible(true);
}
	}



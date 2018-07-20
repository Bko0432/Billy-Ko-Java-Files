import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PokeGUI extends JFrame{

private JLabel Pokedex = new JLabel();
private JLabel Label1_1 = new JLabel();
private JLabel Label1_2 = new JLabel();
private JLabel Label1_3 = new JLabel();
private JLabel Label1_4 = new JLabel();
private JLabel Label2_1 = new JLabel();
private JLabel Label2_2 = new JLabel();
private JLabel Label2_3 = new JLabel();
private JLabel Label2_4 = new JLabel();
private JLabel Label3_1 = new JLabel();
private JLabel Label3_2 = new JLabel();
private JLabel Label3_3 = new JLabel();
private JLabel Label3_4 = new JLabel();
private JLabel Label4_1 = new JLabel();
private JLabel Label4_2 = new JLabel();
private JLabel Label4_3 = new JLabel();
private JLabel Label4_4 = new JLabel();
private JLabel Label5_1 = new JLabel();
private JLabel Label5_2 = new JLabel();
private JLabel Label5_3 = new JLabel();
private JLabel Label5_4 = new JLabel();

private JPanel Poke1 = new JPanel();
private JPanel Poke2 = new JPanel();
private JPanel Poke3 = new JPanel();
private JPanel Poke4 = new JPanel();
private JPanel Poke5 = new JPanel();
private JPanel Details1 = new JPanel();
private JPanel Details2 = new JPanel();
private JPanel Details3 = new JPanel();
private JPanel Details4 = new JPanel();
private JPanel Details5 = new JPanel();
private JPanel PokeDexPanel = new JPanel();
private JPanel PokemonPanel = new JPanel();

public PokeGUI(){
PokeDexPanel.setLayout(new BorderLayout());
Poke1.setLayout(new BorderLayout());
Poke2.setLayout(new BorderLayout());
Poke3.setLayout(new BorderLayout());
Poke4.setLayout(new BorderLayout());
Poke5.setLayout(new BorderLayout());
Details1.setLayout(new GridLayout(3,1));
Details2.setLayout(new GridLayout(3,1));
Details3.setLayout(new GridLayout(3,1));
Details4.setLayout(new GridLayout(3,1));
Details5.setLayout(new GridLayout(3,1));
PokemonPanel.setLayout(new GridLayout(5,1));

// main
PokeDexPanel.add(Pokedex, BorderLayout.NORTH);
PokeDexPanel.add(PokemonPanel,BorderLayout.CENTER);
PokemonPanel.add(Poke1);
PokemonPanel.add(Poke2);
PokemonPanel.add(Poke3);
PokemonPanel.add(Poke4);
PokemonPanel.add(Poke5);
Poke1.add(Details1, BorderLayout.CENTER);
Poke1.add(Label1_1, BorderLayout.WEST);
Poke2.add(Details2, BorderLayout.CENTER);
Poke2.add(Label2_1, BorderLayout.WEST);
Poke3.add(Details3, BorderLayout.CENTER);
Poke3.add(Label3_1, BorderLayout.WEST);
Poke4.add(Details4, BorderLayout.CENTER);
Poke4.add(Label4_1, BorderLayout.WEST);
Poke5.add(Details5, BorderLayout.CENTER);
Poke5.add(Label5_1, BorderLayout.WEST);

// Details 
Details1.add(Label1_2);
Details1.add(Label1_3);
Details1.add(Label1_4);
Details2.add(Label2_2);
Details2.add(Label2_3);
Details2.add(Label2_4);
Details3.add(Label3_2);
Details3.add(Label3_3);
Details3.add(Label3_4);
Details4.add(Label4_2);
Details4.add(Label4_3);
Details4.add(Label4_4);
Details5.add(Label5_2);
Details5.add(Label5_3);
Details5.add(Label5_4);


add(PokeDexPanel);
}



public JLabel getLabel1_1() {
	return Label1_1;
}



public void setLabel1_1(JLabel label1_1) {
	Label1_1 = label1_1;
}



public JLabel getLabel2_1() {
	return Label2_1;
}



public void setLabel2_1(JLabel label2_1) {
	Label2_1 = label2_1;
}



public JLabel getLabel3_1() {
	return Label3_1;
}



public void setLabel3_1(JLabel label3_1) {
	Label3_1 = label3_1;
}



public JLabel getLabel4_1() {
	return Label4_1;
}



public void setLabel4_1(JLabel label4_1) {
	Label4_1 = label4_1;
}



public JLabel getLabel5_1() {
	return Label5_1;
}



public void setLabel5_1(JLabel label5_1) {
	Label5_1 = label5_1;
}



public JLabel getLabel1_2() {
	return Label1_2;
}

public void setLabel1_2(JLabel label1_2) {
	Label1_2 = label1_2;
}

public JLabel getLabel1_3() {
	return Label1_3;
}

public void setLabel1_3(JLabel label1_3) {
	Label1_3 = label1_3;
}

public JLabel getLabel1_4() {
	return Label1_4;
}

public void setLabel1_4(JLabel label1_4) {
	Label1_4 = label1_4;
}

public JLabel getLabel2_2() {
	return Label2_2;
}

public void setLabel2_2(JLabel label2_2) {
	Label2_2 = label2_2;
}

public JLabel getLabel2_3() {
	return Label2_3;
}

public void setLabel2_3(JLabel label2_3) {
	Label2_3 = label2_3;
}

public JLabel getLabel2_4() {
	return Label2_4;
}

public void setLabel2_4(JLabel label2_4) {
	Label2_4 = label2_4;
}

public JLabel getLabel3_2() {
	return Label3_2;
}

public void setLabel3_2(JLabel label3_2) {
	Label3_2 = label3_2;
}

public JLabel getLabel3_3() {
	return Label3_3;
}

public void setLabel3_3(JLabel label3_3) {
	Label3_3 = label3_3;
}

public JLabel getLabel3_4() {
	return Label3_4;
}

public void setLabel3_4(JLabel label3_4) {
	Label3_4 = label3_4;
}

public JLabel getLabel4_2() {
	return Label4_2;
}

public void setLabel4_2(JLabel label4_2) {
	Label4_2 = label4_2;
}

public JLabel getLabel4_3() {
	return Label4_3;
}

public void setLabel4_3(JLabel label4_3) {
	Label4_3 = label4_3;
}

public JLabel getLabel4_4() {
	return Label4_4;
}

public void setLabel4_4(JLabel label4_4) {
	Label4_4 = label4_4;
}

public JLabel getLabel5_2() {
	return Label5_2;
}

public void setLabel5_2(JLabel label5_2) {
	Label5_2 = label5_2;
}

public JLabel getLabel5_3() {
	return Label5_3;
}

public void setLabel5_3(JLabel label5_3) {
	Label5_3 = label5_3;
}

public JLabel getLabel5_4() {
	return Label5_4;
}

public void setLabel5_4(JLabel label5_4) {
	Label5_4 = label5_4;
}

	}



import javax.swing.*;
import java.awt.*;

public class SalutonFrame extends JFrame {
    public SalutonFrame(){
    	super("Saluton mondo!");
    	setLookAndFeel();
    	setSize(640, 480);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	FlowLayout flo = new FlowLayout();
    	setLayout(flo);
    	JButton play = new JButton("Play");
    	JButton stop = new JButton("Stop");
    	JButton pause = new JButton("Pause");
    	add(play);
    	add(stop);
    	add(pause);
    	
    	JLabel pageLabel = new JLabel("Web page address:", JLabel.RIGHT);
    	JTextField pageAddress = new JTextField(20);
    	setLayout(flo);
    	add(pageLabel);
    	add(pageAddress);
    	
    	JCheckBox jumboSize = new JCheckBox("Jumbo Size");
    	add(jumboSize);
    
    	JCheckBox smallSize = new JCheckBox("Small Size");
    	add(smallSize);
    	
    	JCheckBox midSize = new JCheckBox("Mid Size");
    	add(midSize);
    	
    	JComboBox profession = new JComboBox();
    	profession.addItem("Butcher");
    	profession.addItem("Baker");
    	profession.addItem("Candlestick maker");
    	profession.addItem("Fletcher");
    	profession.addItem("Fighter");
    	profession.addItem("Technical writer");
    	add(profession);
    	
    	setVisible(true);
    	
    }
    	private void setLookAndFeel() {
    		try {
    			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
    		} catch (Exception exc){
    			// ignore error
    		}
    		

    }
    	public static void main(String[] arguments) {
    		SalutonFrame sal = new SalutonFrame();
    	}
}

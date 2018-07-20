package base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class GUI0 extends JFrame{
	public GUI0() {
		initialize();
		setVisible(true);
	}

	
	public void setHidden(){
	    setVisible(false);
	}

	private JButton btnGo;



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		System.out.println("../../img/logo_blueprint.ico");
		Image image;
		try {
			System.out.println("");
			image = ImageIO.read(getClass().getResourceAsStream("/img/logo-blueprint.jpg"));
			setIconImage(image);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle("PFBC");
		setBounds(0, 0, 1000, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		JLabel background;
		try {
			background = new JLabel(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/img/newtonscradle.jpg"))));
			setContentPane(background);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JLabel lblNewLabel = new JLabel("Welcome to The IB Physics Calculator ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(261, 420, 460, 71);
		getContentPane().add(lblNewLabel);
		
		btnGo = new JButton("Go");
		btnGo.setBounds(419, 523, 125, 50);
		getContentPane().add(btnGo);
		
		JLabel lblIcon = new JLabel();
		try {
		lblIcon = new JLabel(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/img/dp-programme-logo-en2.png"))));
		lblIcon.setBounds(138, 73, 709, 228);
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		getContentPane().add(lblIcon);

	}
	public void addNextPage(ActionListener nextPage){
		btnGo.addActionListener(nextPage);
		}
	
}

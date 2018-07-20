package Goo.src.goo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class GooBackground extends JFrame
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					GooBackground frame = new GooBackground();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GooBackground()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThisIsA = new JLabel("This is a JFrame with a Sample Background Image");
		lblThisIsA.setFont(new Font("Chivo", Font.PLAIN, 13));
		lblThisIsA.setForeground(Color.WHITE);
		lblThisIsA.setBounds(20, 35, 334, 16);
		contentPane.add(lblThisIsA);
		
		JLabel lblNewLabel = new JLabel("The fonts have also been changed in this JFrame :-)");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(20, 63, 351, 16);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("/bg.png")));
		label.setBounds(0, 0, 450, 278);
		contentPane.add(label);
	}
}

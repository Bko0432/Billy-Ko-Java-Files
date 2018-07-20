package Goo.src.goo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Goo1 extends JFrame
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
					Goo1 frame = new Goo1();
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
	public Goo1()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThisGuiLinks = new JLabel("This GUI links to Goo2 class when you press the button.");
		lblThisGuiLinks.setBounds(34, 104, 373, 16);
		contentPane.add(lblThisGuiLinks);
		
		JButton btnOpenGoo = new JButton("Open Goo2");
		btnOpenGoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Goo2 frame = new Goo2();
				frame.setVisible(true);
				dispose(); //closes the last window frame
			}
		});
		btnOpenGoo.setBounds(34, 142, 117, 29);
		contentPane.add(btnOpenGoo);
	}

}

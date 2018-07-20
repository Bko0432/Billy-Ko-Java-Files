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

public class Goo2 extends JFrame
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
					Goo2 frame = new Goo2();
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
	public Goo2()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThisButtonTakes = new JLabel("This button takes you back to Goo1");
		lblThisButtonTakes.setBounds(51, 94, 268, 16);
		contentPane.add(lblThisButtonTakes);
		
		JButton btnGoToGoo = new JButton("Go to Goo1");
		btnGoToGoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Goo1 frame = new Goo1();
				frame.setVisible(true);
				dispose(); //closes the last window frame
			}
		});
		btnGoToGoo.setBounds(51, 118, 117, 29);
		contentPane.add(btnGoToGoo);
	}

}

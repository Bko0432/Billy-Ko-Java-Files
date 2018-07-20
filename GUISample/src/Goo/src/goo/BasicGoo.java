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

public class BasicGoo extends JFrame
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
					BasicGoo frame = new BasicGoo();
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
	public BasicGoo()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThisIsA = new JLabel("This is a basic GUI frame with a button.");
		lblThisIsA.setBounds(45, 110, 259, 16);
		contentPane.add(lblThisIsA);
		
		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Yey you clicked it!");
			}
		});
		btnClickMe.setBounds(45, 156, 117, 29);
		contentPane.add(btnClickMe);
		
		JLabel lblClickTheButton = new JLabel("Click the button and it will do something.");
		lblClickTheButton.setBounds(45, 128, 295, 16);
		contentPane.add(lblClickTheButton);
	}
}

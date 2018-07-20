package Goo.src.goo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GooText extends JFrame
{

	private JPanel contentPane;
	private JTextField unicorn;

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
					GooText frame = new GooText();
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
	public GooText()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThisGuiTakes = new JLabel("This GUI takes the text you type and then uses it.");
		lblThisGuiTakes.setBounds(56, 87, 325, 16);
		contentPane.add(lblThisGuiTakes);
		
		unicorn = new JTextField();
		unicorn.setBounds(56, 112, 230, 28);
		contentPane.add(unicorn);
		unicorn.setColumns(10);
		
		JButton btnNewButton = new JButton("Grab Text");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("You typed: " + unicorn.getText());
				
			}
		});
		btnNewButton.setBounds(56, 152, 117, 29);
		contentPane.add(btnNewButton);
	}
}

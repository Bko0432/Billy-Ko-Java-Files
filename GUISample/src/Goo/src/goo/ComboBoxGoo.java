package Goo.src.goo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComboBoxGoo extends JFrame
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
					ComboBoxGoo frame = new ComboBoxGoo();
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
	public ComboBoxGoo()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

					//System.out.println(comboBox.getSelectedItem());
					JOptionPane.showMessageDialog(null, "The item you selected is " + comboBox.getSelectedItem());

			}
		});

		comboBox.setBounds(39, 33, 154, 27);
		contentPane.add(comboBox);
		comboBox.insertItemAt("The God Father", 0);
		comboBox.insertItemAt("Power Ranger", 1);
		comboBox.insertItemAt("Thor Ragnarok", 2);
		comboBox.insertItemAt("Dead Poet's Society", 3);
		comboBox.insertItemAt("Avengers", 4);
		/*Note - use insertItemAt() method to make sure that no selection will be made when the JCombo is created. 
		 * Normally people use addItem() 
		 */

		
				
	}
}

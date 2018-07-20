package Goo.src.goo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;

public class GooJList extends JFrame
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
					GooJList frame = new GooJList();
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
	public GooJList()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 57, 146, 111);
		contentPane.add(scrollPane);
		
		
		/*In order to put a scrollpane to the JList
		 * Right-click on the JList in the design view and then
		 * click Surround with JScrollPane
		 */
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		//- - - - This adds default items to the list by creating an object of DefaultListModel - 
		//- - - - but you'll also have to import the DefaultListModel library
		DefaultListModel DLM = new DefaultListModel();
		DLM.addElement("Apple");
		DLM.addElement("Banana");
		DLM.addElement("Car");
		DLM.addElement("Dork");
		DLM.addElement("Elephant");
		DLM.addElement("Fulo");
		DLM.addElement("Goo");
		DLM.addElement("Hello World");
		
		list.setModel(DLM);
		
	}
}

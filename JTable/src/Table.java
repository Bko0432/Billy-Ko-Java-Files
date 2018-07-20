import javax.swing.*;
public class Table {

	private static JFrame frame;
	public static void TableCreate(){
		frame = new JFrame();
		String data [][] = {{"Superman","Metropolis"},{"Batman","Gotham"},{"Robin","Gotham"}};
		String column [] = {"SUPERHERO","LOCATION"};
		JTable jtable = new JTable(data,column);
		jtable.setBounds(50,50,300,400);
		JScrollPane sp = new JScrollPane(jtable);
		frame.add(sp);
		frame.setSize(300, 400);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TableCreate();
	}

}

import javax.swing.JOptionPane;

public class DynamicTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int user = 0;
Node n;
Node start;
Node others;
user = Integer.parseInt(JOptionPane.showInputDialog("What is the node number?"));
start = new Node();
start.setNum(user);
do{
	user = Integer.parseInt(JOptionPane.showInputDialog("What is the node number?"));
	others = new Node();
	others.setNum(user);
	if (user < start.getNum())
	{
		if (start.getLeft() == null){
			start.setLeft(others);		
		}
		else{ 
		 n = start.getLeft();
		 boolean flag = true;
			if (n.getLeft() == null){
				n.setLeft(others);
			}
			else{
				do{
				if(user < n.getNum())
				{
					n = n.getLeft();
					if (n.getLeft() == null){
						n.setLeft(others);
						flag = false;
					}
				}
				else
				{
					n = n.getRight();
					if (n.getRight() == null){
						n.setRight(others);
						flag = false;
					}
				}
			
			}while (flag);
		}}
	}
	else {
		
		
	}

	
}
while(user != 0);	

	}
	
	

}

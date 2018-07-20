
public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Left Node
Node n23 = new Node();
Node n19 = new Node();
Node n17 = new Node();
Node n21 = new Node();
Node n16 = new Node();
Node n18 = new Node();
Node n20 = new Node();
Node n22 = new Node();

//Right Node
Node n27 = new Node();
Node n25 = new Node();
Node n29 = new Node();
Node n24 = new Node();
Node n26 = new Node();
Node n28 = new Node();
Node n30 = new Node();

n23.setNum(23);
n19.setNum(19);
n17.setNum(17);
n21.setNum(21);
n16.setNum(16);
n18.setNum(18);
n20.setNum(20);
n22.setNum(22);
n27.setNum(27);
n25.setNum(25);
n29.setNum(29);
n24.setNum(24);
n26.setNum(26);
n28.setNum(28);
n30.setNum(30);
// Left Side
n23.setLeft(n19);
n19.setRight(n21);
n19.setLeft(n17);
n17.setLeft(n16);
n17.setRight(n18);
n21.setLeft(n20);
n21.setRight(n22);

// Right Side
n23.setRight(n27);
n27.setLeft(n25);
n27.setRight(n29);
n25.setLeft(n24);
n25.setRight(n26);
n29.setLeft(n28);
n29.setRight(n30);

InOrder(n23);
System.out.println();
PreOrder(n23);
System.out.println();
PostOrder(n23);
System.out.println();
	}

	
public static void InOrder(Node n){
if(n.getLeft()!= null){
InOrder(n.getLeft());
}
n.printNumber();
if(n.getRight()!= null){
InOrder(n.getRight());
}

}
public static void PreOrder(Node n){
n.printNumber();
if(n.getLeft()!= null){
PreOrder(n.getLeft());
}
if(n.getRight()!= null){
PreOrder(n.getRight());
}
}

public static void PostOrder(Node n){
if(n.getLeft()!= null){
	PostOrder(n.getLeft());
}
if(n.getRight()!= null){
	PostOrder(n.getRight());
}
n.printNumber();
}	
}
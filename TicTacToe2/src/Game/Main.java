package Game;

public class Main {
    public static boolean playerTurn = true;
    public static boolean playerWon = false;
    public static boolean computerWon = false;
    public static boolean playing = true;
    
    public static TicTacToe2 board = new TicTacToe2();
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(playing == true){
	
     if (board.isVisible() == false) {
    	 board.setVisible(true);
     }
	}
	}
	public static void checkforwin(){
		if (board.button1.getText().equals("X")){
		  if (board.button4.getText().equals("X")){
		    if (board.button7.getText().equals("X")){
			playerWon = true;
			computerWon = false;
			System.out.println("Player 1 Won!");
		}
		}
	}
		if (board.button1.getText().equals("X")){
			if (board.button5.getText().equals("X")){
				if (board.button9.getText().equals("X")){
					playerWon = true;
					computerWon = false;
					System.out.println("Player 1 Won!");
				}
			}
		}
		if (board.button1.getText().equals("X")){
			if (board.button2.getText().equals("X")){
				if (board.button3.getText().equals("X")){
					playerWon = true;
					computerWon = false;
					System.out.println("Player 1 Won!");
     }
}
}
		if (board.button3.getText().equals("X")){
			if (board.button5.getText().equals("X")){
				if (board.button7.getText().equals("X")){
					playerWon = true;
					computerWon = false;
					System.out.println("Player 1 Won!");
     }
   }
}
		if (board.button3.getText().equals("X")){
			if (board.button6.getText().equals("X")){
				if (board.button9.getText().equals("X")){
					playerWon = true;
					computerWon = false;
					System.out.println("Player 1 Won!");
    }
  }
}
		if (board.button7.getText().equals("X")){
			if (board.button8.getText().equals("X")){
				if (board.button9.getText().equals("X")){
					playerWon = true;
					computerWon = false;
					System.out.println("Player 1 Won!");	
     } 
   } 
}
		if (board.button4.getText().equals("X")){
			if (board.button5.getText().equals("X")){
				if (board.button6.getText().equals("X")){
					playerWon = true;
					computerWon = false;
					System.out.println("Player 1 Won!");	
}
}
}
		if (board.button2.getText().equals("X")){
			if (board.button5.getText().equals("X")){
				if (board.button8.getText().equals("X")){
					playerWon = true;
					computerWon = false;
					System.out.println("Player 1 Won!");
}
}
}
	
	if (board.button1.getText().equals("O")){
		if (board.button4.getText().equals("O")){
			if (board.button7.getText().equals("O")){
				playerWon = false;
				computerWon = true;
				System.out.println("Player 2 won!");
	}
	}
}
	if (board.button1.getText().equals("O")){
		if (board.button5.getText().equals("O")){
			if (board.button9.getText().equals("O")){
				playerWon = false;
				computerWon = true;
				System.out.println("Player 2 won!");
			}
		}
	}
	if (board.button1.getText().equals("O")){
		if (board.button2.getText().equals("O")){
			if (board.button3.getText().equals("O")){
				playerWon = false;
				computerWon = true;
				System.out.println("Player 2 won!");
 }
}
}
	if (board.button3.getText().equals("O")){
		if (board.button5.getText().equals("O")){
			if (board.button7.getText().equals("O")){
				playerWon = false;
				computerWon = true;
				System.out.println("Player 2 won!");
 }
}
}
	if (board.button3.getText().equals("O")){
		if (board.button6.getText().equals("O")){
			if (board.button9.getText().equals("O")){
				playerWon = false;
				computerWon = true;
				System.out.println("Player 2 won!");
}
}
}
	if (board.button7.getText().equals("O")){
		if (board.button8.getText().equals("O")){
			if (board.button9.getText().equals("O")){
				playerWon = false;
				computerWon = true;
				System.out.println("Player 2 won!");	
 } 
} 
}
	if (board.button4.getText().equals("O")){
		if (board.button5.getText().equals("O")){
			if (board.button6.getText().equals("O")){
				playerWon = false;
				computerWon = true;
				System.out.println("Player 2 won!");	
}
}
}
	if (board.button2.getText().equals("O")){
		if (board.button5.getText().equals("O")){
			if (board.button8.getText().equals("O")){
				playerWon = false;
				computerWon = true;
				System.out.println("Player 2 won!");
}
}
}
	if(playerWon == true || computerWon == true){
		board.setVisible(false);
		System.out.println("Would you like to play again?");
	}
	}}


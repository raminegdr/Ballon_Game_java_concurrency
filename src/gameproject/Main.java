package gameproject;

/**
 * 
 * @author Zohreh Ghaderi
 * Main class creates a playground and make a thread from the system player.
 * It remains until the game ends to print the appropriate message.
 *
 */

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		playground game=new playground();
		
		game.setVisible(true);
		player_system green=new player_system(game);
		Thread T1 = new Thread(green) ; 	
		T1.start();
		T1.join();
		game.winer();
		


	}

}

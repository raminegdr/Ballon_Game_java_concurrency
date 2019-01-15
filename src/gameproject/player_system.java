package gameproject;

/**
 * 
 * @author Zohreh
 * in this class, system player need to a playground and..
 * random number to destroy its ballon. Green icon is system players.
 *
 */
public class player_system implements Runnable {
	playground game;
	int select;
	int num;

	player_system(playground g) {
		game = g;
		select = 0;
		num = 0;
	}

	@Override
	public void run() {

		while (!game.finish_game()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			select = (2 ^ num) % 8;
			num++;
			System.out.println(select);
			game.kill_green(select);
			

			// TODO Auto-generated method stub

		}
		System.out.println("end");

	}

}

package gameproject;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 
 * @author Zohreh
 * In this class, the playground components, such as the yellow and green balloons,
 * and their numbers and the end of the game are used as variables.After designing 
 * and picking up balloons, the playground is writtena function which by clicking 
 * on the yellow balloon that  is an interactive player lead to destroying it. 
 * The finish-game function checks the end of the game. Winner function determine 
 * a winner of the game according to the number of balloons remainder.
 *
 */

public class playground extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	final ballon yellow[];
	ballon green[];
	Boolean finish;
	int countyellow;
	int countgreen;

	public playground() {
		setType(Type.UTILITY);
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 264, 273);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 69, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		countyellow = 8;
		countgreen = 8;
		finish = false;

		yellow = new ballon[8];
		green = new ballon[8];

		for (int i = 0; i < 8; i++) {
			yellow[i] = new ballon();
			yellow[i].objct = new JLabel("");
			yellow[i].objct.setIcon(new ImageIcon(playground.class
					.getResource("/pic/yellowblock.png")));
			green[i] = new ballon();
			green[i].objct = new JLabel("");
			green[i].objct.setIcon(new ImageIcon(playground.class
					.getResource("/pic/greenblock.png")));

			final int j;
			j = i;
			yellow[i].objct.addMouseListener(new MouseAdapter() {
				@Override
				public synchronized void mouseClicked(MouseEvent arg0) {
					countyellow--;
					yellow[j].delet();

				}
			});

		}

		int place;
		int x = 0, y = 0, i = 0, j = 0;

		while (y < 4) {
			place = (int) (((int) 100 * Math.random()) % 2);

			if (place ==0 && i < 8) {
				yellow[i].objct.setBounds(10 + (60 * x), 10 + (60 * y), 46, 35);
				contentPane.add(yellow[i].objct);
				i++;
				x++;
			} else if (j < 8) {
				green[j].objct.setBounds(10 + (60 * x), 10 + (60 * y), 46, 35);
				contentPane.add(green[j].objct);
				j++;
				x++;
			}
			if (x == 4) {
				y++;
				x = 0;
			}
		}


	}

	

	public synchronized boolean finish_game() {
		if (countyellow == 0 || countgreen == 0)
			finish = true;
		return finish;

	}

	public synchronized void kill_green(int select) {

		green[select].delet();
		countgreen--;

	}
	public void winer()
	{
		if(countyellow ==0)
		{
			winer_form frame = new winer_form("you won :)");
		frame.setVisible(true);
		}
		if(countgreen==0)
		{
			winer_form frame = new winer_form("try again :(");
			frame.setVisible(true);
		}
	}
}

package gameproject;
/*
 * this class is one type of JFrame that show  win/failed massage
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

public class winer_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public winer_form(String str) {
		setType(Type.UTILITY);
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 271, 263);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 69, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(str);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 26));
		lblNewLabel.setBounds(47, 73, 173, 49);
		contentPane.add(lblNewLabel);

	}

}

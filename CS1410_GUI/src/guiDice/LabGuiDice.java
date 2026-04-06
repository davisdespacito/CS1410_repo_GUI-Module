package guiDice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LabGuiDice extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	static int imagesSize = 6;
	public static final String[] imagesArray = new String[imagesSize];

	private static File[] images = new File("src/Resources").listFiles();

	Random rand = new Random();
	File dieImage = images[rand.nextInt(images.length)];

	public void randomDieNumber() {

		
		
		File newDieImage = images[rand.nextInt(images.length)];
		lblImage.setIcon(new ImageIcon(newDieImage.getAbsolutePath()));

	}

	private JButton btnRollEm;
	private JLabel lblImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiDice frame = new LabGuiDice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LabGuiDice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JButton btnRollEm = newBtnRollEm();
		contentPane.add(btnRollEm, BorderLayout.SOUTH);

		JLabel lblImage = newLblImage();
		contentPane.add(lblImage, BorderLayout.CENTER);

	}

	/**
	 * @return
	 */
	private JLabel newLblImage() {
		lblImage = new JLabel("");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setIcon(new ImageIcon(dieImage.getAbsolutePath()));
		return lblImage;
	}

	/**
	 * @return
	 */
	private JButton newBtnRollEm() {
		btnRollEm = new JButton("Roll 'Em");
		btnRollEm.setForeground(new Color(255, 64, 255));
		btnRollEm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				randomDieNumber();

			}
		});
		btnRollEm.setFont(new Font("Bangla MN", Font.ITALIC, 17));
		btnRollEm.setBackground(new Color(0, 0, 0));
		btnRollEm.setOpaque(true);
		return btnRollEm;
	}

}

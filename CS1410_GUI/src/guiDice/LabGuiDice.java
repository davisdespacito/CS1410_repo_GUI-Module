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

	final static File dir = new File("src/Resources");
	static int imagesSize = 6;
	static String[] imagesArray = new String[imagesSize];

	private static File[] images = dir.listFiles();
	private Random rand = new Random();
	public File diceImage = images[rand.nextInt(images.length)];

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
		JLabel lblImage = new JLabel("");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setIcon(new ImageIcon(diceImage.getAbsolutePath()));
		return lblImage;
	}

	/**
	 * @return
	 */
	private JButton newBtnRollEm() {
				JButton btnRollEm = new JButton("Roll 'Em");
		btnRollEm.setForeground(new Color(255, 64, 255));
		btnRollEm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				
			}
		});
		btnRollEm.setFont(new Font("Bangla MN", Font.ITALIC, 17));
		btnRollEm.setBackground(new Color(0, 0, 0));
		btnRollEm.setOpaque(true);
		return btnRollEm;
	}

}

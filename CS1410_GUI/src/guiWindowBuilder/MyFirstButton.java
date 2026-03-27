package guiWindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class MyFirstButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblToggle;

	/**
	 * Demo how to create an event handler for a button.
	 * 
	 * @author davisP
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstButton frame = new MyFirstButton();
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
	public MyFirstButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JButton btnMyFirstButton = newBtnMyFirstButton();
		contentPane.add(btnMyFirstButton, BorderLayout.CENTER);

		lblToggle = createLabelToggle();
		contentPane.add(lblToggle, BorderLayout.WEST);

	}

	/**
	 * @return
	 */
	private JLabel createLabelToggle() {
		JLabel lblToggle = new JLabel("Toggle");
		lblToggle.setOpaque(true);
		lblToggle.setBackground(new Color(255, 146, 0));
		lblToggle.setBorder(new EmptyBorder(0, 15, 0, 15));
		return lblToggle;
	}

	/**
	 * @return
	 */
	private JButton newBtnMyFirstButton() {
		JButton btnMyFirstButton = new JButton("My First Button");
		btnMyFirstButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblToggle.getBackground().equals(new Color(255, 0, 255))) {
					lblToggle.setBackground(Color.ORANGE);
				} else
					lblToggle.setBackground(new Color(255, 0, 255));
			}
		});
		btnMyFirstButton.setOpaque(true);
		btnMyFirstButton.setBackground(new Color(81, 0, 1));
		btnMyFirstButton.setForeground(new Color(254, 255, 255));
		btnMyFirstButton.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnMyFirstButton.setBorderPainted(false);
		btnMyFirstButton.setOpaque(true);
		return btnMyFirstButton;
	}

}

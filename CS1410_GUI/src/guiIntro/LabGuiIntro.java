package guiIntro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class LabGuiIntro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiIntro frame = new LabGuiIntro();
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
	public LabGuiIntro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = newLblTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		JButton btnWEST = newBtnWEST();
		contentPane.add(btnWEST, BorderLayout.WEST);
		{
			JPanel panel = newTextPanel();
			contentPane.add(panel, BorderLayout.SOUTH);
		}
		{
			JLabel lblNewLabel = newLblHi();
			contentPane.add(lblNewLabel, BorderLayout.CENTER);
		}
		

	}

	/**
	 * @return
	 */
	private JLabel newLblHi() {
		JLabel lblNewLabel = new JLabel("Hi");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Oriya MN", Font.PLAIN, 77));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 146, 0));
		lblNewLabel.setBackground(new Color(255, 38, 0));
		return lblNewLabel;
	}

	private JPanel newTextPanel() {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(81, 81, 81));
		{
			JLabel lblNewLabel_1 = new JLabel("Name:");
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			panel.add(lblNewLabel_1);
		}
		{
			txtName = new JTextField();
			txtName.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			panel.add(txtName);
			txtName.setColumns(16);
		}
		return panel;
	}

	private JButton newBtnWEST() {
		JButton btnWEST = new JButton("WEST");
		return btnWEST;
	}

	private JLabel newLblTitle() {
		JLabel lblTitle = new JLabel("My First Gui");
		lblTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 33));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setOpaque(true);
		lblTitle.setBackground(new Color(4, 50, 255));
		lblTitle.setForeground(new Color(0, 249, 0));
		return lblTitle;
	}


}

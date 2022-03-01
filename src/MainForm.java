import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForm {
	
	public JFrame mainForm;
	public Form1 form1;
	private JPanel contentPane;

	public MainForm() {
		this.mainForm = new JFrame();
		form1 = new Form1();
		
		mainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainForm.setBounds(100, 100, 450, 300);
		mainForm.setVisible(true);
		mainForm.setLocationRelativeTo(null);
		mainForm.setTitle("Main Form");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainForm.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton openForm1 = new JButton("Open form 1");
		openForm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainForm.setVisible(false);;
				if(form1==null) {				
					form1 = new Form1();
					form1.form1.setVisible(true);
				}
				else{form1.form1.setVisible(true);}
				
			}
		});
		openForm1.setBounds(141, 79, 124, 71);
		contentPane.add(openForm1);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Form2 {
	
	JFrame form2;
	Form1 form1;
	MainForm mainForm ;
	private JPanel contentPane;

	public Form2() {
		this.form2 = new JFrame();
		form2.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) { 
				if(mainForm==null) {
					mainForm = new MainForm();
				}
				else {mainForm.mainForm.setVisible(true);}
			}
		});
		form2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		form2.setBounds(100, 100, 450, 300);
		form2.setVisible(true);
		form2.setLocationRelativeTo(null);
		form2.setTitle("Form_2");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		form2.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton backToForm1 = new JButton("Back to previous form");
		backToForm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form2.setVisible(false);
				if(form1==null) {
					form1 = new Form1();
					form1.form1.setVisible(true);
				}
				else {form1.form1.setVisible(true);}
			}
		});
		backToForm1.setBounds(116, 99, 169, 55);
		contentPane.add(backToForm1);
		
		JButton backToMainForm = new JButton("Back to main menu");
		backToMainForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form2.dispose();
			}
		});
		backToMainForm.setBounds(291, 219, 124, 34);
		contentPane.add(backToMainForm);
	}
}

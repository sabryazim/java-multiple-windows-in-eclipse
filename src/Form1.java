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
import java.awt.event.WindowStateListener;

public class Form1{
	
	JFrame form1;
	Form2 form2;
	MainForm mainForm;
	private JPanel contentPane;
	private JButton openForm2;

	public Form1() {
		this.form1 = new JFrame();
		form1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		form1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				if(mainForm==null) {
					mainForm = new MainForm();
				}
			}
		});
		form1.setTitle("Form_1");
		form1.setBounds(100, 100, 450, 300);
		form1.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		form1.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton openMainForm = new JButton("Back to main form");
		openMainForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form1.dispose();
				if(mainForm==null) {
					mainForm = new MainForm();
				}
				else {mainForm.mainForm.setVisible(true);}
			}
		});
		openMainForm.setBounds(283, 202, 130, 51);
		contentPane.add(openMainForm);
		
		openForm2 = new JButton("open form 2");
		openForm2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form1.setVisible(false);
				if(form2==null) {
					form2 = new Form2();
				}
				else {form2.form2.setVisible(true);}
			}
		});
		openForm2.setBounds(139, 91, 118, 38);
		contentPane.add(openForm2);
		form1.setVisible(false);
	}

}

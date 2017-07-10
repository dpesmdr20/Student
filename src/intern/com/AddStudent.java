package intern.com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class AddStudent extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	JTextField name,math,phy,bio,chem,eng,roll;
	
	int newStudentID = StudentResult.studentData.size()+1;
	
	public AddStudent(){
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new MigLayout());
		mainPanel.add(new JLabel("Student ID\t"));
		JLabel stdId = new JLabel(newStudentID+"");
		
		JLabel lbl_name = new JLabel("Name");
		name = new JTextField(15);
		JLabel lbl_rollno = new JLabel("Roll NO.");
		roll = new JTextField(3);
		JLabel lbl_math = new JLabel("Mathematics");
		math = new JTextField(3);
		JLabel lbl_phy = new JLabel("Physics");
		phy = new JTextField(3);
		JLabel lbl_bio = new JLabel("Biology");
		bio = new JTextField(3);
		JLabel lbl_chem = new JLabel("Chemistry");
		chem = new JTextField(3);
		JLabel lbl_eng = new JLabel("English");
		eng = new JTextField(3);
		
		mainPanel.add(stdId,"wrap");
		mainPanel.add(lbl_name);
		mainPanel.add(name,"wrap");
		mainPanel.add(lbl_rollno);
		mainPanel.add(roll,"wrap");
		mainPanel.add(lbl_math);
		mainPanel.add(math,"wrap");
		mainPanel.add(lbl_phy);
		mainPanel.add(phy,"wrap");
		mainPanel.add(lbl_bio);
		mainPanel.add(bio,"wrap");
		mainPanel.add(lbl_chem);
		mainPanel.add(chem,"wrap");
		mainPanel.add(lbl_eng);
		mainPanel.add(eng,"wrap");
		
		JButton addBtn = new JButton("Add");
		addBtn.addActionListener(this);
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(this);
		mainPanel.add(addBtn);
		mainPanel.add(cancelBtn);
		getContentPane().add(mainPanel);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
		case "Add":
			addStudent();
			break;
		case "Cancel":
			
			break;
		}
		
	}


	public void addStudent() {
		StudentResult.studentData.add(new Student(newStudentID,name.getText().toString(),Integer.parseInt(roll.getText().toString()),Integer.parseInt(math.getText().toString()),Integer.parseInt(phy.getText().toString()),Integer.parseInt(bio.getText().toString()),Integer.parseInt(chem.getText().toString()),Integer.parseInt(eng.getText().toString())));
		this.dispose();
		new StudentResult();
	}

}

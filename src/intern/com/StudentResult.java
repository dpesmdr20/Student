package intern.com;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentResult extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int TOTAL_MARK = 500;
	private int sn =1;

	private String tblCol[] = { "SN.", "ID", "NAME", "ROLL NO.", "MATH",
			"PHYSICS", "BIOLOGY", "CHEMISTRY", "ENGLISH", "TOTAL MARKS",
			"PERCENTAGE" };
	DefaultTableModel tableModel;
	 
	public static ArrayList<Student> studentData;
	
	public StudentResult() {
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		tableModel = new DefaultTableModel(tblCol, 0);
		JTable table = new JTable(tableModel);
		
		JScrollPane tableContainer = new JScrollPane(table);
		
		contentPane.add(tableContainer);
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(this);
		contentPane.add(btnAdd,BorderLayout.LINE_START);
		
		if(studentData!=null)
		setStudentData();
		else
			studentData = new ArrayList<Student>();
		getContentPane().add(contentPane);
		setPreferredSize(getMaximumSize());
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void setStudentData() {
		for (int i = 0; i < studentData.size(); i++){
			   int id = studentData.get(i).getId();
			   String name = studentData.get(i).getName();
			   int roll = studentData.get(i).getRoll();
			   int math = studentData.get(i).getMathScore();
			   int phy = studentData.get(i).getPhyScore();
			   int bio = studentData.get(i).getBioScore();
			   int chem = studentData.get(i).getChemScore();
			   int eng = studentData.get(i).getEngScore();
			   int total = studentData.get(i).getTotalMarks();
			   int per = getPercent(total);
			   
			   Object[] data = {sn,id,name,roll,math,phy,bio,chem,eng,total,per};
			   tableModel.addRow(data);
			   sn++;
	}
	}

	public static void main(String[] args) {
		new StudentResult();
	}
	
	public int getPercent(int totalMarkObtained){
		return (totalMarkObtained*100)/TOTAL_MARK;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Add")){
			new AddStudent();
			this.dispose();
		}
	}
	
	public void sort(){
		Collections.so
	}
}

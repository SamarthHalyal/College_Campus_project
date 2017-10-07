package Codebase;

import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

import java.sql.*;

public class Source extends JApplet {
	private JTextField txtfullname;
	private JTextField txtemail;
	private JTextField txtmobile;
	private JTextField txtsslcpercentage;
	private JTextField txttwelvepercentage;
	private JTextField txtdiplomapercentage;
	private JTextField txtfirst;
	private JTextField txtsecond;
	private JTextField txtthird;
	private JTextField txtfourth;
	private JTextField txtfifth;
	private JTextField txtsixth;
	private JTextField txtseventh;
	private JTextField eighth;
	private JTextField textcity;
	private JTextField textstate;
	private JTextField textgaurdiancontact;
	private JTextField backs;
	
	private Connection conn;
	private JTextField usn;
	
	private float first,second,third,fourth,fifth,sixth,seventh,eight;
	
	/**
	 * Create the applet.
	 */
	public void init() {
		setSize(400, 600);
	}
	
	public Source() {
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 388, 588);
		getContentPane().add(tabbedPane);
		
		Codebase.Step1 step1 = new Step1();
		tabbedPane.add("step 1", step1);
		step1.setLayout(null);
		
		

		JLabel lblFullName = new JLabel("Full Name :");
		lblFullName.setBounds(19, 17, 76, 16);
		//getContentPane().add(lblFullName);
		step1.add(lblFullName);
		
		txtfullname = new JTextField();
		txtfullname.setBounds(108, 12, 239, 26);
		//getContentPane().add(txtfullname);
		txtfullname.setColumns(10);
		step1.add(txtfullname);
		
		JLabel lblNewLabel = new JLabel("Gender :");
		lblNewLabel.setBounds(16, 45, 61, 16);
		//getContentPane().add(lblNewLabel);
		step1.add(lblFullName);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(108, 41, 76, 23);
//		getContentPane().add(rdbtnMale);
		step1.add(rdbtnMale);
		
		
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(196, 41, 87, 23);
//		getContentPane().add(rdbtnFemale);
		step1.add(rdbtnFemale);
		
		if(rdbtnMale.isSelected()){
			rdbtnFemale.setSelected(false);
		}
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(19, 73, 61, 16);
//		getContentPane().add(lblEmail);
		step1.add(lblEmail);
		
		txtemail = new JTextField();
		txtemail.setBounds(86, 68, 261, 26);
//		getContentPane().add(txtemail);
		txtemail.setColumns(10);
		step1.add(txtemail);
		
		JLabel lblMobile = new JLabel("Mobile :");
		lblMobile.setBounds(19, 101, 61, 16);
//		getContentPane().add(lblMobile);
		step1.add(lblMobile);
		
		txtmobile = new JTextField();
		txtmobile.setBounds(96, 96, 247, 26);
//		getContentPane().add(txtmobile);
		txtmobile.setColumns(10);
		step1.add(txtmobile);
		
		JLabel lblBranch = new JLabel("Branch :");
		lblBranch.setBounds(19, 129, 61, 16);
//		getContentPane().add(lblBranch);
		step1.add(lblBranch);
		
		String[] branches = {"CS","EC","CIV","TC","BT","IS","EE","ME","CE"};
		JComboBox branch = new JComboBox();
		branch.setBounds(86, 125, 197, 27);
//		getContentPane().add(branch);
		for(String s:branches){
			branch.addItem(s);
		}
		step1.add(branch);
		
		JLabel lblDob = new JLabel("D.O.B :");
		lblDob.setBounds(16, 556, 61, 16);
//		getContentPane().add(lblDob);
		step1.add(lblDob);
		
		JComboBox date = new JComboBox();
		date.setBounds(86, 552, 55, 27);
//		getContentPane().add(date);
		step1.add(date);
		
		JComboBox month = new JComboBox();
		month.setBounds(148, 552, 90, 27);
//		getContentPane().add(month);
		step1.add(month);
		
		JComboBox year = new JComboBox();
		year.setBounds(249, 553, 70, 27);
//		getContentPane().add(year);
		step1.add(year);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(133, 203, 214, 45);
		step1.add(textArea);
		
		JLabel label = new JLabel("Postal Address :");
		label.setBounds(17, 211, 117, 16);
		step1.add(label);
		
		JLabel label_1 = new JLabel("City :");
		label_1.setBounds(14, 265, 45, 16);
		step1.add(label_1);
		
		textcity = new JTextField();
		textcity.setColumns(10);
		textcity.setBounds(52, 260, 117, 26);
		step1.add(textcity);
		
		JLabel label_2 = new JLabel("State :");
		label_2.setBounds(181, 265, 45, 16);
		step1.add(label_2);
		
		textstate = new JTextField();
		textstate.setColumns(10);
		textstate.setBounds(231, 260, 130, 26);
		step1.add(textstate);
		
		textgaurdiancontact = new JTextField();
		textgaurdiancontact.setColumns(10);
		textgaurdiancontact.setBounds(133, 288, 214, 26);
		step1.add(textgaurdiancontact);
		
		JLabel label_3 = new JLabel("Gaurdian contact :");
		label_3.setBounds(14, 293, 120, 16);
		step1.add(label_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(19, 174, 328, 12);
		step1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(19, 338, 328, 12);
		step1.add(separator_1);
		
		
		
		usn = new JTextField();
		usn.setBounds(135, 398, 212, 26);
		step1.add(usn);
		usn.setColumns(10);
		
		JLabel lblUsn = new JLabel("USN :");
		lblUsn.setBounds(19, 403, 61, 16);
		step1.add(lblUsn);
		
		
	
		
		Codebase.Step1 step2 = new Step1();
		tabbedPane.add("step 2", step2);
		step2.setLayout(null);
		

		
		JLabel lblthYearOf = new JLabel("10th Year of Passing :");
		lblthYearOf.setBounds(21, 27, 150, 16);
		step2.add(lblthYearOf);
		
		int[] years = {1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022,2023,2024,2025,2026,2027,2028,2029,2030,2031,2032,2033,2034,2035,2036,2037,2038,2039};
		JComboBox sslcyear = new JComboBox();
		sslcyear.setBounds(183, 23, 130, 27);
		for(int i:years){
			sslcyear.addItem(i);
		}
		step2.add(sslcyear);
		
		JLabel lblthPercentage = new JLabel("10th Percentage :");
		lblthPercentage.setBounds(21, 55, 117, 16);
//		getContentPane().add(lblthPercentage);
		step2.add(lblthPercentage);
		
		txtsslcpercentage = new JTextField();
		txtsslcpercentage.setBounds(150, 55, 130, 26);
//		getContentPane().add(txtsslcpercentage);
		txtsslcpercentage.setColumns(10);
		step2.add(txtsslcpercentage);
		
		JLabel twelveyear = new JLabel("12th Year of Passing :");
		twelveyear.setBounds(21, 107, 150, 16);
//		getContentPane().add(twelveyear);
		step2.add(twelveyear);
		
		JComboBox twelthyear = new JComboBox();
		twelthyear.setBounds(183, 103, 130, 27);
//		getContentPane().add(twelthyear);
		for(int i:years){
			twelthyear.addItem(i);
		}
		step2.add(twelthyear);
		
		JLabel twelvepercentage = new JLabel("12th Percentage :");
		twelvepercentage.setBounds(21, 146, 117, 16);
//		getContentPane().add(twelvepercentage);
		step2.add(twelvepercentage);
		
		txttwelvepercentage = new JTextField();
		txttwelvepercentage.setColumns(10);
		txttwelvepercentage.setBounds(150, 141, 130, 26);
//		getContentPane().add(txttwelvepercentage);
		step2.add(txttwelvepercentage);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setBounds(19, 83, 325, 12);
//		getContentPane().add(separator_11);
		step2.add(separator_11);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(21, 174, 325, 12);
//		getContentPane().add(separator_2);
		step2.add(separator_2);
		
		JLabel lblDiplomaPercentage = new JLabel("Diploma Percentage :");
		lblDiplomaPercentage.setBounds(21, 233, 150, 16);
//		getContentPane().add(lblDiplomaPercentage);
		step2.add(lblDiplomaPercentage);
		
		txtdiplomapercentage = new JTextField();
		txtdiplomapercentage.setColumns(10);
		txtdiplomapercentage.setBounds(183, 228, 130, 26);
//		getContentPane().add(txtdiplomapercentage);
		step2.add(txtdiplomapercentage);
		
		JComboBox diplomayear = new JComboBox();
		diplomayear.setBounds(207, 194, 117, 27);
//		getContentPane().add(diplomayear);
		for(int i:years){
			diplomayear.addItem(i);
		}
		step2.add(diplomayear);
		
		JLabel diplomayearlb = new JLabel("Diploma Year of Passing :");
		diplomayearlb.setBounds(21, 198, 194, 16);
//		getContentPane().add(diplomayearlb);
		step2.add(diplomayearlb);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(21, 266, 323, 12);
//		getContentPane().add(separator_3);
		step2.add(separator_3);
		
		JLabel lblEnterEachSemister = new JLabel("Enter Each Semester Percentage :");
		lblEnterEachSemister.setBounds(19, 300, 219, 16);
//		getContentPane().add(lblEnterEachSemister);
		step2.add(lblEnterEachSemister);
		
		txtfirst = new JTextField();
		txtfirst.setColumns(10);
		txtfirst.setBounds(54, 333, 117, 26);
//		getContentPane().add(txtsecond);
		step2.add(txtfirst);
		
		txtsecond = new JTextField();
		txtsecond.setColumns(10);
		txtsecond.setBounds(231, 333, 117, 26);
//		getContentPane().add(txtsecond);
		step2.add(txtsecond);
		
		txtthird = new JTextField();
		txtthird.setColumns(10);
		txtthird.setBounds(54, 372, 117, 26);
//		getContentPane().add(txtthird);
		step2.add(txtthird);
		
		txtfourth = new JTextField();
		txtfourth.setColumns(10);
		txtfourth.setBounds(231, 371, 113, 26);
//		getContentPane().add(txtfourth);
		step2.add(txtfourth);
		
		txtfifth = new JTextField();
		txtfifth.setColumns(10);
		txtfifth.setBounds(54, 410, 117, 26);
//		getContentPane().add(txtfifth);
		step2.add(txtfifth);
		
		txtsixth = new JTextField();
		txtsixth.setColumns(10);
		txtsixth.setBounds(231, 409, 110, 26);
//		getContentPane().add(txtsixth);
		step2.add(txtsixth);
		
		txtseventh = new JTextField();
		txtseventh.setColumns(10);
		txtseventh.setBounds(54, 448, 117, 26);
//		getContentPane().add(txtseventh);
		step2.add(txtseventh);
		
		eighth = new JTextField();
		eighth.setColumns(10);
		eighth.setBounds(231, 447, 113, 26);
//		getContentPane().add(eighth);
		step2.add(eighth);
		
		JLabel lblst = new JLabel("1ST :");
		lblst.setBounds(21, 338, 37, 16);
//		getContentPane().add(lblst);
		step2.add(lblst);
		
		JLabel lblnd = new JLabel("2ND :");
		lblnd.setBounds(193, 338, 45, 16);
//		getContentPane().add(lblnd);
		step2.add(lblnd);
		
		JLabel lblrd = new JLabel("3RD :");
		lblrd.setBounds(21, 377, 37, 16);
//		getContentPane().add(lblrd);
		step2.add(lblrd);
		
		JLabel lblth = new JLabel("4TH :");
		lblth.setBounds(193, 377, 45, 16);
//		getContentPane().add(lblth);
		step2.add(lblth);
		
		JLabel lblth_1 = new JLabel("5TH :");
		lblth_1.setBounds(21, 410, 37, 16);
//		getContentPane().add(lblth_1);
		step2.add(lblth_1);
		
		JLabel lblth_2 = new JLabel("6TH :");
		lblth_2.setBounds(193, 415, 37, 16);
//		getContentPane().add(lblth_2);
		step2.add(lblth_2);
		
		JLabel lblth_3 = new JLabel("7TH :");
		lblth_3.setBounds(21, 454, 37, 16);
//		getContentPane().add(lblth_3);
		step2.add(lblth_3);
		
		JLabel lblth_4 = new JLabel("8TH :");
		lblth_4.setBounds(193, 453, 37, 16);
		step2.add(lblth_4);
		
		JLabel lblAggregate = new JLabel("Aggregate : ");
		lblAggregate.setBounds(21, 486, 85, 16);
		step2.add(lblAggregate);
		
		JLabel aggregate = new JLabel("0");
		aggregate.setBounds(110, 486, 45, 16);
		step2.add(aggregate);
		
		JButton btnCalculateAggregate = new JButton("CALCULATE AGGREGATE");
		btnCalculateAggregate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float sum = 0,count = 0;
				if(!txtfirst.getText().equals("")){
					first = Float.parseFloat(txtfirst.getText());
					sum += Float.parseFloat(txtfirst.getText());
					count++;
				}
				if(!txtsecond.getText().equals("")){
					second = Float.parseFloat(txtsecond.getText());
					sum += Float.parseFloat(txtsecond.getText());
					count++;
				}
				if(!txtthird.getText().equals("")){
					third = Float.parseFloat(txtthird.getText());
					sum += Float.parseFloat(txtthird.getText());
					count++;
				}
				if(!txtfourth.getText().equals("")){
					fourth = Float.parseFloat(txtfourth.getText());
					sum += Float.parseFloat(txtfourth.getText());
					count++;
				}
				if(!txtfifth.getText().equals("")){
					fifth = Float.parseFloat(txtfifth.getText());
					sum += Float.parseFloat(txtfifth.getText());
					count++;
				}
				if(!txtsixth.getText().equals("")){
					sixth = Float.parseFloat(txtsixth.getText());
					sum += Float.parseFloat(txtsixth.getText());
					count++;
				}
				if(!txtseventh.getText().equals("")){
					seventh = Float.parseFloat(txtseventh.getText());
					sum += Float.parseFloat(txtseventh.getText());
					count++;
				}
				if(!eighth.getText().equals("")){
					eight = Float.parseFloat(eighth.getText());
					sum += Float.parseFloat(eighth.getText());
					count++;
				}
				float a=0;
				if(count>0)
					a = sum/count;
				
				aggregate.setText(String.valueOf(a));
			}
		});
		btnCalculateAggregate.setBounds(167, 481, 177, 29);
		step2.add(btnCalculateAggregate);
		
		backs = new JTextField();
		backs.setBounds(139, 509, 161, 26);
		step2.add(backs);
		backs.setColumns(10);
		
		JLabel lblBacklogs = new JLabel("Back-Logs :");
		lblBacklogs.setBounds(50, 514, 107, 16);
		step2.add(lblBacklogs);
		
		
		JLabel lblDob_1 = new JLabel("D.O.B :");
		lblDob_1.setBounds(19, 375, 61, 16);
		step1.add(lblDob_1);
		
		JComboBox dd = new JComboBox();
		dd.setBounds(86, 371, 70, 27);
		int[] dates = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		for(int i:dates){
			dd.addItem(i);
		}
		step1.add(dd);
		
		JComboBox mm = new JComboBox();
		mm.setBounds(159, 371, 79, 27);
		String[] months = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		for(String i:months){
			mm.addItem(i);
		}
		step1.add(mm);
		
		JComboBox yy = new JComboBox();
		yy.setBounds(237, 371, 110, 27);
		for(int i:years){
			yy.addItem(i);
		}
		step1.add(yy);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtfullname.getText().toString().toUpperCase();
				String u = usn.getText().toString();
				String g=null;
				if(rdbtnMale.isSelected()){
					g="M";
				}
				else{
					g="F";
				}
				String mail = txtemail.getText().toString();
				String phone = txtmobile.getText().toString();
				String b = branch.getSelectedItem().toString();
				
				float tny = 0,tnp,twy = 0,twp,dy=0,dp;
					
				try{
					tny = Float.valueOf(sslcyear.getSelectedItem().toString());
					tnp = Float.valueOf(txtsslcpercentage.getText().toString());
				}
				catch(Exception e2){
					tnp = 0;
				}
				
				try{
					twy = Float.valueOf(twelthyear.getSelectedItem().toString());
					twp = Float.valueOf(txttwelvepercentage.getText().toString());
				}
				catch(Exception e2){
					twp = 0;
				}	
				
				try{
					dy = Float.valueOf(diplomayear.getSelectedItem().toString());
					dp = Float.valueOf(txtdiplomapercentage.getText().toString());
				}
				catch(Exception e2){
					dp = 0;
				}	
				
				String add = textArea.getText().toString();
				String c = textcity.getText().toString();
				String s = textstate.getText().toString();
				String gc = textgaurdiancontact.getText().toString();
				
					///////////////
						String y = yy.getSelectedItem().toString();
						String m = mm.getSelectedItem().toString();
						int im = 0;
						for(im=0;months[im]!=m;im++);
						System.out.println(im);
						String d = dd.getSelectedItem().toString();
						String dob = y+"-"+String.valueOf((im+1))+"-"+d;
						/////////////////
				
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/College","root","toor");
					Statement statement = conn.createStatement();
					String sql = "insert into info values(\""+u+"\",\""+name+"\",\""+g+"\",\""+mail+"\",\""+phone+
							"\",\""+b+"\","+tny+","+tnp+","+twy+","+twp+","+dy+","+dp+",\""+add+"\",\""+c+"\",\""+s+
							"\",\""+gc+"\",\""+dob+
							"\","+String.valueOf(first)+","+String.valueOf(second)+","+String.valueOf(third)+
							","+String.valueOf(fourth)+","+String.valueOf(fifth)+","+String.valueOf(sixth)+
							","+String.valueOf(seventh)+","+String.valueOf(eight)+","+aggregate.getText().toString()+
							","+backs.getText().toString()+");";
					statement.executeUpdate(sql);
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSubmit.setBounds(121, 438, 117, 29);
		step1.add(btnSubmit);
		
	}
}

class Step1 extends JPanel {
	
}

class Step2 extends JPanel {
	
}

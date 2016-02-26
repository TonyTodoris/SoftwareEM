package SoftwareEvolutionMonitor;

import java.awt.CardLayout;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ActivityChoices.*;
import DataBase.*;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class SoftwareEvolutionMonitorGUI {

	private ArrayList<History> List = new ArrayList<History>();		//List of Files that have been inserted by user
	private History hist ;									//File object
	
	private FirstLaw Law1 ;				//First Law Object
	private SecondLaw Law2;				//Second Law Object
	private ThirdLaw Law3;				//Third Law Object
	private FourthLaw Law4;				//Fourth Law Object
	private FifthLaw Law5;				//Fifth Law Object
	private SixthLaw Law6;				//Sixth Law Object
	private SeventhLaw Law7;			//Seventh Law Object
	private EighthLaw Law8;				//Eight Law Object
	private ReportCreator Rep; 			//Report Creator Object
	private JFrame frame;
	
	//Insert Files TextField
	private JTextField textField;
	
	private Choice choice; //File Choice from menu
	
	//First Law Panel: Charts,Comments,Check-boxes
	private JTextArea FirstLawComments;
	private JCheckBox Yes1;
	private JCheckBox No1;
	private JLabel ChartF1;
	private JLabel ChartF2;
	private JLabel ChartF3;
	
	//Second Law Panel:Charts,Comments,Check-boxes
	private JTextArea SecondLawComments;
	private JCheckBox Yes2;
	private JCheckBox No2;
	private JLabel ChartS1;
	private JLabel ChartS2;
	private JLabel ChartS3;
	
	//Third Law Panel:Charts,Comments,Check-boxes
	private JTextArea ThirdLawComments;
	private JCheckBox Yes3;
	private JCheckBox No3;
	private JLabel ChartT1;
	private JLabel ChartT2;
	
	//Fourth Law Panel:Charts,Comments,Check-boxes
	private JTextArea FourthLawComments;
	private JCheckBox Yes4;
	private JCheckBox No4;
	private JLabel ChartFo1;
	private JLabel ChartFo2;
	
	//Fifth Law Panel:Charts,Comments,Check-boxes
	private JTextArea FifthLawComments;
	private JCheckBox Yes5;
	private JCheckBox No5;
	private JLabel ChartFi1;
	private JLabel ChartFi2;
	
	//Sixth Law Panel:Charts,Comments,Check-boxes
	private JTextArea SixthLawComments;
	private JCheckBox Yes6;
	private JCheckBox No6;
	private JLabel ChartSi1;
	private JLabel ChartSi2;
	
	//Seventh Law Panel:Comments
	private JLabel LawConfig;
	private JTextArea SeventhLawComments;
	
	//Eighth Law Panel:Chart,Comments,Check-boxes
	private JTextArea EighthLawComments;
	private JCheckBox Yes8;
	private JCheckBox No8;
	private JLabel ChartE;
	
	//Report Creator Panel:Comments,Label
	private JTextArea ReportComments;
	private JLabel lblChooseHistory;
	private JButton btnNewButton_1;
	private JLabel lblDoesTheLaw;
	private JLabel lblComments;
	private JLabel lblComments_1;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoftwareEvolutionMonitorGUI window = new SoftwareEvolutionMonitorGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SoftwareEvolutionMonitorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Software Evolution Monitor");
		frame.setBounds(100, 100, 1370, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel panelInsert = new JPanel();                             //Insert Files Panel
		frame.getContentPane().add(panelInsert, "name_6551461623585");
		panelInsert.setLayout(null);
		panelInsert.setVisible(true);
		
		
		JLabel lblInsertFile = new JLabel("Insert Files Here");                
		lblInsertFile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInsertFile.setBounds(10, 74, 146, 30);
		panelInsert.add(lblInsertFile);
		
		final JPanel panelMenu = new JPanel();								//Menu Panel
		frame.getContentPane().add(panelMenu, "name_1714154090682");
		panelMenu.setLayout(null);
		panelMenu.setVisible(false);
		
		final JPanel panelFirstLaw = new JPanel();							//First Law Panel
		frame.getContentPane().add(panelFirstLaw, "name_2629340070966");
		panelFirstLaw.setLayout(null);
		panelFirstLaw.setVisible(false);
		
		final JPanel panelSecondLaw = new JPanel();							//Second Law Panel
		frame.getContentPane().add(panelSecondLaw, "name_11242955938786");
		panelSecondLaw.setLayout(null);
		
		final JPanel panelThirdLaw = new JPanel();							//Third Law Panel
		frame.getContentPane().add(panelThirdLaw, "name_11242955938786");
		panelThirdLaw.setLayout(null);
		
		final JPanel panelFourthLaw = new JPanel();							//Fourth Law Panel
		frame.getContentPane().add(panelFourthLaw, "name_7744203307030");
		panelFourthLaw.setLayout(null);
		
		final JPanel panelFifthLaw = new JPanel();
		frame.getContentPane().add(panelFifthLaw, "name_10561084423152"); //Fifth Law Panel
		panelFifthLaw.setLayout(null);
		
		final JPanel panelSixthLaw = new JPanel();						//Sixth Law Panel
		frame.getContentPane().add(panelSixthLaw, "name_13577835476679");
		panelSixthLaw.setLayout(null);
		
		final JPanel panelSeventhLaw = new JPanel();							//Seventh Law Panel
		frame.getContentPane().add(panelSeventhLaw, "name_1030463459604");
		panelSeventhLaw.setLayout(null);
		
		
		final JPanel panelEighthLaw = new JPanel();							//Eighth Law Panel
		frame.getContentPane().add(panelEighthLaw, "name_4241741579185");
		panelEighthLaw.setLayout(null);
		
		final JPanel panelReport = new JPanel();									//Report Creator Panel
		frame.getContentPane().add(panelReport, "name_703880370277");
		panelReport.setLayout(null);
		
		
		
		
		
		JLabel lblChooseLaw = new JLabel("Choose Activity:");
		lblChooseLaw.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblChooseLaw.setBounds(134, 30, 126, 53);
		panelMenu.add(lblChooseLaw);
		
		JButton btnFirstLaw = new JButton("First Law");             //First Law button choice from menu and it's actions
		btnFirstLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFirstLaw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i<List.size(); i++){
					if(choice.getSelectedItem().equals(List.get(i).Name)){
						hist = List.get(i);
						break;
					}
				}
				panelMenu.setVisible(false);
				Law1 = new FirstLaw(hist,FirstLawComments,Yes1,No1,ChartF1,ChartF2,ChartF3);
				panelFirstLaw.setVisible(true);
			}
		});
		btnFirstLaw.setBounds(270, 47, 134, 23);
		panelMenu.add(btnFirstLaw);
		
		choice = new Choice();                             //File Choice from menu
		choice.setBounds(623, 50, 310, 20);
		panelMenu.add(choice);
		
		JButton btnSecondLaw = new JButton("Second Law");			//Second Law button choice from menu and it's actions
		btnSecondLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSecondLaw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i<List.size(); i++){
					if(choice.getSelectedItem().equals(List.get(i).Name)){
						hist = List.get(i);
						break;
					}
				}
				panelMenu.setVisible(false);
				Law2 = new SecondLaw(hist,SecondLawComments,Yes2,No2,ChartS1,ChartS2,ChartS3);
				panelSecondLaw.setVisible(true);
			}
		});
		btnSecondLaw.setBounds(270, 80, 134, 23);
		panelMenu.add(btnSecondLaw);
		
		JButton btnThirdLaw = new JButton("Third Law");			//Third Law button choice from menu and it's actions
		btnThirdLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnThirdLaw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i<List.size(); i++){
					if(choice.getSelectedItem().equals(List.get(i).Name)){
						hist = List.get(i);
						break;
					}
				}
				panelMenu.setVisible(false);
				Law3 = new ThirdLaw(hist,ThirdLawComments,Yes3,No3,ChartT1,ChartT2);
				panelThirdLaw.setVisible(true);
			}
		});
		btnThirdLaw.setBounds(270, 114, 134, 23);
		panelMenu.add(btnThirdLaw);
		
		
		
		JButton btnFourthLaw = new JButton("Fourth Law");			//Fourth Law button choice from menu and it's actions
		btnFourthLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFourthLaw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i<List.size(); i++){
					if(choice.getSelectedItem().equals(List.get(i).Name)){
						hist = List.get(i);
						break;
					}
				}
				panelMenu.setVisible(false);
				Law4 = new FourthLaw(hist,FourthLawComments,Yes4,No4,ChartFo1,ChartFo2);
				panelFourthLaw.setVisible(true);
			}
		});
		btnFourthLaw.setBounds(270, 148, 134, 23);
		panelMenu.add(btnFourthLaw);
		
		
		JButton btnFifthLaw = new JButton("Fifth Law");			//Fifth Law button choice from menu and it's actions
		btnFifthLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFifthLaw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i<List.size(); i++){
					if(choice.getSelectedItem().equals(List.get(i).Name)){
						hist = List.get(i);
						break;
					}
				}
				panelMenu.setVisible(false);
				Law5 = new FifthLaw(hist,FifthLawComments,Yes5,No5,ChartFi1,ChartFi2);
				panelFifthLaw.setVisible(true);
			}
		});
		btnFifthLaw.setBounds(270, 182, 134, 23);
		panelMenu.add(btnFifthLaw);
		
		JButton btnSixthLaw = new JButton("Sixth Law");			//Sixth Law button choice from menu and it's actions
		btnSixthLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSixthLaw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i<List.size(); i++){
					if(choice.getSelectedItem().equals(List.get(i).Name)){
						hist = List.get(i);
						break;
					}
				}
				panelMenu.setVisible(false);
				Law6 = new SixthLaw(hist,SixthLawComments,Yes6,No6,ChartSi1,ChartSi2);
				panelSixthLaw.setVisible(true);
			}
		});
		btnSixthLaw.setBounds(270, 220, 134, 23);
		panelMenu.add(btnSixthLaw);
		
		
		
		JButton btnSeventhLaw = new JButton("Seventh Law");			//Seventh Law button choice from menu and it's actions
		btnSeventhLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSeventhLaw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i<List.size(); i++){
					if(choice.getSelectedItem().equals(List.get(i).Name)){
						hist = List.get(i);
						break;
					}
				}
				panelMenu.setVisible(false);
				Law7 = new SeventhLaw(hist,SeventhLawComments,LawConfig);
				panelSeventhLaw.setVisible(true);
			}
		});
		btnSeventhLaw.setBounds(270, 254, 134, 23);
		panelMenu.add(btnSeventhLaw);
		
		
		
		
		JButton btnEighthLaw = new JButton("Eighth Law");			//Eighth Law button choice from menu and it's actions
		btnEighthLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEighthLaw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i<List.size(); i++){
					if(choice.getSelectedItem().equals(List.get(i).Name)){
						hist = List.get(i);
						break;
					}
				}
				panelMenu.setVisible(false);
				Law8 = new EighthLaw(hist,EighthLawComments,Yes8,No8,ChartE);
				panelEighthLaw.setVisible(true);
			}
		});
		btnEighthLaw.setBounds(270, 288, 134, 23);
		panelMenu.add(btnEighthLaw);
		
		
		JButton btnCreateReport = new JButton("Final Report");			//Final Report button choice from menu and it's actions
		btnCreateReport.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCreateReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i<List.size(); i++){
					if(choice.getSelectedItem().equals(List.get(i).Name)){
						hist = List.get(i);
						break;
					}
				}
				ReportComments.setText(hist.Report);
				panelMenu.setVisible(false);
				panelReport.setVisible(true);
			}
		});
		btnCreateReport.setBounds(270, 322, 134, 23);
		panelMenu.add(btnCreateReport);
		
		lblChooseHistory = new JLabel("Choose History:");
		lblChooseHistory.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblChooseHistory.setBounds(490, 41, 128, 31);
		panelMenu.add(lblChooseHistory);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(false);
				panelInsert.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(270, 356, 134, 23);
		panelMenu.add(btnNewButton_1);
		
		
		FirstLawComments = new JTextArea();              //First Law TextArea and <Yes,No> check-boxes with its charts
		FirstLawComments.setBounds(490, 336, 336, 86);
		panelFirstLaw.add(FirstLawComments);
		FirstLawComments.setColumns(10);
		
	    Yes1 = new JCheckBox("Yes");             
		Yes1.setBounds(510, 310, 71, 23);
		panelFirstLaw.add(Yes1);
		
		No1 = new JCheckBox("No");
		No1.setBounds(583, 310, 97, 23);
		panelFirstLaw.add(No1);
		
		ChartF1 = new JLabel();
		ChartF1.setBounds(0, 0, 450, 296);
		panelFirstLaw.add(ChartF1);
		
		ChartF2 = new JLabel();
		ChartF2.setBounds(460, 0, 438, 296);
		panelFirstLaw.add(ChartF2);
		
		ChartF3 = new JLabel();
		ChartF3.setBounds(908, 0, 436, 296);
		panelFirstLaw.add(ChartF3);
		
		
		JButton Done1 = new JButton("Done!");                //Button Done! for First Law and it's actions
		Done1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hist.Law1Com = FirstLawComments.getText();
				FirstLawComments.setText("");
				if(Yes1.isSelected()){
					Yes1.doClick();
					hist.Law1 =2;
				}
				if(No1.isSelected()){
					No1.doClick();
					hist.Law1 = 1;  
				}
				panelFirstLaw.setVisible(false);
				panelMenu.setVisible(true);
				
			}
		});
		Done1.setBounds(686, 310, 89, 23);
		panelFirstLaw.add(Done1);
		
		lblDoesTheLaw = new JLabel("Does the Law Apply?");
		lblDoesTheLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDoesTheLaw.setBounds(354, 313, 132, 14);
		panelFirstLaw.add(lblDoesTheLaw);
		
		lblComments = new JLabel("Comments:");
		lblComments.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblComments.setBounds(402, 335, 78, 14);
		panelFirstLaw.add(lblComments);
		
															//Insert Files button and TextField
		
		textField = new JTextField();
		textField.setBounds(150, 74, 887, 30);
		panelInsert.add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertfiles(textField.getText());
				textField.setText("");
			}
		});
		btnOk.setBounds(950, 113, 89, 44);
		panelInsert.add(btnOk);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelInsert.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
		btnNewButton.setBounds(646, 207, 89, 51);
		panelInsert.add(btnNewButton);
		
		
															//Second Law TextArea and <Yes,No> check-boxes with its charts
		SecondLawComments = new JTextArea();
		SecondLawComments.setBounds(490, 336, 336, 86);
		panelSecondLaw.add(SecondLawComments);
		SecondLawComments.setColumns(10);
		
		Yes2 = new JCheckBox("Yes");             
		Yes2.setBounds(510, 310, 71, 23);
		panelSecondLaw.add(Yes2);
			
		No2 = new JCheckBox("No");
		No2.setBounds(583, 310, 97, 23);
		panelSecondLaw.add(No2);
		
		ChartS1 = new JLabel();								
		ChartS1.setBounds(0, 0, 450, 296);
		panelSecondLaw.add(ChartS1);
		
		ChartS2 = new JLabel();
		ChartS2.setBounds(460, 0, 438, 296);
		panelSecondLaw.add(ChartS2);
		
		ChartS3 = new JLabel();
		ChartS3.setBounds(908, 0, 436, 296);
		panelSecondLaw.add(ChartS3);
		
		
		JButton Done2 = new JButton("Done!");                //Button Done! for Second Law and it's actions
		Done2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hist.Law2Com = SecondLawComments.getText();
				SecondLawComments.setText("");
				if(Yes2.isSelected()){
					Yes2.doClick();
					hist.Law2 =2;
				}
				if(No2.isSelected()){
					No2.doClick();
					hist.Law2 = 1;  
				}
				panelSecondLaw.setVisible(false);
				panelMenu.setVisible(true);
				
			}
		});
		Done2.setBounds(686, 310, 89, 23);
		panelSecondLaw.add(Done2);
		
		lblDoesTheLaw = new JLabel("Does the Law Apply?");
		lblDoesTheLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDoesTheLaw.setBounds(354, 313, 132, 14);
		panelSecondLaw.add(lblDoesTheLaw);
		
		lblComments = new JLabel("Comments:");
		lblComments.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblComments.setBounds(402, 335, 78, 14);
		panelSecondLaw.add(lblComments);
		
		
																	//Third Law Area , <Yes,No> check-boxes with charts
		ThirdLawComments = new JTextArea();
		ThirdLawComments.setBounds(490, 336, 336, 86);
		panelThirdLaw.add(ThirdLawComments);
		ThirdLawComments.setColumns(10);
		
		Yes3 = new JCheckBox("Yes");             
		Yes3.setBounds(510, 310, 71, 23);
		panelThirdLaw.add(Yes3);
			
		No3 = new JCheckBox("No");
		No3.setBounds(583, 310, 97, 23);
		panelThirdLaw.add(No3);
		
		ChartT1 = new JLabel();								
		ChartT1.setBounds(77, 0, 536, 303);
		panelThirdLaw.add(ChartT1);
		
		ChartT2 = new JLabel();
		ChartT2.setBounds(663, 0, 599, 303);
		panelThirdLaw.add(ChartT2);
		
		
		JButton Done3 = new JButton("Done!");                //Button Done! for Third Law and it's actions
		Done3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hist.Law3Com = ThirdLawComments.getText();
				ThirdLawComments.setText("");
				if(Yes3.isSelected()){
					Yes3.doClick();
					hist.Law3 =2;
				}
				if(No3.isSelected()){
					No3.doClick();
					hist.Law3 = 1;  
				}
				panelThirdLaw.setVisible(false);
				panelMenu.setVisible(true);
				
			}
		});
		Done3.setBounds(686, 310, 89, 23);
		panelThirdLaw.add(Done3);
		
		lblDoesTheLaw = new JLabel("Does the Law Apply?");
		lblDoesTheLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDoesTheLaw.setBounds(354, 313, 132, 14);
		panelThirdLaw.add(lblDoesTheLaw);
		
		lblComments = new JLabel("Comments:");
		lblComments.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblComments.setBounds(402, 335, 78, 14);
		panelThirdLaw.add(lblComments);
		
			
		
													//Fourth Law TextArea , <Yes,No> check-boxes with charts
		FourthLawComments = new JTextArea();
		FourthLawComments.setBounds(490, 336, 336, 86);
		panelFourthLaw.add(FourthLawComments);
		FourthLawComments.setColumns(10);

		Yes4 = new JCheckBox("Yes");            	
		Yes4.setBounds(510, 310, 71, 23);
		panelFourthLaw.add(Yes4);

		No4 = new JCheckBox("No");
		No4.setBounds(583, 310, 97, 23);
		panelFourthLaw.add(No4);

		ChartFo1 = new JLabel();								
		ChartFo1.setBounds(77, 0, 536, 303);
		panelFourthLaw.add(ChartFo1);

		ChartFo2 = new JLabel();
		ChartFo2.setBounds(663, 0, 599, 303);
		panelFourthLaw.add(ChartFo2);


		JButton Done4 = new JButton("Done!");                //Button Done! for Fourth Law and it's actions
		Done4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hist.Law4Com = FourthLawComments.getText();
				FourthLawComments.setText("");
				if(Yes4.isSelected()){
					Yes4.doClick();
					hist.Law4 =2;
				}
				if(No4.isSelected()){
					No4.doClick();
					hist.Law4 = 1;  
				}
				panelFourthLaw.setVisible(false);
				panelMenu.setVisible(true);

			}	
		});
		Done4.setBounds(686, 310, 89, 23);
		panelFourthLaw.add(Done4);
		
		lblDoesTheLaw = new JLabel("Does the Law Apply?");
		lblDoesTheLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDoesTheLaw.setBounds(354, 313, 132, 14);
		panelFourthLaw.add(lblDoesTheLaw);
		
		lblComments = new JLabel("Comments:");
		lblComments.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblComments.setBounds(402, 335, 78, 14);
		panelFourthLaw.add(lblComments);
		
		
		
		FifthLawComments = new JTextArea();                 //Fifth Law TextArea, <Yes,No> check-boxes with charts
		FifthLawComments.setBounds(490, 336, 336, 86);
		panelFifthLaw.add(FifthLawComments);
		FifthLawComments.setColumns(10);
		
		Yes5 = new JCheckBox("Yes");             
		Yes5.setBounds(510, 310, 71, 23);
		panelFifthLaw.add(Yes5);
			
		No5 = new JCheckBox("No");
		No5.setBounds(583, 310, 97, 23);
		panelFifthLaw.add(No5);
		
		ChartFi1 = new JLabel();								
		ChartFi1.setBounds(77, 0, 536, 303);
		panelFifthLaw.add(ChartFi1);
		
		ChartFi2 = new JLabel();
		ChartFi2.setBounds(663, 0, 599, 303);
		panelFifthLaw.add(ChartFi2);
		
		
		JButton Done5 = new JButton("Done!");                //Button Done! for Fifth Law and it's actions
		Done5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hist.Law5Com = FifthLawComments.getText();
				FifthLawComments.setText("");
				if(Yes5.isSelected()){
					Yes5.doClick();
					hist.Law5 =2;
				}
				if(No5.isSelected()){
					No5.doClick();
					hist.Law5 = 1;  
				}
				panelFifthLaw.setVisible(false);
				panelMenu.setVisible(true);
				
			}
		});
		Done5.setBounds(686, 310, 89, 23);
		panelFifthLaw.add(Done5);
		
		lblDoesTheLaw = new JLabel("Does the Law Apply?");
		lblDoesTheLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDoesTheLaw.setBounds(354, 313, 132, 14);
		panelFifthLaw.add(lblDoesTheLaw);
		
		lblComments = new JLabel("Comments:");
		lblComments.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblComments.setBounds(402, 335, 78, 14);
		panelFifthLaw.add(lblComments);
		
		
		SixthLawComments = new JTextArea();                 //Sixth Law TextArea, <Yes,No> check-boxes with charts
		SixthLawComments.setBounds(490, 336, 336, 86);
		panelSixthLaw.add(SixthLawComments);
		SixthLawComments.setColumns(10);
		
		Yes6 = new JCheckBox("Yes");             
		Yes6.setBounds(510, 310, 71, 23);
		panelSixthLaw.add(Yes6);
			
		No6 = new JCheckBox("No");
		No6.setBounds(583, 310, 97, 23);
		panelSixthLaw.add(No6);
		
		ChartSi1 = new JLabel();								
		ChartSi1.setBounds(77, 0, 536, 303);
		panelSixthLaw.add(ChartSi1);
		
		ChartSi2 = new JLabel();
		ChartSi2.setBounds(663, 0, 599, 303);
		panelSixthLaw.add(ChartSi2);
		
		JButton Done6 = new JButton("Done!");                //Button Done! for Sixth Law and it's actions
		Done6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hist.Law6Com = SixthLawComments.getText();
				SixthLawComments.setText("");
				if(Yes6.isSelected()){
					Yes6.doClick();
					hist.Law6 =2;
				}
				if(No6.isSelected()){
					No6.doClick();
					hist.Law6 = 1;  
				}
				panelSixthLaw.setVisible(false);
				panelMenu.setVisible(true);
				
			}
		});
		Done6.setBounds(686, 310, 89, 23);
		panelSixthLaw.add(Done6);
		
		lblDoesTheLaw = new JLabel("Does the Law Apply?");
		lblDoesTheLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDoesTheLaw.setBounds(354, 313, 132, 14);
		panelSixthLaw.add(lblDoesTheLaw);
		
		lblComments = new JLabel("Comments:");
		lblComments.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblComments.setBounds(402, 335, 78, 14);
		panelSixthLaw.add(lblComments);
		
		
												
		LawConfig = new JLabel();					//Seventh Law TextArea,and Label Result 
		LawConfig.setBounds(324, 56, 567, 55);
		panelSeventhLaw.add(LawConfig);
		
		SeventhLawComments = new JTextArea();
		SeventhLawComments.setBounds(324, 191, 567, 154);
		panelSeventhLaw.add(SeventhLawComments);
		SeventhLawComments.setColumns(10);
		
		JButton Done7 = new JButton("Done!");		//Done Button for Seventh Law and it's actions
		Done7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hist.Law7Com = SeventhLawComments.getText();
				SeventhLawComments.setText("");
				panelSeventhLaw.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
		Done7.setBounds(802, 157, 89, 23);
		panelSeventhLaw.add(Done7);
		
		lblComments_1 = new JLabel("Comments:");
		lblComments_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblComments_1.setBounds(238, 190, 76, 14);
		panelSeventhLaw.add(lblComments_1);
		
		
		EighthLawComments = new JTextArea();                 //Eight Law TextArea, <Yes,No> check-boxes with charts
		EighthLawComments.setBounds(490, 336, 336, 86);
		panelEighthLaw.add(EighthLawComments);
		EighthLawComments.setColumns(10);
		
		Yes8 = new JCheckBox("Yes");             
		Yes8.setBounds(510, 310, 71, 23);
		panelEighthLaw.add(Yes8);
			
		No8 = new JCheckBox("No");
		No8.setBounds(583, 310, 97, 23);
		panelEighthLaw.add(No8);
		
		ChartE = new JLabel();								
		ChartE.setBounds(363, 0, 536, 303);
		panelEighthLaw.add(ChartE);
		
		JButton Done8 = new JButton("Done!");                //Button Done! for Eighth Law and it's actions
		Done8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hist.Law8Com = EighthLawComments.getText();
				EighthLawComments.setText("");
				if(Yes8.isSelected()){
					Yes8.doClick();
					hist.Law8 =2;
				}
				if(No8.isSelected()){
					No8.doClick();
					hist.Law8 = 1;  
				}
				panelEighthLaw.setVisible(false);
				panelMenu.setVisible(true);
				
			}
		});
		Done8.setBounds(686, 310, 89, 23);
		panelEighthLaw.add(Done8);
		
		lblDoesTheLaw = new JLabel("Does the Law Apply?");
		lblDoesTheLaw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDoesTheLaw.setBounds(354, 313, 132, 14);
		panelEighthLaw.add(lblDoesTheLaw);
		
		lblComments = new JLabel("Comments:");
		lblComments.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblComments.setBounds(402, 335, 78, 14);
		panelEighthLaw.add(lblComments);
		
		
		ReportComments = new JTextArea();				//Final Report TextArea and Label
		ReportComments.setBounds(347, 77, 556, 244);
		panelReport.add(ReportComments);
		
		JButton btnDone = new JButton("Done!");			//Button Done for Final Report and it's actions
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hist.Report = ReportComments.getText();
				Rep = new ReportCreator(hist);
				ReportComments.setText("");
				panelReport.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
		btnDone.setBounds(934, 298, 89, 23);
		panelReport.add(btnDone);
		
		
		
		
		
		
		
		
		
	}
	
	
	public void insertfiles(String input){           //Input  and file creation
		History h;
		int finder=0;
		h = new History(input);
		for(int j=0; j<List.size(); j++){
			if(h.Name.equals(List.get(j).Name)){
				finder = 1;
			}
		}
		if(finder == 0){
			List.add(h);
			choice.add(h.Name);
		}
	}
}

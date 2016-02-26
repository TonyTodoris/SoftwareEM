package ActivityChoices;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import DataBase.*;

public class EighthLaw {
	private History File;	
	private ArrayList<Version> VersionL;
	private JTextArea Comments;											
	private JCheckBox Yes;
	private JCheckBox No;
	private JLabel Ch1 ;
	private DefaultCategoryDataset dataBar1 = new DefaultCategoryDataset();
	
	public  EighthLaw(History file, JTextArea comments, JCheckBox yes, JCheckBox no,JLabel ch1){
		this.File = file;
		this.Comments=comments;
		this.Yes=yes;
		this.No =no;
		this.Ch1=ch1;
		this.VersionL = file.VersionList;
	    makeCharts();
		putPreviousChoices();
		
	}
	
	public void makeCharts(){ 				//Chart Creator
		for(int i= 0; i<VersionL.size(); i++){
			dataBar1.setValue(VersionL.get(i).NumberOfOp,"Number of Operations Actual",new Integer(VersionL.get(i).ID));
			dataBar1.setValue(VersionL.get(i).FutureNumberOfOp,"Number of Operations Estimation",new Integer(VersionL.get(i).ID));
		}
		
		JFreeChart chart1 = ChartFactory.createLineChart(File.Name+":Number of Operations estimations", "version ID", "number of operations", dataBar1);
		BufferedImage image1 = chart1.createBufferedImage(450,296);
		ImageIcon icon1 = new ImageIcon(image1);
		Ch1.setIcon(icon1);
		
	}
	
	
	public void putPreviousChoices(){ 			//Previous choices display (made from user)
		Comments.setText(File.Law8Com);
	    if(File.Law8 == 2){
	    	Yes.doClick();
	    }
	    if(File.Law8 == 1){
	    	No.doClick();
	    }	
	}
}

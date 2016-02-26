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

public class FourthLaw {
	private History File;	
	private ArrayList<Version> VersionL;
	private JTextArea Comments;											
	private JCheckBox Yes;
	private JCheckBox No;
	private JLabel Ch1 ;
	private JLabel Ch2 ;
	private DefaultCategoryDataset dataBar1 = new DefaultCategoryDataset();
	private DefaultCategoryDataset dataBar2 = new DefaultCategoryDataset();
	
	public  FourthLaw(History file, JTextArea comments, JCheckBox yes, JCheckBox no,JLabel ch1,JLabel ch2){
		this.File = file;
		this.Comments=comments;
		this.Yes=yes;
		this.No =no;
		this.Ch1=ch1;
		this.Ch2=ch2;
		this.VersionL=file.VersionList;
	    makeCharts();
	    putPreviousChoices();
		
	}
	
	public void makeCharts(){				//Chart Creator
		for(int i = 0; i<VersionL.size(); i++){
			dataBar1.setValue(VersionL.get(i).OpWorkRate, "Line",new Integer(VersionL.get(i).ID));
			dataBar2.setValue(VersionL.get(i).DataWorkRate,"Line",new Integer(VersionL.get(i).ID));
		}
		
		JFreeChart chart1 = ChartFactory.createLineChart(File.Name+":Operations work-rate", "version ID", "work-rate(days)", dataBar1);
		BufferedImage image1 = chart1.createBufferedImage(450,296);
		ImageIcon icon1 = new ImageIcon(image1);
		Ch1.setIcon(icon1);
		
		
		JFreeChart chart2 = ChartFactory.createLineChart(File.Name+":Data Structures work-rate", "version ID", "work-rate(days)", dataBar2);
		BufferedImage image2 = chart2.createBufferedImage(438,296);
		ImageIcon icon2 = new ImageIcon(image2);
		Ch2.setIcon(icon2);
		
	}
	
	
	
	
	public void putPreviousChoices(){ 			//Previous choices display (made from user)
		Comments.setText(File.Law4Com);
	    if(File.Law4 == 2){
	    	Yes.doClick();
	    }
	    if(File.Law4 == 1){
	    	No.doClick();
	    }	
	}
}

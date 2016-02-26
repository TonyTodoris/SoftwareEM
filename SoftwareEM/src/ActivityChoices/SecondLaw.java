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

public class SecondLaw {
	private History File;		
	private ArrayList<Version> VersionL;
	private JTextArea Comments;											
	private JCheckBox Yes;
	private JCheckBox No;
	private JLabel Ch1 ;
	private JLabel Ch2 ;
	private JLabel Ch3 ;
	private DefaultCategoryDataset dataBar1 = new DefaultCategoryDataset();
	private DefaultCategoryDataset dataBar2 = new DefaultCategoryDataset();
	private DefaultCategoryDataset dataBar3 = new DefaultCategoryDataset();
	
	public  SecondLaw(History file, JTextArea comments, JCheckBox yes, JCheckBox no,JLabel ch1,JLabel ch2,JLabel ch3){
		this.File = file;
		this.Comments=comments;
		this.Yes=yes;
		this.No =no;
		this.Ch1=ch1;
		this.Ch2=ch2;
		this.Ch3=ch3;
		this.VersionL=file.VersionList; 
	    makeCharts();
	    putPreviousChoices();
		
	}
	
	public void makeCharts(){				//Chart Creator
		for(int i=0; i<VersionL.size(); i++){
			dataBar1.setValue(VersionL.get(i).Opcomplexity,"Line",new Integer(VersionL.get(i).ID));
			dataBar2.setValue(VersionL.get(i).Datacomplexity,"Line",new Integer(VersionL.get(i).ID));
			dataBar3.setValue(VersionL.get(i).numberOfactions,"Bar",new Integer(VersionL.get(i).ID));
		}
		
		JFreeChart chart1 = ChartFactory.createLineChart(File.Name+":Operation Complexity", "version ID", "complexity", dataBar1);
		BufferedImage image1 = chart1.createBufferedImage(450,296);
		ImageIcon icon1 = new ImageIcon(image1);
		Ch1.setIcon(icon1);
		
		JFreeChart chart2 = ChartFactory.createLineChart(File.Name+":Data Structure Complexity", "version ID", "complexity", dataBar2);
		BufferedImage image2 = chart2.createBufferedImage(438,296);
		ImageIcon icon2 = new ImageIcon(image2);
		Ch2.setIcon(icon2);
		
		JFreeChart chart3 = ChartFactory.createBarChart(File.Name+":Maintenance Actions", "version ID", "number of actions", dataBar3);
		BufferedImage image3 = chart3.createBufferedImage(438,296);
		ImageIcon icon3 = new ImageIcon(image3);
		Ch3.setIcon(icon3);
		
	}
	
	
	public void putPreviousChoices(){ 			//Previous choices display (made from user)
		Comments.setText(File.Law2Com);
	    if(File.Law2 == 2){
	    	Yes.doClick();
	    }
	    if(File.Law2 == 1){
	    	No.doClick();
	    }	
	}
}

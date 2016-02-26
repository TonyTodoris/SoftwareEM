package DataBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileParser {
	private  ArrayList<String> text = new ArrayList<String>();		//File's text
	private Scanner input = null;									
	private String line = null;
	private String[] colums;
	private String[] colums1;
	
		
	public FileParser(String file,History f){
		try{
			System.out.println(file);
			input = new Scanner(new FileInputStream(file));
			
			}
			catch(FileNotFoundException e){
				System.out.println("Problem opening file.");
			//	System.exit(0);
			}
		
		
		int i=0;
		while(input.hasNext()){
			line = input.nextLine();
			text.add(line);
		}
		input.close();
		
		
		colums =text.get(0).split(";");
		f.Name = colums[1];
	    colums =text.get(1).split(";");
	    i = Integer.parseInt(colums[1]);
	    f.Operations = i;
	    colums =text.get(2).split(";");
	    i = Integer.parseInt(colums[1]);
	    f.DataStructures = i;
	    for(i=4; i<text.size(); i++){
	    	  int id,opAdd,opDel,opUpd,DataAdd,DataDel,DataUpd,year;
	    	  String date;
	    	  
	    	  colums =text.get(i).split(";");
	    	  
	    	  id = Integer.parseInt(colums[0]);
	    	  
	    	  date = colums[1];
	    	  
	    	  colums1 = date.split("/");
	    	  
	    	  year = Integer.parseInt(colums1[2]);
	    	  
	    	  opAdd = Integer.parseInt(colums[2]);
	    	  
	    	  opDel = Integer.parseInt(colums[3]);
	    	  
	    	  opUpd = Integer.parseInt(colums[4]);
	    	  
	    	  DataAdd = Integer.parseInt(colums[5]);
	    	  
	    	  DataDel = Integer.parseInt(colums[6]);
	    	  
	    	  DataUpd = Integer.parseInt(colums[7]);
	    	   
	    	  Version v = new Version(id,date,opAdd,opDel,opUpd,DataAdd,DataDel,DataUpd);
	    	  
	    	  f.VersionYears.add(year);
	    	  
	    	  f.VersionList.add(v);
	    }
		
	    Year yeaR ;
		int y = f.VersionYears.get(0);
		yeaR = new Year(y,f.VersionYears);
		f.YearList.add(yeaR);
		for( i=0; i<f.VersionYears.size(); i++){
				if(y!=f.VersionYears.get(i)){
					y = f.VersionYears.get(i);
					yeaR = new Year(y,f.VersionYears);
					f.YearList.add(yeaR);
				}	
		}
	}
	
	
	
	
	
}

package ActivityChoices;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



import DataBase.*;

public class ReportCreator {
	private String content;
	private History File;	
	
	public ReportCreator(History file){
		this.File = file;
		this.content = File.Report;
		createFile();
	}
	
	public void createFile(){				//File creator method
		try{
			
			File f = new File("C:/Users/Αντωνης/workspace/SoftwareEM/src/"+File.Name+" Report"+".txt");
			if(!f.exists()){
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			System.out.println("done");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
}

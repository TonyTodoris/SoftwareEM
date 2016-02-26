package ActivityChoices;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import DataBase.*;

public class SeventhLaw {
	private History File;	
	private JTextArea Comments;											
	private JLabel Config ;
	
	public  SeventhLaw(History file, JTextArea comments,JLabel Con){
		this.File = file;
		this.Comments=comments;
		this.Config=Con;
		makeConfiguration();
		putPreviousComments();
	}
	
	public void makeConfiguration(){
		if(File.Law2==2 && File.Law6==2){
			Config.setText("Seventh Law applies");
		}
		if((File.Law2==1 && File.Law6==2) || (File.Law2==2 && File.Law6==1) || (File.Law2==1 && File.Law6==1) ){
			Config.setText("Seventh Law does not apply");
		}
		if(File.Law2==0 && File.Law6==0){
			Config.setText("Both Laws:Second and Sixth  have not been configured for this history yet ");
		}
		if(File.Law2==0 && File.Law6!=0){
			Config.setText("Second Law has not been configured");
		}
		if(File.Law2!=0 && File.Law6==0){
			Config.setText("Sixth Law has not been configured");
		}
	}
	
	public void putPreviousComments(){
		Comments.setText(File.Law7Com);
	}
	
}

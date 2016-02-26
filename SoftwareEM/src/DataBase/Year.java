package DataBase;

import java.util.ArrayList;

public class Year {
	public int counter=0;
	public int year;
	
	public Year(int y,ArrayList<Integer> ListOfYears){
		this.year=y;
		for(int j=0; j<ListOfYears.size(); j++){
			if(year==ListOfYears.get(j)){
				counter++;
			}
			
		}
		
	}
}

package DataBase;

import java.util.ArrayList;

public class WorkRateCalculator {
	private double timeDifference=0;
	private double timeNow=0;
	private double timeBefore=0;
	private double OpworkRate;
	private double DataworkRate;
	
	public WorkRateCalculator(ArrayList<Version> List){
			for(int i=1; i<List.size(); i++){
			double j,w;
		  	timeNow = (List.get(i).Year*365) + (List.get(i).Month*30) + List.get(i).Day;
		  	timeBefore =  (List.get(i-1).Year*365) + (List.get(i-1).Month*30) + List.get(i-1).Day;
		  	timeDifference = (timeNow - timeBefore);
		  	j = List.get(i).OpAdded + List.get(i).OpUpdated + List.get(i).OpDeleted;
		  	w = List.get(i).DataStAdded + List.get(i).DataStUpdated + List.get(i).DataStDeleted;
		  	OpworkRate = (j/timeDifference);
		  	DataworkRate = (w/timeDifference);
		    List.get(i).OpWorkRate = OpworkRate;
		    List.get(i).DataWorkRate = DataworkRate;
			}
		}
	

}


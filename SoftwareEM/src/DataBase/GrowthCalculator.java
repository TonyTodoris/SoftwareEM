package DataBase;

import java.util.ArrayList;

public class GrowthCalculator {
	private int DataStrNow;
	private int DataStrPast;
	private int OperationsNow;
	private int OperationsPast;
	
	public GrowthCalculator(ArrayList<Version> List,int Op,int Data){
		this.DataStrNow = Data;
		this.DataStrPast =Data;
		this.OperationsNow = Op;
		this.OperationsPast = Op;
		for(int i = 1; i<List.size(); i++){
			OperationsNow+=List.get(i).OpAdded;
			OperationsNow-=List.get(i).OpDeleted;
			DataStrNow+=List.get(i).DataStAdded;
			DataStrNow-=List.get(i).DataStDeleted;
			List.get(i).DataGrowth = DataStrNow - DataStrPast ;
			List.get(i).OpGrowth = OperationsNow - OperationsPast; 
			DataStrPast = DataStrNow;
			OperationsPast = OperationsNow;
		}
	}
}

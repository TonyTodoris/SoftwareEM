package DataBase;

import java.util.ArrayList;

public class NumberOfOpDataCalculator {
	private int Op;
	private int Data;
	
	public NumberOfOpDataCalculator(ArrayList<Version> List ,int op,int data){
		this.Op = op;
		this.Data = data;
		List.get(0).NumberOfOp = op;
		List.get(0).NumberOfData = data;
		for(int i=1; i<List.size(); i++){
			Data += List.get(i).DataStAdded;
			Data -= List.get(i).DataStDeleted;
			Op += List.get(i).OpAdded;
			Op -= List.get(i).OpDeleted;
			List.get(i).NumberOfData = Data;
			List.get(i).NumberOfOp = Op;
		}
	}
}

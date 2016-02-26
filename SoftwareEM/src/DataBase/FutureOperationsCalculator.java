package DataBase;

import java.util.ArrayList;

public class FutureOperationsCalculator {
	int Estimate;
	int paronom;
	int S;
	
	public FutureOperationsCalculator(ArrayList<Version> List){
		int pl;
		List.get(0).FutureNumberOfOp = List.get(0).NumberOfOp;
		for(int i=0; i<List.size()-1; i++){	
			int sumE=0;
			pl=0;
			for(int j=0; j<=i; j++){
					int sumParonomasti = 0;
					for(int k=0; k<=j-1; k++){
						sumParonomasti+=1/((List.get(k).NumberOfOp)^2);
					}
					if(sumParonomasti!=0){
						sumE+=((List.get(j).NumberOfOp - List.get(0).NumberOfOp)/sumParonomasti);
					}
					pl++;
				}
				Estimate = sumE/pl;
				S = List.get(i).NumberOfOp + ((Estimate/(List.get(i).NumberOfOp)^2));
				List.get(i+1).FutureNumberOfOp = S;
			}
		}
}

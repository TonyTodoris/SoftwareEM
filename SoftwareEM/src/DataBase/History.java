package DataBase;

import java.util.ArrayList;

public class History {
	//First Law :Comments and check-box choice of user for this History,kept in database for display
		public String Law1Com ;
		public int Law1;
		//Second Law:Comments and check-box choice of user for this History,kept in database for display
		public String Law2Com;
		public int Law2;
		//Third Law:Comments and check-box choice of user for this History,kept in database for display
		public String Law3Com;
		public int Law3;
		//Fourth Law:Comments and check-box choice of user for this History,kept in database for display 
		public String Law4Com;
		public int Law4;
		//Fifth Law:Comments and check-box choice of user for this History,kept in database for display
		public String Law5Com;
		public int Law5;
		//Sixth Law:Comments and check-box choice of user for this History,kept in database for display
		public String Law6Com;
		public int Law6;
		//Seventh Law:Comments
		public String Law7Com;
		//Eighth Law:Comments and check-box choice of user for this History,kept in database for display
		public String Law8Com;
		public int Law8;
		//Final Report Comments
		public String Report;
		
		
		//History's Data:
	 	public int Operations;
		public int DataStructures ;
		public String Name ;
		public ArrayList<Version> VersionList = new ArrayList<Version>();
		public ArrayList<Integer> VersionYears = new ArrayList<Integer>();
		public ArrayList<Year> YearList = new ArrayList<Year>();
		
		
		public History(String file) {
			    FileParser h = new FileParser(file,this);
			    GrowthCalculator calc1 = new GrowthCalculator(VersionList,Operations,DataStructures);
			    WorkRateCalculator calc2 = new WorkRateCalculator(VersionList);
			    NumberOfOpDataCalculator calc3 = new NumberOfOpDataCalculator(VersionList,Operations,DataStructures);
			    FutureOperationsCalculator calc4 = new FutureOperationsCalculator(VersionList);
		}
}

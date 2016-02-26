package DataBase;


public class Version {
	public int ID; 
	public String Date;
	public int Day;
	public int Month;
	public int Year;
	public int OpAdded; 
	public int OpDeleted;
	public int OpUpdated;
	public int DataStAdded;
	public int DataStDeleted; 
	public int DataStUpdated;
	public int Opchanges;
	public int Datachanges;
	public double Opcomplexity=0;
	public double Datacomplexity=0;
	public double numberOfactions;
	public int OpGrowth=0;
	public int DataGrowth=0;
	public double OpWorkRate=0;
	public double DataWorkRate=0;
	public int NumberOfOp=0;
	public int NumberOfData=0;
	public int FutureNumberOfOp=0;
	
	
	private String[] colums;
	
	public Version(int id,String date,int opAdd,int opDel,int opUpd,int dataAdd,int dataDel,int dataUpd){
		this.ID = id;
		this.Date = date;
		this.OpAdded = opAdd;
		this.OpDeleted = opDel;
		this.OpUpdated = opUpd;
		this.DataStAdded = dataAdd;
		this.DataStDeleted = dataDel;
		this.DataStUpdated = dataUpd;
		
		colums=Date.split("/");
		this.Day = Integer.parseInt(colums[0]);
		this.Month = Integer.parseInt(colums[1]);
		this.Year = Integer.parseInt(colums[2]);
		
		
		
		
		Opchanges = OpAdded + OpDeleted + OpUpdated;
		Datachanges = DataStAdded + DataStDeleted + DataStUpdated;
		
		if(OpAdded!=0){
			Opcomplexity = (OpDeleted + OpUpdated) / OpAdded;
		}
		
		if(DataStAdded!=0){
			Datacomplexity = (DataStDeleted + DataStUpdated) / DataStAdded;
		}
		
		numberOfactions = (OpDeleted + OpUpdated) + (DataStDeleted + DataStUpdated);
		
	}
	
	
}

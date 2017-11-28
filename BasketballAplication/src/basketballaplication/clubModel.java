
package basketballaplication;


public class clubModel {
    
   private String clubID;
   private String clubName;
   private String clubYearlyProfit;
   private String clubYearlySalary;

  public clubModel()
  {
      
  }
   
   public clubModel(String clubID, String clubName, String clubYearlyProfit, String clubYearlySalary) {
        this.clubID = clubID;
        this.clubName = clubName;
        this.clubYearlyProfit = clubYearlyProfit;
        this.clubYearlySalary = clubYearlySalary;
    }

   public String[] objectToArrayB()
    {    
        String[] temparary = new String[4];
        
        temparary[0]=this.clubID;
        temparary[1]=this.clubName;
        temparary[2]=this.clubYearlyProfit;
        temparary[3]=this.clubYearlySalary;
        
        return temparary;
    
    } 

   
    public String getClubID() {
        return clubID;
    }

    public void setClubID(String clubID) {
        this.clubID = clubID;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubYearlyProfit() {
        return clubYearlyProfit;
    }

    public void setClubYearlyProfit(String clubYearlyProfit) {
        this.clubYearlyProfit = clubYearlyProfit;
    }

    public String getClubYearlySalary() {
        return clubYearlySalary;
    }

    public void setClubYearlySalary(String clubYearlySalary) {
        this.clubYearlySalary = clubYearlySalary;
    }

   
   
    
}

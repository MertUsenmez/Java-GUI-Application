
package basketballaplication;


public class coachesModel extends personModel implements bonusReceiver {
    
    private String playingStyle;
    private double coachesBonus;
    private double coachesCommision;

    
    public coachesModel()
    {
        super();
    }
    
    public coachesModel( String personClub, String personID, String personName, String phoneNumber, String personAdress, String personYearlySalary, String personHireDate, String playingStyle) 
    {
        super(personClub, personID, personName, phoneNumber, personAdress, personYearlySalary, personHireDate);
        this.playingStyle = playingStyle;
        //this.coachesBonus=coachesBonus;
        //this.coachesCommision=coachesCommision;
    }
    
     public String[] objectToArrayC()
    {    
        String[] temparary = new String[10];
        temparary[0]=this.getPersonClub();
        temparary[1]=this.getPersonID();
        temparary[2]=this.getPersonName();
        temparary[3]=this.getPhoneNumber();
        temparary[4]=this.getPersonAdress();
        temparary[5]=this.getPersonYearlySalary();
        temparary[6]=this.getPersonHireDate();
        temparary[7]=this.playingStyle;
        
        
        return temparary;
    
    } 

    public String getPlayingStyle() {
        return playingStyle;
    }

    public void setPlayingStyle(String playingStyle) {
        this.playingStyle = playingStyle;
    }

    public double getCoachesBonus() {
        return coachesBonus;
    }

    public void setCoachesBonus(double coachesBonus) {
        this.coachesBonus = coachesBonus;
    }

    public double getCoachesCommision() {
        return coachesCommision;
    }

    public void setCoachesCommision(double coachesCommision) {
        this.coachesCommision = coachesCommision;
    }
    
    

    
     
    public void bonusRecurve()
     {
         double bonusC = 0;
         
         if(Integer.parseInt(getPersonHireDate()) >= 3  &&  Integer.parseInt(getPersonHireDate()) < 6)
         {
             bonusC = Integer.parseInt(getPersonYearlySalary())*0.06;
         }
         if(Integer.parseInt(getPersonHireDate()) >= 6  &&  Integer.parseInt(getPersonHireDate()) <= 9)
         {
             bonusC = Integer.parseInt(getPersonYearlySalary())*0.12;
         }
         if(Integer.parseInt(getPersonHireDate()) > 9 && Integer.parseInt(getPersonHireDate()) <= 12)
         {
             bonusC = Integer.parseInt(getPersonYearlySalary())*0.18;
         }
         setCoachesBonus(bonusC);
     }
    
   
    clubModel cm = new clubModel();
   
     public void commissionMethodC()
     {
         double commisionValueC;
         double a;  
         
      commisionValueC = Double.parseDouble(cm.getClubYearlyProfit())*0.06;
       
       setCoachesCommision(commisionValueC);
       
       a = getCoachesCommision() + Double.parseDouble(cm.getClubYearlySalary());
       
          cm.setClubYearlySalary((String.valueOf(a)));
     }
}

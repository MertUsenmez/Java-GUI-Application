
package basketballaplication;


public class playersModel extends personModel implements bonusReceiver {
    
    private String shirtNumber;
    private String position;
    private double playerCommision;
    private double playerBonus;
    
    
    public playersModel()
    {
        super();
    }
    
    
    public playersModel( String personClub, String personID, String personName, String phoneNumber, String personAdress, String personYearlySalary,
              String personHireDate, String shirtNumber, String position) 
    { 
        super(personClub, personID, personName, phoneNumber, personAdress, personYearlySalary, personHireDate);
        this.shirtNumber = shirtNumber;
        this.position = position;
       
    }


    public String[] objectToArrayP()
    {    
        String[] temparary = new String[11];
        
        temparary[0]=this.getPersonClub();
        temparary[1]=this.getPersonID();
        temparary[2]=this.getPersonName();
        temparary[3]=this.getPhoneNumber();
        temparary[4]=this.getPersonAdress();
        temparary[5]=this.getPersonYearlySalary();
        temparary[6]=this.getPersonHireDate();
        temparary[7]=this.shirtNumber;
        temparary[8]=this.position;
       
        return temparary;
    
    } 
    
    
    public String getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(String shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public double getPlayerCommision(){
        return playerCommision;
    }
    
    public void setPlayerCommision(double playerCommision){
        this.playerCommision=playerCommision;
    }

    public double getPlayerBonus() {
        return playerBonus;
    }

    public void setPlayerBonus(double playerBonus) {
        this.playerBonus = playerBonus;
    }
    
    

    
    
     
    public void bonusRecurve()
     {
         double playerBonus = 0;
         
         if(Integer.parseInt(getPersonHireDate()) >= 5  && Integer.parseInt(getPersonHireDate()) < 10)
         {
            playerBonus = Integer.parseInt(getPersonYearlySalary())*0.05;
         }
         if(Integer.parseInt(getPersonHireDate()) >= 10  &&  Integer.parseInt(getPersonHireDate()) < 15)
         {
            playerBonus = Integer.parseInt(getPersonYearlySalary())*0.05;
         }
         
         setPlayerBonus(playerBonus);  
     }
     
     
     
    
    clubModel cm = new clubModel();  //obje clubModel den.
   
    
    
    public void commissionMethodP()
     {
       double commisionValue;
       double a;  
      commisionValue = Double.parseDouble(cm.getClubYearlyProfit())*0.06;
       
       setPlayerCommision(commisionValue);
       
       a = getPlayerCommision() + Double.parseDouble(cm.getClubYearlySalary());
       
          cm.setClubYearlySalary((String.valueOf(a)));
     }

}

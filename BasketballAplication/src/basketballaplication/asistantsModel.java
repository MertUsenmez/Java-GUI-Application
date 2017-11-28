
package basketballaplication;


public class asistantsModel extends personModel implements bonusReceiver{
    
    private String title;
    private double assistantBonus;
    private double asistantCommisyon;

   
    
    
    public asistantsModel()
    {
     super();
    }
    

    public asistantsModel(String personClub, String personID, String personName, String phoneNumber, String personAdress, String personYearlySalary, String personHireDate, String title) 
    {
        super(personClub, personID, personName, phoneNumber, personAdress, personYearlySalary, personHireDate);
        this.title = title;
       
    }
    
  
    public String[] objectToArrayA()
    {    
        String[] temparary = new String[9];
        
        temparary[0]=this.getPersonClub();
        temparary[1]=this.getPersonID();
        temparary[2]=this.getPersonName();
        temparary[3]=this.getPhoneNumber();
        temparary[4]=this.getPersonAdress();
        temparary[5]=this.getPersonYearlySalary();
        temparary[6]=this.getPersonHireDate();
        temparary[7]=this.title;
        
        
        return temparary;
    
    } 

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAssistantBonus() {
        return assistantBonus;
    }

    public void setAssistantBonus(double assistantBonus) {
        this.assistantBonus = assistantBonus;
    }

    public double getAsistantCommisyon() {
        return asistantCommisyon;
    }

    public void setAsistantCommisyon(double asistantCommisyon) {
        this.asistantCommisyon = asistantCommisyon;
    }
    
    

   
   
    
    public void bonusRecurve()
     {
         double bonusA = 0;
         double a;
         
         if(Integer.parseInt(getPersonHireDate()) >= 5  &&  Integer.parseInt(getPersonHireDate()) < 10)
         {
             bonusA = Integer.parseInt(getPersonYearlySalary())*0.05;
         }
         if(Integer.parseInt(getPersonHireDate()) >= 10  &&  Integer.parseInt(getPersonHireDate()) < 15)
         {
             bonusA = Integer.parseInt(getPersonYearlySalary())*0.10;
         }
         if(Integer.parseInt(getPersonHireDate()) >= 15 && Integer.parseInt(getPersonHireDate()) < 20)
         {
             bonusA = Integer.parseInt(getPersonYearlySalary())*0.15;
         }
         
         setAssistantBonus(bonusA);
        
         a = getAssistantBonus() + Double.parseDouble(cm.getClubYearlySalary());
       
         cm.setClubYearlySalary(String.valueOf(a));
     }
    
      
     clubModel cm = new clubModel();
   
     public void commissionMethodA()
     {
         double commisionValueA;
         double a;  
         
      commisionValueA = Double.parseDouble(cm.getClubYearlyProfit())*0.06;
       
       setAsistantCommisyon(commisionValueA);
       
       a = getAsistantCommisyon() + Double.parseDouble(cm.getClubYearlySalary());
       
          cm.setClubYearlySalary((String.valueOf(a)));
     }

  
}

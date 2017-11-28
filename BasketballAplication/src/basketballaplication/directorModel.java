
package basketballaplication;


public class directorModel extends personModel {

    
    public directorModel()
    {
        super();
    }
    
    
    public directorModel(String personClub, String personID, String personName, String phoneNumber, String personAdress, String personYearlySalary, String personHireDate)
    {
        super(personClub, personID, personName, phoneNumber, personAdress, personYearlySalary, personHireDate);
    }
    
     public String[] objectToArrayM()
    {    
        String[] temparary = new String[7];
        
        temparary[0]=this.getPersonClub();
        temparary[1]=this.getPersonID();
        temparary[2]=this.getPersonName();
        temparary[3]=this.getPhoneNumber();
        temparary[4]=this.getPersonAdress();
        temparary[5]=this.getPersonYearlySalary();
        temparary[6]=this.getPersonHireDate();
        

        return temparary;
    } 

    
    
}


package basketballaplication;


public class personModel {
    
    private String personClub;
    private String personID;
    private String personName;
    private String phoneNumber;
    private String personAdress;
    private String personYearlySalary;
    private String personHireDate;

   
    public personModel()
    {
        
    }
    
    public personModel(String personClub, String personID, String personName, String phoneNumber, String personAdress, String personYearlySalary, String personHireDate) {
        this.personClub=personClub;
        this.personID = personID;
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.personAdress = personAdress;
        this.personYearlySalary = personYearlySalary;
        this.personHireDate = personHireDate;
    }

  
    public String getPersonClub() {
        return personClub;
    }

    public void setPersonClub(String personClub) {
        this.personClub = personClub;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPersonAdress() {
        return personAdress;
    }

    public void setPersonAdress(String personAdress) {
        this.personAdress = personAdress;
    }

    public String getPersonYearlySalary() {
        return personYearlySalary;
    }

    public void setPersonYearlySalary(String personYearlySalary) {
        this.personYearlySalary = personYearlySalary;
    }

    public String getPersonHireDate() {
        return personHireDate;
    }

    public void setPersonHireDate(String personHireDate) {
        this.personHireDate = personHireDate;
    }
    
    
    
}

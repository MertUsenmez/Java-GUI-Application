
package basketballaplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class coachModelList {
    
    private ArrayList <coachesModel> listPersonC = new ArrayList();
    
    public coachModelList(){
    
        Scanner input = null;
        
        try{
            
            input = new Scanner(new File("Coaches.txt"));
            
            while(input.hasNext())
            {
                coachesModel record2 = new coachesModel(input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next());
                listPersonC.add(record2);
                input.nextLine();
            }
            
        }
        catch(FileNotFoundException ae)
        {
            ae.printStackTrace();
        }
        
    }
    
    public void saveFileCoach()
     {
         Formatter outputC = null;
         try
         {
             
             outputC = new Formatter("Coaches.txt");
             
         }
         catch(FileNotFoundException ea)
         {
             ea.printStackTrace();
         }
         
         for(coachesModel c : listPersonC)
         {
             Formatter format = outputC.format(" %s , %s , %s , %s , %s , %s , %s , %s \n",c.getPersonClub(),c.getPersonID(),c.getPersonName(),c.getPhoneNumber(),
                     c.getPersonAdress(),c.getPersonYearlySalary(),c.getPersonHireDate(),
                     c.getPlayingStyle());
         }
         
         if(outputC == null)
         {
             outputC.close();
         }
     }
    
    
    public void addCoach(coachesModel c) 
         {
             listPersonC.add(c);
             saveFileCoach();
         }
    
    
    
    public void updateCoach(coachesModel updC) throws FileNotFoundException
        {
            boolean find=false;
            
            for(int i=0; i<listPersonC.size(); i++)
            {
                if(listPersonC.get(i).getPersonID().equals(updC.getPersonID()))
                {
                    listPersonC.set(i, updC);
                    find = true;
                    break;
                }
                
            }
        if(find)
        {
            saveFileCoach();
        }
        }
    
   
    public void deleteCoach(String id) throws FileNotFoundException
        {
            for(int i=0; i<= listPersonC.size(); i++)
            {
                 coachesModel c = listPersonC.get(i);
                if(c.getPersonID().equals(id))
                {
                    listPersonC.remove(c);
                    break;
                }
            }
            saveFileCoach();
        }
    
    
     public ArrayList<coachesModel> getListPersonC(){
        return listPersonC;
    }
     
}



package basketballaplication;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class directorModelList {
    
    private ArrayList <directorModel> listPersonD = new ArrayList();
    
    
    directorModelList()
    {
        Scanner input=null;
       
        try{
        
           input = new Scanner(new File("Members.txt"));
            
              
            while(input.hasNext())
            {
                directorModel record4 = new directorModel(input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next());
                listPersonD.add(record4);
                input.nextLine();
            }
            
        }
        catch(FileNotFoundException ae)
        {
            ae.printStackTrace();
        }
       
        }
     
    public void saveFileMember() 
        {
            Formatter outputP = null;
            try
            {
                outputP = new Formatter("Directors.txt");
           
            }
            catch(FileNotFoundException oe)
            {
                oe.printStackTrace();
            }
             for(directorModel p : listPersonD)
                {
                Formatter format = outputP.format(" %s , %s , %s , %s , %s , %s ,%s \n",p.getPersonClub(),p.getPersonID(),p.getPersonName(),p.getPhoneNumber(),
                        p.getPersonAdress(),p.getPersonYearlySalary(),p.getPersonHireDate());
                }
  
            if(outputP == null)
            {
                outputP.close();
            }
        }
    
     public void addMember(directorModel m) 
         {
             listPersonD.add(m);
             saveFileMember();
         }
     
      public void updateMember(directorModel updD) throws FileNotFoundException
        {
            boolean find=false;
            
            for(int i=0; i<listPersonD.size(); i++)
            {
                if(listPersonD.get(i).getPersonID().equals(updD.getPersonID()))
                {
                    listPersonD.set(i, updD);
                    find = true;
                    break;
                }
                
            }
        if(find)
        {
            saveFileMember();
        }
        }
      
       public void deleteMember(String id) throws FileNotFoundException
        {
            for(int i=0; i<= listPersonD.size(); i++)
            {
                directorModel m = listPersonD.get(i);
                if(m.getPersonID().equals(id))
                {
                    listPersonD.remove(m);
                    break;
                }
            }
            saveFileMember();
        }
       
       public ArrayList<directorModel> getListPersonM(){
        return listPersonD;
    }
    
    }


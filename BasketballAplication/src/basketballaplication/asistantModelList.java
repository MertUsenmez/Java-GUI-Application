
package basketballaplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class asistantModelList {
    
    private ArrayList <asistantsModel> listPersonA = new ArrayList();
   
    public asistantModelList()
    {
    Scanner input=null;
    
        try {
            input = new Scanner(new File("Asistants.txt"));
            
             while(input.hasNext())
            {
                asistantsModel record3 = new asistantsModel(input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next());
                listPersonA.add(record3);
                input.nextLine();
            }
             
        } 
        
       catch (FileNotFoundException ex) {
            Logger.getLogger(asistantModelList.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    } 
      public void saveFileAsistant()  
      {
         Formatter outputA = null;
         
         try
         {
             
             outputA = new Formatter("Asistants.txt");
             
         }
         catch(FileNotFoundException ea)
         {
             ea.printStackTrace();
         }
         
         for(asistantsModel a : listPersonA)
         {
             Formatter format = outputA.format(" %s , %s , %s , %s , %s , %s , %s , %s \n",a.getPersonClub(),a.getPersonID(),a.getPersonName(),a.getPhoneNumber(),a.getPersonAdress()
                     ,a.getPersonYearlySalary(),a.getPersonHireDate(),a.getTitle());
         }
         
         if(outputA == null)
         {
             outputA.close();
         }
     } 
     
      public void addAsistant(asistantsModel a) 
         {
             listPersonA.add(a);
             saveFileAsistant();
         }
      
       public void updateAsistant(asistantsModel updA) throws FileNotFoundException
        {
            boolean find=false;
            
            for(int i=0; i<listPersonA.size(); i++)
            {
                if(listPersonA.get(i).getPersonID().equals(updA.getPersonID()))
                {
                    listPersonA.set(i, updA);
                    find = true;
                    break;
                }
                
            }
        if(find)
        {
            saveFileAsistant();
        }
        }
     
    public void deleteAsistant(String id) throws FileNotFoundException
        {
            for(int i=0; i<= listPersonA.size(); i++)
            {
                asistantsModel a = listPersonA.get(i);
                if(a.getPersonID().equals(id))
                {
                    listPersonA.remove(a);
                    break;
                }
            }
            saveFileAsistant();
        }

 
    public ArrayList<asistantsModel> getListPersonA()
    {
        return listPersonA;
    }
     
 }
    
    
    
   
       
       



            
         
         
    

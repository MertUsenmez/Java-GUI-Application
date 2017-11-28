
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

public class playerModelList {
   
    private ArrayList <playersModel> listPersonP = new ArrayList();
    
   
    public playerModelList()
    {
        
         Scanner input=null;
  
             try {
                 input = new Scanner(new File("Players.txt"));
                 
                  while(input.hasNext())
               {
                playersModel record1 = new playersModel(input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),
                input.next());
                listPersonP.add(record1);
                input.nextLine(); 
               }
             } 
             catch (FileNotFoundException ex) {
                 ex.printStackTrace();
             }
           }
     
       public void saveFilePlayer() 
        
        {
            Formatter outputP = null;
            try
            {
                outputP = new Formatter("Players.txt");
           
            }
            catch(FileNotFoundException oe)
            {
                oe.printStackTrace();
            }
             for(playersModel p : listPersonP)
                {
                Formatter format = outputP.format(" %s , %s , %s , %s , %s , %s ,%s , %s , %s \n",p.getPersonClub(),p.getPersonID(),p.getPersonName(),p.getPhoneNumber(),
                        p.getPersonAdress(),p.getPersonYearlySalary(),p.getPersonHireDate(),p.getShirtNumber(),
                        p.getPosition());
                }
  
            if(outputP == null)
            {
                outputP.close();
            }
        }
             
         
       
       public void addPlayer(playersModel p) 
        {
            listPersonP.add(p);
            saveFilePlayer();
        }
       
       
       public void updatePlayer(playersModel updP) throws FileNotFoundException
        {
            boolean find=false;
            
            for(int i=0; i<listPersonP.size(); i++)
            {
                if(listPersonP.get(i).getPersonID().equals(updP.getPersonID()))
                {
                    listPersonP.set(i, updP);
                    find = true;
                    break;
                }
                
            }
        if(find)
        {
            saveFilePlayer();
        }
        }
       
        public void deletePlayer(String id) throws FileNotFoundException
        {
            for(int i=0; i<= listPersonP.size(); i++)
            {
                playersModel p = listPersonP.get(i);
                if(p.getPersonID().equals(id))
                {
                    listPersonP.remove(p);
                    break;
                }
            }
            saveFilePlayer();
        }
        
         
        public ArrayList<playersModel> getListPersonP()
         
         {
           return listPersonP;
         }
            
    }
  


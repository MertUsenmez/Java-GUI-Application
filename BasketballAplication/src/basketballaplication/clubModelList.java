
package basketballaplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class clubModelList {
    
    private ArrayList <clubModel> listClub = new ArrayList();
    
    public clubModelList(){
        
        Scanner input=null;
        try{
            input = new Scanner(new File("Clubs.txt"));
            
            while(input.hasNext())
            {
                clubModel record = new clubModel(input.next(),input.next(),input.next(),input.next());
                listClub.add(record);
                input.nextLine();
            }
        }
        catch(FileNotFoundException ae)
        {
            ae.printStackTrace();
        }
        catch(NoSuchElementException ea)
        {
            ea.printStackTrace();
        }
    
    }
    
      public void saveFileClub() 
        {
            Formatter output = null;
            try
            {
                output = new Formatter("Clubs.txt");
           
            }
            catch(FileNotFoundException oe)
            {
                oe.printStackTrace();
            }
             for(clubModel c : listClub)
                {
                Formatter format = output.format("%s , %s , %s , %s \n",c.getClubID(),c.getClubName(),c.getClubYearlyProfit(),c.getClubYearlySalary());
                }
  
            if(output == null)
            {
                output.close();
            }
        }
      
       public void addTeam(clubModel a) throws FileNotFoundException
        {
            listClub.add(a);
            // saveFileClub();
        }
       
        public void update(clubModel update) throws FileNotFoundException
        {
            boolean find=false;
            
            for(int i=0; i<listClub.size(); i++)
            {
                if(listClub.get(i).getClubID().equals(update.getClubID()))
                {
                    listClub.set(i, update);
                    find = true;
                    break;
                }
                
            }
        if(find)
        {
           saveFileClub();
        }
        }
        
         public void delete(String id) throws FileNotFoundException
        {
            for(int i=0; i<= listClub.size(); i++)
            {
                clubModel c = listClub.get(i);
                if(c.getClubID().equals(id))
                {
                    listClub.remove(c);
                    break;
                }
            }
           saveFileClub();
        }
         
          public ArrayList<clubModel> getClubList(){
         
              return listClub;
    }
}

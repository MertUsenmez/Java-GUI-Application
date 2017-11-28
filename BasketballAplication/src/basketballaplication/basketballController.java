
package basketballaplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.DefaultComboBoxModel;

public class basketballController {
    
    introView      theIntroView;
    teamView       theTeamView;
    peopleView     thePeopleView;
    
    
    clubModel     theClubModel;
    personModel   thePersonModel;
    playersModel  thePlayersModel;
    asistantsModel theAsistantsModel;
    coachesModel  theCoachesModel;
    directorModel   theMemberModel;
    clubModelList  theClubModelList;
    playerModelList thePlayerModelList;
    asistantModelList theAsistantModelList;
    coachModelList theCoachModelList;
    directorModelList theDirectorModelList;
    
    
     public void combobox()   //Çalışmıyor Hocam.
     {
         DefaultComboBoxModel cb = (DefaultComboBoxModel) theTeamView.getComboBoxClub();
        // cb.getSelectedItem();
         
         for(int i = 0; i < theClubModelList.getClubList().size(); i++)
         {
           cb.addElement(theClubModelList.getClubList().get(i).getClubName());
         }
         
     }
    
     public void refleshB()
    {
        DefaultTableModel cl =(DefaultTableModel) theTeamView.getTblListT();
        cl.setRowCount(0);
        
        for (int i = 0; i < theClubModelList.getClubList().size(); i++) {
                         cl.addRow(theClubModelList.getClubList().get(i).objectToArrayB());
                    }
    }
     
     public void refleshP()
     {
 
        DefaultTableModel p = (DefaultTableModel) thePeopleView.getTblListP();
        p.setRowCount(0);
        
        for (int i = 0; i < thePlayerModelList.getListPersonP().size(); i++) {
                         p.addRow(thePlayerModelList.getListPersonP().get(i).objectToArrayP());
                    }
     }
        public void refleshC()
        {
            DefaultTableModel c = (DefaultTableModel) thePeopleView.getTblListC();
            c.setRowCount(0);
            
        for (int i = 0; i < theCoachModelList.getListPersonC().size(); i++) {
                         c.addRow(theCoachModelList.getListPersonC().get(i).objectToArrayC());
                    }
     }
        
        public void refleshA()
        {
          DefaultTableModel a = (DefaultTableModel) thePeopleView.getTblListA();
          a.setRowCount(0);
         
         for (int i = 0; i < theAsistantModelList.getListPersonA().size(); i++) {
            
                         a.addRow(theAsistantModelList.getListPersonA().get(i).objectToArrayA());
                    }
        }
        
        public void refleshM()
        {
            DefaultTableModel m = (DefaultTableModel) thePeopleView.getTblListM();
            m.setRowCount(0);
        
        for (int i = 0; i < theDirectorModelList.getListPersonM().size(); i++) {
                         m.addRow(theDirectorModelList.getListPersonM().get(i).objectToArrayM());
                    }
        
    }

     public basketballController(introView theIntroView, teamView theTeamView, peopleView thePeopleView, clubModel theClubModel, personModel thePersonModel, playersModel thePlayersModel, 
         asistantsModel theAsistantsModel, coachesModel  theCoachesModel, clubModelList  theClubModelList, playerModelList thePlayerModelList, 
         asistantModelList theAsistantModelList, coachModelList theCoachModelList, directorModelList theDirectorModelList, directorModel theMemberModel)
     {
         
         this.theIntroView = theIntroView;
         this.theTeamView = theTeamView;
         this.thePeopleView = thePeopleView;
         this.theClubModel = theClubModel;
         this.thePersonModel =thePersonModel;
         this.thePlayersModel = thePlayersModel;
         this.theAsistantsModel = theAsistantsModel;
         this.theCoachesModel = theCoachesModel;
         this.theMemberModel = theMemberModel;
         this.theClubModelList = theClubModelList;
         this.thePlayerModelList = thePlayerModelList;
         this.theAsistantModelList = theAsistantModelList;
         this.theCoachModelList = theCoachModelList;
         this.theDirectorModelList = theDirectorModelList;
         
         refleshB();
         refleshP();
         
           
         
         
         
         this.theIntroView.btnTeamOpera(new ActionListener() {
           
            public void actionPerformed(ActionEvent ae) {
                
              
                
                theTeamView.setVisible(true);
                
            }
        }
        );
         
         this.theIntroView.btnPersonOpera(new ActionListener() {
           
            public void actionPerformed(ActionEvent ae) {
                
             
                thePeopleView.setVisible(true);
                
            }
        }
        );
         
         
   
         
         
        this.theTeamView.btnAddTeam(new ActionListener() {
           
            public void actionPerformed(ActionEvent ae) {
                
                clubModel temp1 = new clubModel(theTeamView.getIDT(), theTeamView.getNameT(), theTeamView.getProfitT(), theTeamView.getSalaryT());
                
                try {
                    theClubModelList.addTeam(temp1);
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(basketballController.class.getName()).log(Level.SEVERE, null, ex);
                }
                refleshB();
                
               // thePeopleView.getComboBox1().addItem(theTeamView.getNameT());
            }
        }
        );
        
         this.theTeamView.btnUpdateTeam(new ActionListener(){
            
      
            public void actionPerformed(ActionEvent ae){
                
                clubModel temp2 = new clubModel(theTeamView.getIDT(), theTeamView.getNameT(), theTeamView.getProfitT(), theTeamView.getSalaryT());
                try {
                    theClubModelList.update(temp2);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(basketballController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                refleshB();
            }
        }    
    
        );
         
          this.theTeamView.btnDeleteTeam(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                       
                        try {
                            theClubModelList.delete(theTeamView.getIDT());
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(basketballController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     refleshB();
                    
                    }
                });
          
          

      
          //--------------------------- aşağıdakiler people için.
       
       
          
         this.thePeopleView.btnAddPlayer(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                playersModel temp3 = new playersModel(thePeopleView.getClubP(), thePeopleView.getIDP(), thePeopleView.getNameP(), thePeopleView.getPhoneP(), thePeopleView.getAdressP(),
                        thePeopleView.getYearlySalaryP(), thePeopleView.getHireDateP(), thePeopleView.getShirtNumberP(), thePeopleView.getPositionP());
                
                thePlayerModelList.addPlayer(temp3);
                refleshP();
            }
        }
        );
         
           
        this.thePeopleView.btnAddCoach(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                coachesModel temp4 = new coachesModel(thePeopleView.getClubC(), thePeopleView.getIDC(), thePeopleView.getNameC(), thePeopleView.getPhoneC(), thePeopleView.getAdressC(),
                thePeopleView.getYearlySalaryC(), thePeopleView.getHireDateC(), thePeopleView.getPlayingStyleC());
                
                theCoachModelList.addCoach(temp4);
                refleshC();
            }
        }
        );
        
           this.thePeopleView.btnAddAsistant(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                asistantsModel temp5 = new asistantsModel(thePeopleView.getClubA(), thePeopleView.getIDA(), thePeopleView.getNameA(), thePeopleView.getPhoneA(), thePeopleView.getAdressA(),
                thePeopleView.getYearlySalaryA(), thePeopleView.getHireDateA(), thePeopleView.getTitleA());
                
                theAsistantModelList.addAsistant(temp5);
                refleshA();
            }
        }
        );
           
           
           this.thePeopleView.btnAddMember(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                directorModel temp6 = new directorModel(thePeopleView.getClubM(), thePeopleView.getIDM(), thePeopleView.getNameM(), thePeopleView.getPhoneM(), thePeopleView.getAdressM(),
                thePeopleView.getYearlySalaryM(), thePeopleView.getHireDateM());
                
                theDirectorModelList.addMember(temp6);
                refleshM();
            }
        }
        );
       
           
            this.thePeopleView.btnUpdatePlayer(new ActionListener(){
            
      
            public void actionPerformed(ActionEvent ae){
                
                playersModel temp7 = new playersModel(thePeopleView.getClubP(), thePeopleView.getIDP(), thePeopleView.getNameP(), thePeopleView.getPhoneP(), thePeopleView.getAdressP(),
                thePeopleView.getYearlySalaryP(), thePeopleView.getHireDateP(), thePeopleView.getShirtNumberP(), thePeopleView.getPositionP());
                try {
                    thePlayerModelList.updatePlayer(temp7);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(basketballController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                refleshP();
            }
        }    
    
        );
            
             this.thePeopleView.btnUpdateCoach(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                coachesModel temp8 = new coachesModel(thePeopleView.getClubC(), thePeopleView.getIDC(), thePeopleView.getNameC(), thePeopleView.getPhoneC(), thePeopleView.getAdressC(),
                thePeopleView.getYearlySalaryC(), thePeopleView.getHireDateC(), thePeopleView.getPlayingStyleC());
                
                try {
                    theCoachModelList.updateCoach(temp8);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(basketballController.class.getName()).log(Level.SEVERE, null, ex);
                }
                refleshC();
            }
        }
        );
             
             
           this.thePeopleView.btnUpdateAsistant(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                asistantsModel temp9 = new asistantsModel(thePeopleView.getClubA(), thePeopleView.getIDA(), thePeopleView.getNameA(), thePeopleView.getPhoneA(), thePeopleView.getAdressA(),
                thePeopleView.getYearlySalaryA(), thePeopleView.getHireDateA(), thePeopleView.getTitleA());
                
                try {
                    theAsistantModelList.updateAsistant(temp9);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(basketballController.class.getName()).log(Level.SEVERE, null, ex);
                }
                refleshA();
            }
        }
        );
           
             
             
           this.thePeopleView.btnUpdateMember(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                directorModel temp10 = new directorModel(thePeopleView.getClubM(), thePeopleView.getIDM(), thePeopleView.getNameM(), thePeopleView.getPhoneM(), thePeopleView.getAdressM(),
                thePeopleView.getYearlySalaryM(), thePeopleView.getHireDateM());
                
                try {
                    theDirectorModelList.updateMember(temp10);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(basketballController.class.getName()).log(Level.SEVERE, null, ex);
                }
                refleshM();
            }
        }
           );
           
           
             this.thePeopleView.btnDeletePlayer(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                       
                        try {
                            thePlayerModelList.deletePlayer(thePeopleView.getIDP());
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(basketballController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     refleshP();
                    
                    }
                });
             
             
               this.thePeopleView.btnDeleteCoach(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                       
                        try {
                            theCoachModelList.deleteCoach(thePeopleView.getIDC());
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(basketballController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     refleshC();
                    
                    }
                });
               
                 this.thePeopleView.btnDeleteAsistant(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                       
                        try {
                            theAsistantModelList.deleteAsistant(thePeopleView.getIDA());
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(basketballController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     refleshA();
                    
                    }
                });
                 
                   this.thePeopleView.btnDeleteMember(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                       
                        try {
                            theDirectorModelList.deleteMember(thePeopleView.getIDM());
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(basketballController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     refleshM();
                    
                    }
                });
                   
        
     }
     
}

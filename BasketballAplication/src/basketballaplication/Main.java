
package basketballaplication;


public class Main {

    
    public static void main(String[] args) {
        
        asistantsModel asisMod = new asistantsModel();
        playersModel playMod = new playersModel();
        directorModel theDirectorModel = new directorModel();
        directorModelList memMod = new directorModelList();
        coachesModel coacMod = new coachesModel();
        clubModel clubMod = new clubModel();
        clubModelList clubModList = new clubModelList();
        personModel thePersonModel = new personModel();
        teamView theTeamView = new teamView();
        peopleView thePeopleView = new peopleView();
        introView theIntroView = new introView();
        playerModelList thePlayerModelList = new playerModelList();
        coachModelList theCoachModelList = new coachModelList();
        asistantModelList theAsistantModelList = new asistantModelList();
        
        
        basketballController theBasketballController = new basketballController(theIntroView, theTeamView, thePeopleView, clubMod, thePersonModel, playMod, asisMod, coacMod, clubModList,
        thePlayerModelList, theAsistantModelList, theCoachModelList, memMod, theDirectorModel);
     
        theIntroView.setVisible(true);
       
        
    }
    
}

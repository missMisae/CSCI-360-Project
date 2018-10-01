package Domain.Ballots;

import Application.VotingSystem.Main;
import javafx.fxml.FXML;

public class Ballot1Controller {

    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    public void handleContinueClick(){
        //show next ballot
         main.showFinalBallot();
    }

    @FXML
    public void handleCancelClick() {
        //go back to voter login
        main.showLogin();
        // log out voter
    }

    @FXML
    public void handleBackClick () {
        //go back to login screen
        main.showLogin();
        //log out voter
    }
}

package com.sda.trestian.travelagency.view;

import com.sda.trestian.travelagency.service.PersonDisplayService;
import javafx.application.Application;
import javafx.stage.Stage;

public class TravelAgencyMainView extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        PersonDisplayService personDisplayService = new PersonDisplayService();

        // NU FOLOSIM DAO AICI (in view)
    }
}

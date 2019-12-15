package com.sda.trestian.travelagency.view;

import com.sda.trestian.travelagency.model.Person;
import com.sda.trestian.travelagency.service.PersonDisplayService;
import com.sda.trestian.travelagency.validator.AddCarValidator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class TravelAgencyMainView extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        PersonDisplayService personDisplayService = new PersonDisplayService();
        ListView listView = new ListView();


//        if (StringUtils.isAlphanumeric("&(^^(*^")){
//            personDisplayService.save();
//        } else {
//            throw new InvalidInputException();
//        }

        Person parent = personDisplayService.getPerson(1);
        Person child = personDisplayService.getPerson(2);
        TreeItem<String> parentItem = new TreeItem<>(parent.getName());
        TreeItem<String> item = new TreeItem<>(child.getName());
        parentItem.getChildren().add(new TreeItem<>(child.getName()));
        parentItem.getChildren().add(new TreeItem<>("Fiu"));
        parentItem.getChildren().add(new TreeItem<>("Frate"));

        TreeView<String> treeView = new TreeView<>(parentItem);
        Scene scene = new Scene(treeView);

        TextField textField = new TextField();

        if (AddCarValidator.isInputValid(Arrays.asList(textField.getText()))){
            //save , service.getUser();
        } else {
            // show error
        }
        primaryStage.setScene(scene);
        primaryStage.show();
        // NU FOLOSIM DAO AICI (in view)
    }
}

package org.example.workshopjavafxjdbc;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class MainView implements Initializable {
    @FXML
    private MenuItem menuItemSeller;
    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private  MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSellerAction() {
        System.out.println("Printou seller");
    }

    @FXML
    public void onMenuItemDepartmentAction() {

    }

    @FXML
    public void onMenuItemAboutAction() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

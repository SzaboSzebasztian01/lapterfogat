/*
 * File:.MainController.java
 * Author:Szabó Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-04-04
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

package controllers;

import javafx.scene.control.Button;
import models.MainModel;
import views.MainPanel;

public class MainController {
    MainPanel mainPanel;
    MainModel mainModel;

    public MainController() {
        this.mainPanel = new MainPanel();
        this.mainModel = new MainModel();
        this.handleEvent();
    }

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    private void handleEvent(){
        Button calcButton = this.mainPanel.getButtonPanel().getCalcButton();

        calcButton.setOnAction( e -> onClickCalcButton() );
    }

    private void onClickCalcButton(){
        String diagonalStr = this.mainPanel.getDiagonalPanel().getValue();
        double diagonal = Double.parseDouble(diagonalStr);
        Double volume = mainModel.calcVolume(diagonal);
        String volumeStr = volume.toString();
        
        this.mainPanel.getVolumePanel().setValue(volumeStr);
    }
}

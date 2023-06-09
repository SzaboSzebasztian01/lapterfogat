/*
 * File:.MainPanel.java
 * Author:Szabó Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-04-04
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

package views;

import com.github.SzaboSzebasztian1.inputlib.ButtonPanel;
import com.github.SzaboSzebasztian1.inputlib.InputPanel;
import com.github.SzaboSzebasztian1.inputlib.TitlePanel;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainPanel extends VBox{
    TitlePanel titlePanel;
    InputPanel diagonalPanel;
    ButtonPanel buttonPanel;
    InputPanel volumePanel;
    Label aboutLabel;

    public MainPanel() {
        this.initComponent();
        this.addComponent();
        this.setMainPanel();
        this.setComponent();

    }

    private void initComponent(){
        this.titlePanel = new TitlePanel();
        this.diagonalPanel = new InputPanel();
        this.buttonPanel = new ButtonPanel();
        this.volumePanel = new InputPanel();
        this.aboutLabel = new Label();

    }

    private void setComponent(){
        this.titlePanel.setText("Kocka térfogatszámítás");
        this.diagonalPanel.setText("Lapátló: ");
        this.buttonPanel.setCalcButtonText("Számít");
        this.volumePanel.setText("Térfogat: ");
        this.aboutLabel.setText("Szabó Szebasztián, Szoft I-1-N, 2023-04-03");

    }
    
    private void addComponent(){
        this.getChildren().add(this.titlePanel);
        this.getChildren().add(this.diagonalPanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.volumePanel);
        this.getChildren().add(this.aboutLabel);

    }

    private void setMainPanel(){
        this.setAlignment(Pos.CENTER);

    }
    
    public InputPanel getDiagonalPanel() {
        return diagonalPanel;

    }
    
    public ButtonPanel getButtonPanel() {
        return buttonPanel;

    }

    public InputPanel getVolumePanel() {
        return volumePanel;

    }
    
}

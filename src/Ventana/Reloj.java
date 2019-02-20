/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Darnex
 */
public class Reloj extends Application{
    int x;
    int y;
    
    @Override
    public void start(Stage stage) {
        stage.setTitle("Reloj de Botones");
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        this.x = pantalla.width/2;
        this.y = pantalla.height/2;
        
        PaneOrganizer pane = new PaneOrganizer(x, y);
        
        Scene sc = new Scene(pane.getRoot(),x,y);
        stage.setScene(sc);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
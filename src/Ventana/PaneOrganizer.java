/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.util.Date;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Font;
import javafx.util.Duration;
/**
 *
 * @author Darnex
 */
public class PaneOrganizer {
    private AnchorPane root = new AnchorPane();
    private Label b1;
    private Label b2;
    private Label b3;
    private Label b4;
    private Label b5;
    private Label b6;
    private Label fecha;
    private AudioClip sonido;
    
    public PaneOrganizer(int x, int y){

        //sonido = Applet.newAudioClip(getClass().getResource("sonido.wav"));
        sonido = new AudioClip(getClass().getResource("sonido.wav").toString());
        System.out.println(getClass().getResource("sonido.wav").toString());
        
        Font letra = new Font("Arial Black", x/20);
        String estilo = "-fx-border-color: black; -fx-border-width: 0; -fx-background-color: #202220; -fx-text-fill: #00ff00";
        
        Date calendario = new Date();
        String hora1 = (String)calendario.toString().subSequence(11, 12);
        String hora2 = (String)calendario.toString().subSequence(12, 13);
        String min1 = (String)calendario.toString().subSequence(14, 15);
        String min2 = (String)calendario.toString().subSequence(15, 16);
        String sec1 = (String)calendario.toString().subSequence(17, 18);
        String sec2 = (String)calendario.toString().subSequence(18, 19);
        String dia = (String)calendario.toString().subSequence(0, 3)+" "
                    +(String)calendario.toString().subSequence(8, 10)+" "
                    +(String)calendario.toString().subSequence(4, 7)+" "
                    +(String)calendario.toString().subSequence(24, 28);
        
        b1 = new Label(hora1);
        b2 = new Label(hora2);
        b3 = new Label(min1);
        b4 = new Label(min2);
        b5 = new Label(sec1);
        b6 = new Label(sec2);
        fecha = new Label(dia);
        
        Label  tx1 = new Label(":");
        Label  tx2 = new Label(":");
        
        b1.setFont(letra);
        b1.setAlignment(Pos.CENTER);
        b1.setStyle(estilo);///
        b2.setFont(letra);
        b2.setAlignment(Pos.CENTER);
        b2.setStyle(estilo);
        b3.setFont(letra);
        b3.setAlignment(Pos.CENTER);
        b3.setStyle(estilo);
        b4.setFont(letra);
        b4.setAlignment(Pos.CENTER);
        b4.setStyle(estilo);
        b5.setFont(letra);
        b5.setAlignment(Pos.CENTER);
        b5.setStyle(estilo);
        b6.setFont(letra);
        b6.setAlignment(Pos.CENTER);
        b6.setStyle(estilo);
        fecha.setFont(letra);
        fecha.setAlignment(Pos.CENTER);
        fecha.setStyle("-fx-text-fill: #202220");
        tx1.setFont(letra);
        tx1.setAlignment(Pos.CENTER);
        tx2.setFont(letra);
        tx2.setAlignment(Pos.CENTER);
        
        root = new AnchorPane(b1,b2,b3,b4,b5,b6,tx1,tx2,fecha);
        root.setStyle("-fx-background-color: #78877a");
        
        AnchorPane.setTopAnchor (b1, 2*(double)(y)/6);
        AnchorPane.setLeftAnchor (b1, (double)(x)/10);
        AnchorPane.setRightAnchor (b1, 8*(double)(x)/10-1);
        AnchorPane.setBottomAnchor (b1, 3*(double)(y)/6);
        
        AnchorPane.setTopAnchor (b2, 2*(double)(y)/6);
        AnchorPane.setLeftAnchor (b2, 2*(double)(x)/10);
        AnchorPane.setRightAnchor (b2, 7*(double)(x)/10);
        AnchorPane.setBottomAnchor (b2, 3*(double)(y)/6);
        
        AnchorPane.setTopAnchor (tx1, 2*(double)(y)/6);
        AnchorPane.setLeftAnchor (tx1, 3*(double)(x)/10);
        AnchorPane.setRightAnchor (tx1, 6*(double)(x)/10);
        AnchorPane.setBottomAnchor (tx1, 3*(double)(y)/6);
        
        AnchorPane.setTopAnchor (b3, 2*(double)(y)/6);
        AnchorPane.setLeftAnchor (b3, 4*(double)(x)/10);
        AnchorPane.setRightAnchor (b3, 5*(double)(x)/10-1);
        AnchorPane.setBottomAnchor (b3, 3*(double)(y)/6);
        
        AnchorPane.setTopAnchor (b4, 2*(double)(y)/6);
        AnchorPane.setLeftAnchor (b4, 5*(double)(x)/10);
        AnchorPane.setRightAnchor (b4, 4*(double)(x)/10);
        AnchorPane.setBottomAnchor (b4, 3*(double)(y)/6);
        
        AnchorPane.setTopAnchor (tx2, 2*(double)(y)/6);
        AnchorPane.setLeftAnchor (tx2, 6*(double)(x)/10);
        AnchorPane.setRightAnchor (tx2, 3*(double)(x)/10);
        AnchorPane.setBottomAnchor (tx2, 3*(double)(y)/6);
        
        AnchorPane.setTopAnchor (b5, 2*(double)(y)/6);
        AnchorPane.setLeftAnchor (b5, 7*(double)(x)/10);
        AnchorPane.setRightAnchor (b5, 2*(double)(x)/10-1);
        AnchorPane.setBottomAnchor (b5, 3*(double)(y)/6);
        
        AnchorPane.setTopAnchor (b6, 2*(double)(y)/6);
        AnchorPane.setLeftAnchor (b6, 8*(double)(x)/10);
        AnchorPane.setRightAnchor (b6, (double)(x)/10);
        AnchorPane.setBottomAnchor (b6, 3*(double)(y)/6);
        
        AnchorPane.setTopAnchor (fecha, 3*(double)(y)/6);
        AnchorPane.setLeftAnchor (fecha, 2*(double)(x)/10);
        AnchorPane.setRightAnchor (fecha, 2*(double)(x)/10);
        AnchorPane.setBottomAnchor (fecha, 2*(double)(y)/6);
        
        this.setupTimeline();
    }

    public AnchorPane getRoot() {
        return root;
    }
    
    public void setupTimeline(){
        KeyFrame kf = new KeyFrame(Duration.seconds(1),new TimeHandler());
        Timeline timeline = new Timeline(kf);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private class TimeHandler implements EventHandler<ActionEvent>{
        
        @Override
        public void handle(ActionEvent event){
            Date calendario = new Date();
            String hora1 = (String)calendario.toString().subSequence(11, 12);
            String hora2 = (String)calendario.toString().subSequence(12, 13);
            String min1 = (String)calendario.toString().subSequence(14, 15);
            String min2 = (String)calendario.toString().subSequence(15, 16);
            String sec1 = (String)calendario.toString().subSequence(17, 18);
            String sec2 = (String)calendario.toString().subSequence(18, 19);
            String dia = (String)calendario.toString().subSequence(0, 3)+" "
                        +(String)calendario.toString().subSequence(8, 10)+" "
                        +(String)calendario.toString().subSequence(4, 7)+" "
                        +(String)calendario.toString().subSequence(24, 28);

            sonido.play();
            b1.setText(hora1);
            b2.setText(hora2);
            b3.setText(min1);
            b4.setText(min2);
            b5.setText(sec1);
            b6.setText(sec2);
            fecha.setText(dia);
        }
    } 

}

    

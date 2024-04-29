package interfaces;

import javax.swing.*;

public class Button implements Widget{
    private String label;
    public Button (String label){
        this.label=label;
    }

    @Override
    public void render() {

        System.out.println("Button" + " "+ label + " " + "oluşturuldu");

    }

    @Override
    public void onClick() {

        System.out.println("Button" + " " + label + " " + "tıklandı");

    }
}

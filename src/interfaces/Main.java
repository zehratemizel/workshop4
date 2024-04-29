package interfaces;

public class Main {
    public static void main(String[] args) {
        Widget button = new Button("submit");

        Widget textbox = new TextBox("İsminizi giriniz");

        button.render();
        button.onClick();
        textbox.render();
        textbox.onClick();
    }

}

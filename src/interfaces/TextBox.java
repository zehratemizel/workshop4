package interfaces;

public class TextBox implements Widget {

    private String text;
    public TextBox (String text){
        this.text=text;
    }

    @Override
    public void render() {

        System.out.println("Textbox" + " " + text + " " + "oluşturuldu");

    }

    @Override
    public void onClick() {

        System.out.println("Textbox " + text + " tıklandı");

    }
}


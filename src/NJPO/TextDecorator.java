package NJPO;

public class TextDecorator extends  Text {
    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public void write() {
        text.write();
    }
}

package NJPO;

public class PlainText extends Text {
    protected String text = "";

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public void write() {
        System.out.print(text);
    }
}

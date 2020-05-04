package NJPO;

public class PDecorator extends TextDecorator {

    public PDecorator(Text text) {
        super(text);
    }

    @Override
    public void write() {
        System.out.print("<p>");
        super.write();
        System.out.print("</p>");
    }
}

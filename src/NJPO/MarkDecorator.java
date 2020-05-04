package NJPO;

public class MarkDecorator extends TextDecorator {

    public MarkDecorator(Text text) {
        super(text);
    }

    @Override
    public void write() {
        System.out.print("<mark>");
        super.write();
        System.out.print("</mark>");
    }
}

package NJPO;

public class StrongDecorator extends TextDecorator {

    public StrongDecorator(Text text) {
        super(text);
    }

    @Override
    public void write() {
        System.out.print("<strong>");
        super.write();
        System.out.print("</strong>");
    }
}

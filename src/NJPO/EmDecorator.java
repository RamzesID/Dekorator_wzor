package NJPO;

public class EmDecorator extends TextDecorator {

    public EmDecorator(Text text) {
        super(text);
    }

    @Override
    public void write() {
        System.out.print("<em>");
        super.write();
        System.out.print("</em>");
    }
}

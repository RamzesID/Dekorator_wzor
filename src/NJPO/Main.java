package NJPO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String text;
        Text tagText;
        boolean loop = true;
        int nmbTag;
        ArrayList<Integer> integers = new ArrayList<>();


        System.out.println("Wprowadz teskt:");
        text = scanner.nextLine();
        tagText = new PlainText(text);

        System.out.println("Wybierz tagi (Mozesz wybrac kilka):\n1.<p>\n2.<strong>\n3.<em>\n4.<mark>\n5.Zakoncz wybor");

        while (loop){
            System.out.println("Wprowadz opcje z Menu");

            while (!scanner.hasNextInt()){
                System.out.println("Błedna opcja! Wprowadz numer opcji ponownie");
                scanner.next();
            }

            nmbTag = scanner.nextInt();

            for (Integer i : integers) {
                if (nmbTag == i) {
                    nmbTag = 6;
                    break;
                }
            }

            switch (nmbTag){
                case 1 :
                    tagText = new PDecorator(tagText);
                    break;
                case 2 :
                    tagText = new StrongDecorator(tagText);
                    break;
                case 3 :
                    tagText = new EmDecorator(tagText);
                    break;
                case 4 :
                    tagText = new MarkDecorator(tagText);
                    break;
                case 5 :
                    loop = false;
                    break;
                case 6:
                    System.out.println("Nie mozna ponownie wybrac tej opcji");
                    break;
                default:
                    System.out.println("Nie ma takiej opcji w Menu");
                    break;
            }
            integers.add(nmbTag);
        }
        System.out.print("Twoj otagowany tekst: ");
        tagText.write();
    }
}

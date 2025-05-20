import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Evidence evidence = new Evidence();

        OsobniVozidlo osobniVozidlo1 = new OsobniVozidlo();
        OsobniVozidlo osobniVozidlo2 = new OsobniVozidlo();
        Dodavka dodavka1 = new Dodavka();
        Dodavka dodavka2 = new Dodavka();



        evidence.add(osobniVozidlo1);
        evidence.add(osobniVozidlo2);
        evidence.add(dodavka1);
        evidence.add(dodavka2);

        System.out.println("Počet sedadel: ");
        evidence.vypisPocetSedadel();
        System.out.println("\n Hmotnosti nákladů: ");
        evidence.vypisHmotnostiNakladu();
    }
}
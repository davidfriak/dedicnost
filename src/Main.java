import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OsobniVozidlo> evidence = new ArrayList<>();

        OsobniVozidlo vozidlo = new OsobniVozidlo(5,2);
        vozidlo.zmenPocetOsob(4);


        List<OsobniVozidlo> seznamVozidel = new ArrayList<>();
        seznamVozidel.add(new OsobniVozidlo());
        seznamVozidel.add(new Dodavka());

        System.out.println(seznamVozidel.get(1).getClass());
        System.out.println(seznamVozidel.get(0).getClass());


    }
}
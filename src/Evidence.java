import java.util.ArrayList;

public class Evidence extends ArrayList<OsobniVozidlo> {
    public void vypisPocetSedadel() {
        for (OsobniVozidlo osobniVozidlo : this) {
            System.out.println("Počet sedadel je: " + osobniVozidlo.getPocetSedadel());
        }
    }
    public void vypisHmotnostiNakladu() {
        for (OsobniVozidlo osobniVozidlo : this) {
            System.out.println("Hmotnost nákladu je: " + osobniVozidlo.getHmotnostNakladu() + " kg");
        }
    }
}

public class OsobniVozidlo {
    private /* final */ int pocetSedadel; //final - atribut je neměnný
    private int pocetOsob;

    public OsobniVozidlo(int pocetSedadel, int pocetOsob) {
        this.pocetSedadel = pocetSedadel;
        this.pocetOsob = 0;

        if (pocetOsob < 0) {
            throw new RuntimeException("Počet osob nesmí být záporný!");
        }

        if (pocetOsob > pocetSedadel) {
            throw new RuntimeException("Počet osob nesmí být větší než počet sedadel!");
        }
    }

    public OsobniVozidlo() {
        this.pocetSedadel = 5;
    }

    public int getPocetSedadel() {
        return pocetSedadel;
    }
    public int getPocetOsob() {
        return pocetOsob;
    }
    public int getHmotnostNakladu() {
        return 0;
    }
    public void setPocetOsob(int pocetOsob) {
        this.pocetOsob = pocetOsob;
    }
    public void setPocetSedadel(int pocetSedadel) {
        this.pocetSedadel = pocetSedadel;
    }

    // moje řešení metody pro změnu počtu osob
    public void zmenPocetOsob(int novyPocetOsob) {
        if (novyPocetOsob >= 0) {
            this.pocetOsob = novyPocetOsob;
            System.out.println("Počet osob je teď: " + pocetOsob);
        } else {
            System.out.println("Počet osob nesmí být záporný");
        }
    }

    // řešení učitele metody pro změnu počtu osob
    public void zmenaPoctuOsob(int oKolik) {
        pocetOsob = Math.max(0, Math.min(pocetOsob + oKolik, pocetSedadel));
    }
}



public class Dodavka extends OsobniVozidlo{
    private int uzitecnaHmotnost;
    private int hmotnostNakladu = 0;

    public Dodavka(int pocetSedadel, int pocetOsob, int uzitecnaHmotnost, int hmotnostNakladu) {
        super(2, pocetOsob);
        this.uzitecnaHmotnost = 500;
        this.hmotnostNakladu = hmotnostNakladu;

        int hmotnostOsob = 120*getPocetOsob();
        if (hmotnostOsob + hmotnostNakladu > uzitecnaHmotnost) {
            throw new RuntimeException("Hmotnost nákladu a hmotnost osob nesmí být větší jak užitečná hmotnost");
        }
    }

    public Dodavka(int uzitecnaHmotnost) {
        super(2, uzitecnaHmotnost);
    }

    public Dodavka() {

    }

    public int getUzitecnaHmotnost() {
        return uzitecnaHmotnost;
    }
    public void setUzitecnaHmotnost(int uzitecnaHmotnost) {
        this.uzitecnaHmotnost = uzitecnaHmotnost;
    }
    public int getHmotnostNakladu() {
        return hmotnostNakladu;
    }
    public void setHmotnostNakladu(int hmotnostNakladu) {
        this.hmotnostNakladu = hmotnostNakladu;
    }
}

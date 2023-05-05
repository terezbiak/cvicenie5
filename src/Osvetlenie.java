public class Osvetlenie extends ZakladneZariadenie implements Zariadenie{
    public Osvetlenie(String nazov){
        super(nazov);
    }

    @Override
    public void zapni() throws ChybaZariadenia {
        if (! this.stav) { // ak je false
            super.zapni();
            System.out.println("Osvetlenie je zapnuté");
        }
    }

    @Override
    public void vypni() throws ChybaZariadenia {
        if (this.stav){
            super.vypni();
            System.out.println("Osvetlenie je vypnuté");
        }
    }
}

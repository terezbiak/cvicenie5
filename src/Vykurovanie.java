public class Vykurovanie extends ZakladneZariadenie implements Zariadenie, Termostat{
    final int MAX_TEPLOTA = 40;
    int teplota;
    public Vykurovanie(String nazov){
        super(nazov);
    }

    @Override
    public void zapni() throws ChybaZariadenia{
        if (! stav) {
            nastavTeplotu(25);
            super.zapni();
        }
    }

    @Override
    public void vypni() throws ChybaZariadenia{
        if (stav) {
            nastavTeplotu(0);
            super.vypni();
        }
    }
    public void nastavTeplotu(int teplota) throws ChybaVykurovania{
        if (teplota < 0 || teplota > MAX_TEPLOTA) {
            throw new IllegalArgumentException("teplota je mimo rozsah");
        }
        this.teplota = teplota;
        System.out.println("aktuálna teplota je:" + this.teplota);
    }
}

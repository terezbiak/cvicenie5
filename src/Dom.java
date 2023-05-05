public class Dom {

    private Vykurovanie vykurovanie;
    private Osvetlenie osvetlenie;

    public Dom(Vykurovanie vykurovanie, Osvetlenie osvetlenie) {
        this.osvetlenie = osvetlenie;
        this.vykurovanie = vykurovanie;
    }

    public void zapniSvetlo() throws ChybaZariadenia {
        this.osvetlenie.zapni();
    }

    public void vypniSvetlo() throws ChybaZariadenia {
        this.osvetlenie.vypni();
    }

    public void zapniKurenie() throws ChybaZariadenia {
        this.vykurovanie.zapni();
    }

    public void vypniKurenie() throws ChybaZariadenia {
        this.vykurovanie.vypni();
    }

    public void nastavTeplotu(int teplota) throws ChybaVykurovania {
        this.vykurovanie.nastavTeplotu(teplota);
    }

}
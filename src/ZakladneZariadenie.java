public abstract class ZakladneZariadenie implements Zariadenie {
    protected boolean stav;
    protected String nazov;
    public ZakladneZariadenie(String nazov){
        this.nazov = nazov;
        this.stav = false;
    }

    @Override
    public void zapni() throws ChybaZariadenia{
        if (! this.stav) {
            this.stav = true;
            System.out.println("Zariadenie sa zaplo.");
        } else {
            throw new ChybaZariadenia("zariadenie už je zapnuté", this);
        }
    }

    @Override
    public void vypni() throws ChybaZariadenia{
        if (this.stav) {
            this.stav = false;
            System.out.println("Zariadenie sa vyplo");
        } else {
            throw new ChybaZariadenia("zariadenie už je vypnuté", this);
        }
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof ZakladneZariadenie){
            return nazov.equals(((ZakladneZariadenie)obj).nazov);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return nazov.hashCode();
    }
}

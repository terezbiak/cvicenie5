public class Program {
    public static void main(String args[]) throws ChybaZariadenia{
        Dom dom1 = new Dom(new Vykurovanie("vykurovanie1"), new Osvetlenie("osvetlenie1"));

        try {
            dom1.zapniSvetlo();
            dom1.zapniKurenie();
            dom1.nastavTeplotu(100);
        } catch (ChybaVykurovania chyba){
            System.out.println(chyba.getMessage());
            dom1.nastavTeplotu(25);
        }
        finally {
            dom1.vypniKurenie();
        }
    }
}

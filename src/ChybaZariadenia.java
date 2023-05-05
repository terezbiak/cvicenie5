public class ChybaZariadenia extends Exception{

    private Zariadenie zariadenie;

    ChybaZariadenia(){
        this(null,null);
    }
    ChybaZariadenia(String sprava){
        this(sprava,null);
    }
    ChybaZariadenia(String sprava, Zariadenie zariadenie){
        super(sprava);
        this.zariadenie = zariadenie;
    }
    public Zariadenie getZariadenie(){
        return zariadenie;
    }
}

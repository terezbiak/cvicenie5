import sun.rmi.transport.proxy.CGIHandler;

public class ChybaVykurovania extends ChybaZariadenia{
    public ChybaVykurovania(){

    }
    public ChybaVykurovania(String sprava) {
        super(sprava);
    }

    public ChybaVykurovania(String sprava, Zariadenie zariadenie){
        super(sprava, zariadenie);
    }
}

package inter;

public class single {
    private single() {

    }

    private static single instance;

    public static single getInstance(){
        if(instance == null){
            instance =  new single();
        }
        return instance;
    }

}

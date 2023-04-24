package learnInterface;

public interface Media {

    void sound();

    void base();

    void looks();

    default void fun(){
        System.out.println("I am the greatest");
    }

    private void add(){

    }
}

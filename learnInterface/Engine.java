package learnInterface;

public interface Engine {
    void breaks();
    void speed();
    void looks();

    default void fun(){
        System.out.println("I am the greatest");
    }

     private static String jump(){
        return "I am the jumper";
    }

    static String getJump(){
        return jump();
    }



}

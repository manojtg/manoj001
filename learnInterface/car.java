package learnInterface;

public class car implements Media,Engine{


    @Override
    public void breaks() {

    }

    @Override
    public void speed() {

    }

    @Override
    public void sound() {

    }

    @Override
    public void base() {

    }

    @Override
    public void looks() {

    }

    @Override
    public void fun() {
        Media.super.fun();
    }

    public static void add(int a, int b,int c){

        System.out.println(a+b+c);

    }

    public static int add(int a){
        return a;
    }

    public static String add(int a, int b){
        return "ans" + a+b;
    }
}

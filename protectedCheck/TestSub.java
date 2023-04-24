package protectedCheck;

public class TestSub extends TestingProtected{

    public TestSub(int uniform, int time, int cla, int rno) {
        super(uniform, time, cla, rno);
    }




    public static void main(String[] args) {
        TestSub  tt = new TestSub(1,2,3,4);
        TestingProtected jj = new TestingProtected(1,2,3,4);


    }

}

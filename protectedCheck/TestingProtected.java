package protectedCheck;

import inter.SuperStudent;

public class TestingProtected {
    private int cla;

    int n;
    int m;

    public TestingProtected(int uniform, int time, int cla, int rno) {

        super();
    }



    public static void main(String[] args) {
        TestingProtected  tt = new TestingProtected(1,2,3,4);
        int l = tt.cla;

    }




}

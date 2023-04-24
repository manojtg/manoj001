package inter;

public class Student extends SuperStudent {
    int rno;
    String name;
    int  marks;
    protected int len;

    Student(String name, int marks){
        super(1,2,3,4);
        this.name = name;
        this.marks = marks;
        this.rno = 15;
    }


    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b,int c){
        return a+b+c;
    }

    String sum(String a, String b,String c){
        return a+b+c;
    }


}

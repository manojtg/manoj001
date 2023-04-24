package inter;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String s = "abdefgadef";
        System.out.println(longSubString(s));
        Student man = new Student( "Manoj", 98);
        System.out.println(man.sum(1,2));
        System.out.println(man.sum(1,2, 3));
        System.out.println(man.sum("Manoj ","The ", "Star"));
        int i = man.len;


        SuperStudent manoj = new Student("Manoj", 98);

        System.out.println("rno check  ========= "+manoj.rno);

    }
    public static int longSubString(String word){

        char[] a = word.toCharArray();
        int len = 0;
        String res = "";
        for(int i = 0; i < a.length; i++){
            String sub = "";
            sub = sub+a[i];
            for(int j = 1; j< a.length;j++){
                if(a[i] != a[j]){
                    sub=sub+a[j];
                }else{
                    if(sub.length() > res.length()){
                        res = sub;
                    }
                }
            }

        }
        return res.length();
    }
}
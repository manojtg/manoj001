package learnInterface;

import java.util.HashMap;

public class Main {
    static public void main(String[] args) {
//        Engine audi = new car();
//        Engine.getJump();
//
//        car altroz = new car();
//        car.add(2);
//        car.add(2,3);
//
//
//        int [] arr = {1,2,3,4,5,6,7,8,9,10};
//        int len = 1/2;
//        System.out.println(len);
//        System.out.println("a" + "b");
//        System.out.println("a" + "b");
//        System.out.println("a" + "b");
//
//        int a = 4;
//        int b = 4;
//
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//
//        b = 6;
//
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//
//
//
//
//        int l = 20;
//        int k = l;
//        System.out.println(l);
//        System.out.println(k);
//
//        k = 19;
//
//        System.out.println(l);
//        System.out.println(k);
//
//
//        int[] arr1 = {1,2,3,4,5,6};
//        int[] arr2 = arr1;
//
//        System.out.println(arr1.toString());
//        System.out.println(arr2.toString());
//
//        arr1[0] = 10;
//
//        System.out.println(arr1.toString());
//        System.out.println(arr2.toString());
//
//        String m = "manoj";
//        String n = m;
//        System.out.println(m == n);
//        System.out.println();
//        n = "anoj";
//        System.out.println(m == n);
//        System.out.println(m.toString());
//        System.out.println(n.toString());
//
//        char i = ' ';
//
//        int y = 0;
//
//        System.out.println(y);
//

        int start = 0;
        String s = "abcdeadefge";
        System.out.println(longestUniqueSubsttr(s));

    }

    static int longestUniqueSubsttr(String s)
    {

        // Creating a set to store the last positions of occurrence
        HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length = 0;

        // starting the initial point of window to index 0
        int start = 0;

        for(int end = 0; end < s.length(); end++)
        {
            // Checking if we have already seen the element or not
            if(seen.containsKey(s.charAt(end)))
            {
                // If we have seen the number, move the start pointer
                // to position after the last occurrence

                start = Math.max(start, seen.get(s.charAt(end)) + 1);

            }

            // Updating the last seen value of the character

            seen.put(s.charAt(end), end);

            maximum_length = Math.max(maximum_length, end-start + 1);

        }
        return maximum_length;
    }
}

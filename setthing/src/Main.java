import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Set<Integer> a=new HashSet<>() ;
     a.add(1);
     a.add(3);
     a.add(2);
     a.add(4);
        a.add(8);
        a.add(9);
        a.add(0);
     // 1, 3, 2, 4, 8, 9, 0 }

        Set<Integer> b=new HashSet<>() ;
        b.add(1);
        b.add(3);
        b.add(7);
        b.add(5);
        b.add(4);
        b.add(0);
        b.add(7);
        b.add(5);
        //1, 3, 7, 5, 4, 0, 7, 5

        Set<Integer> uni=new HashSet<>();
        uni.addAll(a);
        uni.removeAll(b);
        System.out.println(uni);


        }
    }

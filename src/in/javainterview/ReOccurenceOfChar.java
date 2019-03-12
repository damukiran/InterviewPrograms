package in.javainterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReOccurenceOfChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur string:");
        String s = sc.next();
        char[] c = s.toCharArray();
        System.out.println(c);
        HashMap<Character, Integer> map = new HashMap<>();
        for (char cc : c) {
            if (map.containsKey(cc)) {
                map.put(cc, map.get(cc) + 1);
            } else {
                map.put(cc, 1);
            }

        }
        System.out.println(map);
        
    }
}

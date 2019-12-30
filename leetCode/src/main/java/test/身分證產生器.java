package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class 身分證產生器 {

    public static String city;
    public static String sex;

    public static void main(String[] args) {

        create();

    }

    public static int[] create() {
        int[] d = new int[11];
        int[] dx = {1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1};
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> map = new HashMap<>();
        map.put("A", "10");
        map.put("B", "11");
        map.put("C", "12");
        map.put("D", "13");
        map.put("E", "14");
        map.put("F", "15");
        map.put("G", "16");
        map.put("H", "17");
        map.put("I", "34");
        map.put("J", "18");
        map.put("K", "19");
        map.put("M", "21");
        map.put("N", "22");
        map.put("O", "35");
        map.put("P", "23");
        map.put("Q", "24");
        map.put("T", "27");
        map.put("U", "28");
        map.put("V", "29");
        map.put("W", "32");
        map.put("X", "30");
        map.put("Z", "33");
        map.put("L", "20");
        map.put("R", "25");
        map.put("S", "26");
        map.put("T", "31");

        System.out.println("請輸入出生地: ");

        city = map.get(sc.next());
        System.out.println(city);

        if (city != null) {
            d[0] = Integer.valueOf(city.charAt(0) - 48);
            d[1] = Integer.valueOf(city.charAt(1) - 48);
        }

        System.err.println("請輸入性別(F/M)");
        sex = sc.next();

        if (sex.equals("F") || sex.equals("f")) {
            d[2] = 2;
        }
        if (sex.equals("M") || sex.equals("m")) {
            d[2] = 1;
        }

        whileloop:
        while (true) {
            int sum = 0;

            for (int j = 3; j < d.length; j++) {
                d[j] = new Random().nextInt(10);
            }

            for (int i = 0; i < d.length; i++) {
                sum += d[i] * dx[i];

            }
            if (sum % 10 == 0) {
                break whileloop;
            }

        }

        for (int ans : d) {
            System.out.print(ans);
        }

        return d;
    }

}

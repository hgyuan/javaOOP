package day11.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculate {
    public static void main(String[] args) {
        for (int num = 0; num <= 100; num++) {
            int chicken = 75 + 3 * num;
            int cock = 4 * num;
            int hen = 25 - 7 * num;
            if (chicken > 100 || hen > 100 || cock > 100 || hen < 1) {
                break;
            }
            System.out.println("公鸡" + cock + " 母鸡 " + hen + " 小鸡 " + chicken);
        }
    }
}

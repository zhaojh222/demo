package com.zjh.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by jiazhao on 5/10/18.
 */
public class TestClass {
    public static void main(String[] args) {
//        System.out.println(flipFlop(0).orElse(null));
        System.out.println("123".split("")[1]);
    }

    public static Optional<List<String>> flipFlop(int n) {
        if (n ==0 ){
            return Optional.empty();
        }
        List<String> list = Stream.iterate(1, i -> i + 1)
                .map(v -> String.valueOf(v)).limit(n)
                .collect(Collectors.toList());

        list = list.stream().map(str -> {
            int value = Integer.parseInt(str);
            if (value % 3 == 0 && value % 5 != 0) {
                return "Flip";
            }
            if (value % 5 == 0 && value % 3 != 0) {
                return "Flop";
            }
            if (value % 3 == 0 && value % 5 == 0) {
                return "FlipFlop";
            }
            return str;
        }).collect(Collectors.toList());


        return Optional.of(list);
    }

    /*
    abcde, a*d?
     */
    static boolean matches(String s, String r) {
        int length = r.length();
        int skip = 0;
        for (int i = 0; i < length; i++) {
            char c1 = s.charAt(i + skip);
            char c2 = r.charAt(i);

            if (c1 == c2) {
                continue;
            } else {
                if (c2 == '?') {
                    continue;
                }
                if (c2 == '*') {
                    if (i == length - 1) {
                        break;
                    }
                    char cNext = r.charAt(i + 1);
                    int nextPos = s.indexOf(cNext, i) - 1;
                    skip = nextPos - i;
                    continue;
                }
                return false;
            }
        }
        return true;
    }

}

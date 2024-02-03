package com.core.concepts.newfeatures.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        NumberFormat nuf = NumberFormat.getCompactNumberInstance();
        System.out.println(nuf.format(1000)); // 1T - for Locale India viz. en_IN
        System.out.println(nuf.format(10000)); // 10T - for Locale India viz. en_IN
        System.out.println(nuf.format(100000)); // 1L - for Locale India viz. en_IN
        System.out.println(nuf.format(1000000)); // 10L - for Locale India viz. en_IN

        nuf = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(nuf.format(1000)); // 1K - for Local US
        System.out.println(nuf.format(10000)); // 10K - for Local US
        System.out.println(nuf.format(100000)); // 100K - for Local US
        System.out.println(nuf.format(1000000)); // 1M - for Local US

        nuf = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println(nuf.format(1000)); // 1 thousand - for Local US
        System.out.println(nuf.format(10000)); // 10 thousand - for Local US
        System.out.println(nuf.format(100000)); // 100 thousand - for Local US
        System.out.println(nuf.format(1000000)); // 1 million - for Local US
    }
}

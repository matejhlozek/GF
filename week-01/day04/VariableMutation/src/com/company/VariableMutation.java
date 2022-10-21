package com.company;

public class VariableMutation {

    public static void main(String[] args) {

        int a = 3;
        a = a + 10;
        System.out.println(a);

        int b = 100;
        b = b - 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d = d / 5;
        System.out.println(d);

        int e = 8;
        e = e * e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f1IsBigger = (f1 > f2);
        System.out.println(f1IsBigger);

        int g1 = 350;
        int g2 = 200;
        boolean ifDoubleOfG2IsBigger = ((g2*2) > g1);
        System.out.println(ifDoubleOfG2IsBigger);

        int h = 135798745;
        boolean ifDividableBy11 = (h % 11 == 0);
        System.out.println(ifDividableBy11);

        int i1 = 10;
        int i2 = 3;
        boolean ifHigherAndSmaller = (i1 > (i2*i2) && i1 < (i2*i2*i2));
        System.out.println(ifHigherAndSmaller);

        int j = 1521;
        boolean ifDividableBy3or5 = (j % 3 == 0 || j % 5 == 0);
        System.out.println(ifDividableBy3or5);



    }
}

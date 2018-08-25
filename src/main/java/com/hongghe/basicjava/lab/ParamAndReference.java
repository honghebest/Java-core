package com.hongghe.basicjava.lab;

/**
 * @author hongghe 2018/8/24
 */
public class ParamAndReference {

    public static void main(String[] args) {
        int[] o3 = new int[1];
        int o1 = 1;
        o1 = 2;
        setting(o1, 3);
        set(o3);
        System.out.println(o3[0]);
        System.out.println(o1);
    }

    public static void setting(int o1, int o2) {
        o1 = o2;
    }

    public static void set(int[] o) {
        o[0] = 1;
    }
}

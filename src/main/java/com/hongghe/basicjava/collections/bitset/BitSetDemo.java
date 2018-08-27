package com.hongghe.basicjava.collections.bitset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.BitSet;

/**
 * @author hongghe 2018/8/25
 */
public class BitSetDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(BitSetDemo.class);

    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(1);
        bitSet.set(231);
        System.out.println(bitSet);

        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // set some bits
        for(int i=0; i<16; i++) {
            if((i%2) == 0) {
                bits1.set(i);
            }
            if((i%5) != 0){
                bits2.set(i);
            }
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);

        // OR bits
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);

        // XOR bits
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bits2);
    }

    /**
     * 计算素数
     */
    public static void computeSieve() {
        int n = 100;
        BitSet b = new BitSet(n + 1);
        int i;
        for (i = 2; i <= n; i++) {
            b.set(i);
        }

        i = 2;
        while (i * i <= n) {
            if (b.get(i)) {
                int k = 2 * i;
                while (k <= n) {
                    b.clear(k);
                    k += i;
                }
            }
            i++;
        }

        i = 0;
        while (i <= n) {
            if (b.get(i)) {
                System.out.println(i);
            }
            i++;
        }
    }
}

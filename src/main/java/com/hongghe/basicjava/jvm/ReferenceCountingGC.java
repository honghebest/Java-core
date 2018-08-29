package com.hongghe.basicjava.jvm;

/**
 * @author hongghe 2018/8/29
 */
public class ReferenceCountingGC {

    Object instance = null;

    public static void main(String[] args) {
        ReferenceCountingGC referenceCountingGCA = new ReferenceCountingGC();
        ReferenceCountingGC referenceCountingGCB = new ReferenceCountingGC();
        referenceCountingGCA.instance = referenceCountingGCB;
        referenceCountingGCB.instance = referenceCountingGCA;
        referenceCountingGCA = null;
        referenceCountingGCB = null;
    }
}

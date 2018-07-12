package com.widera.projecteuler.problem025;

class Triplet<A, B, C> {
    final A a;
    final B b;
    final C c;

    Triplet(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "{a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

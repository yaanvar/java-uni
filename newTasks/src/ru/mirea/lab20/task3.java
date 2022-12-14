package ru.mirea.lab20;

import java.io.Serializable;

public class task3<T extends Comparable<T>, V, K> implements Serializable {
    private T t;
    private V v;
    private K k;

    public task3(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "task1{" +
                "t=" + t +
                ", v=" + v +
                ", k=" + k +
                '}';
    }

    public static void main(String[] args) {
        task1<Integer, String, Double> task3 = new task1<>(1, "2", 3.0);
        System.out.println(task3);
    }
}
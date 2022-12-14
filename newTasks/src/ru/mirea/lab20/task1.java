package ru.mirea.lab20;

public class task1<T, V, K> {
    private T t;
    private V v;
    private K k;

    public task1(T t, V v, K k) {
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
        task1<Integer, String, Double> task1 = new task1<>(1, "2", 3.0);
        System.out.println(task1);
    }
}
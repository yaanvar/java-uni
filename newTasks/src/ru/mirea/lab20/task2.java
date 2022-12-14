package ru.mirea.lab20;

public class task2<T, V, K> {
    private T t;
    private V v;
    private K k;

    public task2(T t, V v, K k) {
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
        return "task2{" +
                "t= " + t + "(" + t.getClass().getName() + ")" +
                ", v=" + v + "(" + v.getClass().getName() + ")" +
                ", k=" + k + "(" + k.getClass().getName() + ")" +
                '}';
    }

    public static void main(String[] args) {
        task2<Integer, String, Double> task2 = new task2<>(1, "2", 3.0);
        System.out.println(task2);
    }
}
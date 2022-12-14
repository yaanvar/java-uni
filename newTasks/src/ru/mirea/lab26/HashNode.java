package ru.mirea.lab26;

public class HashNode {
    int Key;
    String value;
    HashNode next = null;

    HashNode(int iKey, String value){
        this.Key = iKey;
        this.value = value;
    }

    public void addNext(HashNode next){
        this.next = next;
    }

    @Override
    public String toString(){
        return "Element: " + Key + " " + value;
    }
}
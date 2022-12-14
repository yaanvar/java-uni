package ru.mirea.lab26;

public class HashTable {

    int realSize;
    int currentSize;

    HashNode[] table;

    private Integer hashtabHash(int key){
        return key % currentSize;
    }

    public void hashtabInit(){
        realSize = 0;
        currentSize = 8;
        table = new HashNode[currentSize];
    }

    public void hashtabAdd(int key, String value){
        int place = hashtabHash(key);

        realSize++;
        if (realSize > currentSize * 0.75) tableResize(currentSize * 2);

        if (table[place] == null) {
            table[place] = new HashNode(key,value);
        } else {
            HashNode tmp = table[place];
            while (tmp.next != null) tmp = tmp.next;
            tmp.addNext(new HashNode(key,value));
        }
    }

    public void hashtabDelete(int key){
        realSize--;

        int place = hashtabHash(key);

        if(table[place].Key == key ) table[place] = (table[place].next == null)  ? null : table[place].next;
        else if (table[place] != null){
            HashNode tmp = table[place];
            while (tmp.next != null && tmp.next.Key != key) tmp = tmp.next;
            tmp.next = null;
        }

    }

    public HashNode hashtabLookUp(int key){
        HashNode res = table[hashtabHash(key)];
        if (res == null) return null;
        else{
            if (res.Key == key) return res;
            else {
                while (res != null && res.Key != key) res = res.next;
                return res;
            }
        }
    }

    private void tableResize(int newSize){
        HashNode[] newTable = new HashNode[newSize];

        currentSize = newSize;

        for(HashNode elem : table){
            if (elem == null) continue;
            int place = hashtabHash(elem.Key);
            if (newTable[place] == null) newTable[place] = elem;
            else {
                HashNode tmp = newTable[place];
                while (tmp.next != null) tmp = tmp.next;
                tmp.addNext(elem);
            }
        }
        table = newTable;
    }
}
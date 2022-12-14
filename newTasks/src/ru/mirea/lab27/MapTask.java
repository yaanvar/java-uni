package ru.mirea.lab27;

import java.util.*;

public class MapTask {
    Map<String, ArrayList<String>> map;

    MapTask() {
        map = new HashMap<String, ArrayList<String>>();
    }

    public void add(String key, String value) {
        ArrayList tempList = null;
        if (map.containsKey(key)) {
            tempList = map.get(key);
            if (tempList == null)
                tempList = new ArrayList();
            tempList.add(value);
        } else {
            tempList = new ArrayList();
            tempList.add(value);
        }
        map.put(key, tempList);
    }


    public HashMap<String, ArrayList<String>> createMap() {
        HashMap<String, ArrayList<String>> newMap = new HashMap<>();
        add("name1", "surname1");
        add("name1", "surname2");
        add("name1", "surname3");
        add("name2", "surname5");
        add("name2", "surname4");
        add("name3", "surname3");
        add("name4", "surname3");
        add("name5", "surname1");
        add("name6", "surname1");
        return newMap;
    }

    public int getSameFirstNameCount() {

        int count = 0;

        for (Map.Entry<String, ArrayList<String>> item : map.entrySet()) {
            if (item.getValue().size() > 1) count += item.getValue().size();
        }
        return count;
    }

    public int getSameLastNameCount() {
        Map<String, Integer> tmp = new HashMap<>();

        for (Map.Entry<String, ArrayList<String>> item : map.entrySet()) {
            for (String name : item.getValue()) {
                if (tmp.containsKey(name)) tmp.replace(name, tmp.get(name) + 1);
                else tmp.put(name, 1);
            }
        }

        int count = 0;

        for (Map.Entry<String, Integer> item : tmp.entrySet()) {
            if (item.getValue() > 1) count += item.getValue();
        }
        return count;
    }

    public static void main(String[] args) {
        MapTask work = new MapTask();
        HashMap<String, ArrayList<String>> newMap = work.createMap();

        System.out.println(work.getSameFirstNameCount());
        System.out.println(work.getSameLastNameCount());
    }
}
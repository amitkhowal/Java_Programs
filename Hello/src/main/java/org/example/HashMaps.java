package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HashMaps {

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("key 1"," Amit ");
        map.put("Key 2"," Rahul ");
        System.out.println(map.get("key 1"));
        for (String key:map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        //concurrent hashmaps
        ConcurrentMap<String,String> cmap=new ConcurrentHashMap<>();
        cmap.put("key 4"," Ankit ");
        cmap.put("Key 5"," Ram ");

        //concurrently modify the map
        new Thread(()->{
            map.put("key 6","Sam");
        }).start();

        for (String key : cmap.keySet()) {
            System.out.println(key + ": " + cmap.get(key));
        }

    }


}

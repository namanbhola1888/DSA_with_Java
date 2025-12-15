// 10

import java.util.*;

public class RandomizedSet {

    Map<Integer, Integer> map; // value -> index in list
    List<Integer> list;
    Random rand;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        
        if (!map.containsKey(val)) return false;

        int idx = map.get(val);
        int lastVal = list.get(list.size() - 1);

        list.set(idx, lastVal);
        map.put(lastVal, idx);

        list.remove(list.size() - 1);
        map.remove(val);


        return true;
    }
    
    public int getRandom() {
        int idx = rand.nextInt(list.size()); // random index
        return list.get(idx); 
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        obj.insert(1);
        obj.insert(2);
        System.out.println(obj.getRandom());
        obj.remove(1);
        System.out.println(obj.getRandom());
    }
}

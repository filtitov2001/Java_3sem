package Lab23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public <T> ArrayList<T> newArrayList(T[] array){
        return new ArrayList<T>(Arrays.asList(array));
    }

    public <T> HashSet<T> newHashSet(T[] array){
        return new HashSet<T>(Arrays.asList(array));
    }

    public <K, V> HashMap<K, V> newHashMap(Collections<K, V>[] array){
        HashMap<K, V> buff = new HashMap<>();
        for (Collections<K, V> collections: array)
            buff.put(collections.getKey(), collections.getValue());

        return buff;
    }
}

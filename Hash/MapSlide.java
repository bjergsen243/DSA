package Hash;

import java.util.ArrayList;

public class MapSlide {
    private class Data {
        int key;
        String value;
        Data (int key, String value) {
            this.key = key;
            this.value = value;
        }
        @Override
        public boolean equals(Object other) {
            if (other instanceof Data) {
                return this.key == ((Data)other).key;
            }
            return false;
        }
        
    }
    private final int N = 1000;
    private ArrayList<Data> myBuckets[];
    MapSlide() {
        myBuckets = new ArrayList[N];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    
    }
    private int hashFunction(int key) {
        return key % N;
    }
    public String put(int key, String value) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data newData = new Data(key,value);
        int keyIndex = bucket.indexOf(newData);
        String oldValue = null;
        if (keyIndex >= 0) {
            oldValue = bucket.get(keyIndex).value;
            bucket.get(keyIndex).value = value;
        } else {
            bucket.add(newData);
        }
        return oldValue;
    }
    public String remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data delData = new Data(key, "");
        String removeValue = delData.value;
        bucket.remove(delData);
        return removeValue;
    }
    public String get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data findData = new Data(key, "");
        int keyIndex = bucket.indexOf(findData);
        if (keyIndex >= 0) {
          return bucket.get(keyIndex).value;
        }
        return null;
    }
    public static void main(String[] args) {
        MapSlide map = new MapSlide();
        System.out.println(map.put(5, "A"));
        System.out.println(map.put(7, "B"));
        System.out.println(map.put(2, "C"));
        System.out.println(map.put(8, "D"));
        System.out.println(map.put(2, "E"));
        System.out.println(map.get(7));
        System.out.println(map.get(4));
        System.out.println(map.get(2));
        System.out.println(map.remove(5));
        System.out.println(map.remove(2));
        System.out.println(map.get(2));
        

    }
}

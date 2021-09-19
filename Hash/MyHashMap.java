package Hash;
import java.util.ArrayList;
public class MyHashMap {

    private class Data {
        int key;
        int value;

        Data(int key, int value) {
            this.key = key;
            this.value = value;
        }
        @Override
        public boolean equals(Object other) {
            if(other instanceof Data){
                return this.key == ((Data) other).key;
            }
            return false;
        }
    }
    private final int SIZE = 1000;
    private ArrayList<Data> myBuckets[];
    MyHashMap() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data newData = new Data(key,value);
        int keyIndex = bucket.indexOf(newData);
        if (keyIndex >= 0){
            bucket.get(keyIndex).value = value;
        } else {
            bucket.add(newData);
        }

    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data delData = new Data(key,0);
        bucket.remove(delData);

    }

    public int get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data findData = new Data(key,0);
        int keyIndex = bucket.indexOf(findData);
        if (keyIndex >= 0){
            return bucket.get(keyIndex).value;
        }
        return -1;
    }
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1,1);
        map.put(1,2);
        map.put(10,2);
        System.out.println("" + map.get(1));
        System.out.println("" + map.get(2));
        map.remove(1);
        System.out.println("" + map.get(1));
        System.out.println("" + map.get(10));


    }
}

package Hash;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Son","Thanh","Son","Nguyen","Son","Long"};
        Map<String, Integer> map = new HashMap<String, Integer>();
        // key la gia tri cua phan tu trong mang
        // value la so lan xuat hien cua phan tu trong mang
        for (String i : arr){
            if (map.containsKey(i) == false){
                // i chua xuat hien trong map
                map.put(i, 1);
            } else {
                // i da xuat hien truoc do 
                int count = map.get(i);
                count++;
                map.put(i, count);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " xuat hien " + entry.getValue() +" lan.");
        }
    }
}

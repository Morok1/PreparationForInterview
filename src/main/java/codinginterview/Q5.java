package codinginterview;

import java.util.HashMap;
import java.util.Map;

/*An array contains n numbers ranging from 0 to n-2. There is exactly one number duplicated in
the array. How do you find the duplicated number? For example, if an array with length 5 contains numbers {0, 2,
1, 3, 2}, the duplicated number is 2. */
public class Q5 {
    public int findDuplicate(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length ; i++) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < array.length; i++) {
            if(map.get(i) > 1){
                return map.get(i);
            }
        }
        throw new IllegalStateException("No have this element!");

    }
}

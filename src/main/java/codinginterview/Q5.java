package codinginterview;

import java.util.HashMap;
import java.util.Map;

/*An array contains n numbers ranging from 0 to n-2. There is exactly one number duplicated in
the array. How do you find the duplicated number? For example, if an array with length 5 contains numbers {0, 2,
1, 3, 2}, the duplicated number is 2. */
public class Q5 {
    public static int findDuplicate(int[] array){
        if(array == null || array.length == 0){
            throw new IllegalStateException();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length ; i++) { map.put(array[i], map.getOrDefault(i, 0) + 1); }
        for (int i = 0; i < array.length; i++) {
            if(map.getOrDefault(array[i], 0) > 1){
                return map.get(array[i]);
            }
        }
        throw new IllegalStateException("No have this element!");

    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2, 3, 3};

        int duplicateElement = findDuplicate(array);
        System.out.println(duplicateElement);
    }
}

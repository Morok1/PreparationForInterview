package ocp;

import java.util.ArrayList;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {
        Question6 q = new Question6();
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        q.m1(list);


    }

    private void m1(List<?> list){
        m2(list);
    }
    private <T> void m2(List<T> list){
        list.set(1, list.get(0));
        System.out.println(list);
    }
}



package ocp;

public class Question_6_2 <T extends Number> {
    T t;
    public static void main(String[] args) {
        Question_6_2 q =
                new Question_6_2<Integer>(); // 1
        q.t = new Float(1); // 2
        System.out.println(q.t);
    }
}
package ocp;

public class Question_19_1 {
    protected static int m1() {
        try {
            throw new RuntimeException();
        } catch(RuntimeException e) {
            return 1;
        } finally {
            return 2;
        }
    }
    public static void main(String[] args) {
        System.out.println(m1());
    }
}

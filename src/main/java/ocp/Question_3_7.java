package ocp;

public class Question_3_7 {
    public static void main(String[] args) {
        abstract class A { // 1
            public void m() {
                System.out.println("m()");
            }
        }
        class AA extends A { } // 2
    }
}

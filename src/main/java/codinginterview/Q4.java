package codinginterview;
/*There are three threads in a process. The first thread prints 1 1 1 …, the second one prints 2 2
2 …, and the third one prints 3 3 3 … endlessly. How do you schedule these three threads in order to print 1 2
3 1 2 3 …?*/
//TODO
public class Q4 {
    static volatile int counter = 1;
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread(1, counter);
        MyThread myThread2 = new MyThread(2, counter);
        MyThread myThread3 = new MyThread(3, counter);

        myThread3.run();
        myThread1.run();
        myThread2.run();



        }
}

class MyThread extends Thread{
    private int i;
    private Integer counter;

    public MyThread(int i, Integer counter) {
        this.i = i;
        this.counter = counter;
    }

    @Override
    public void run() {
        while(counter % i == 0) {
            counter++;
            System.out.println(counter);
            System.out.println(this.toString());
        }
    }

    @Override
    public String toString() {
        return "MyThread{" +
                "i=" + i +
                '}';
    }
}


import com.sun.source.tree.SynchronizedTree;


class A1 extends Thread {

    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("Heyyyy");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);

            }
        }

    }
}

class A2 extends Thread {

    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("Hiii");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);

            }
        }

    }
}

class A3 implements Runnable {

    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("Haloo");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Counter {

    int c = 0;

    public synchronized void  increament() {
        c++;
    }
}

class ThreadDemo {

    public static void main(String args[]) throws InterruptedException {

        A1 obj1 = new A1();
        A2 obj2 = new A2();
        A3 obj3 = new A3();
        Runnable obj4 = ()
                -> {
            for (int i = 0; i <= 50; i++) {
                System.out.println("Halo ishhh");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        Thread t1 = new Thread(obj3);
        Thread t2 = new Thread(obj4);
        t1.start();
        t2.start();
        obj2.setPriority(10);
        obj1.start();
        obj2.start();
        Counter count = new Counter();

        Runnable obj5 = ()
                -> {
            for (int i = 0; i <= 1000; i++) {
                count.increament();
            }
        };
        Runnable obj6 = ()
                -> {
            for (int i = 0; i <= 1000; i++) {
                count.increament();
            }
        };
        Thread t3 = new Thread(obj5);
        Thread t4 = new Thread(obj6);
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println("hellooooo count" + count.c);
    }
}

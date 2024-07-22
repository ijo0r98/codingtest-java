package ex.thread;

public class Task1 implements Runnable{

    @Override
    public void run() {

//        String name = new Object() {}.getClass().getEnclosingClass().getName();

        int sum = 0;
        for (int i=0; i < 10; i++) {
            System.out.println("Task: " + i);
            sum += i;
        }


        System.out.println("Task End : " + sum);
    }
}

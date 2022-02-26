package javacore.task_1_2;

public class Main {

    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener listener1 = System.out::println;
        var worker = new Worker(listener, listener1);
        worker.start();
    }
}

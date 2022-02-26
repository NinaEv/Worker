package javacore.task_1_2;

public class Worker {
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    private OnTaskDoneListener callback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 32) {
                callback.onDone("Ошибка");
            } else {
                callback.onDone("Task " + (i + 1) + " is done");
            }
        }
    }
}

package worker;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener callback = System.out::println;
        OnTaskErrorListener errorCallBack = System.out::println;

        Worker worker = new Worker(callback, errorCallBack);
        worker.start();
    }
}

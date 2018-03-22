import java.lang.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by panyi on 2018/2/8.
 */
public class MyTask implements Runnable {
    private int taskId;
    private String taskName;

    public MyTask(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println("当前线程Id-->" + taskId + ",任务名称-->" + taskName);
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(1,2,60, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(3));
        MyTask task1 = new MyTask(1, "任务1");
        MyTask task2 = new MyTask(2, "任务2");
        MyTask task3 = new MyTask(3, "任务3");
        MyTask task4 = new MyTask(4, "任务4");
        MyTask task5 = new MyTask(5, "任务5");

       pool.execute(task1);
        pool.execute(task2);
        pool.execute(task3);
        pool.execute(task4);
        pool.execute(task5);

    }
}

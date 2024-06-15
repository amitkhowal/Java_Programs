package Practice;

public class Threads extends Thread{
    @Override
    public void run()
    {
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        Threads th =new Threads();
        th.run();
    }

}

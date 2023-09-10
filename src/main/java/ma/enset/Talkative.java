package ma.enset;

public class Talkative implements Runnable{
    public static int param;
    public Talkative(int param) {
        Talkative.param = param;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new Talkative(i));
            thread.setName("thread"+i);
            thread.start();
        }

    }

    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(Thread.currentThread().getName()+" - i: "+i+" ["+param+"]");
        }
    }
}

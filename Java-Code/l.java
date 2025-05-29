class ThreadDemo {
    public static void main(String[] args) {
        myRunnable m = new myRunnable();
        Thread t = new Thread(m);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
class myRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child Thread");
        }
    }
}
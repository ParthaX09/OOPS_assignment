public class MainA {
    public static void main(String[] args) {
        // Thread to print numbers from 1 to 10
        Thread thread1 = new Thread(() -> {
            
                try 
                {
                    for (int i = 1; i <= 10; i++) 
                    {
                        System.out.println("Thread 1: " + i);
                    }
                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }
            });

        // Thread to print numbers from 10 to 1
        Thread thread2 = new Thread(() -> {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Thread 2: " + i);

                // If the value is 6, sleep for 10000 milliseconds (10 seconds)
                if (i == 6) {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

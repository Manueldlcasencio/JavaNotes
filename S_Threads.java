//Thread allows simultaneous execution

class A extends Thread{
    public void run(){
        for(int i = 1; i < 100; i++){
            System.out.println("Show A");
            try { //This will make the thread wait 10 miliseconds each time
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 1; i < 100; i++){
            System.out.println("Show B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C implements Runnable{ //This is a different way of making a thread
    public synchronized void run(){ //Synchro means it can only be called by one thread each time
        System.out.println("RUN!");
    }
}

public class S_Threads {
    public static void main (String a[]){
        A obj1 = new A();
        B obj2 = new B();

        //By default a thread has a priority of 5. 10 is higher priority, 1 is the lowest

        obj2.setPriority(10);

        obj1.start(); //Start inits the threads and execute "run" method
        obj2.start();

        //Runnable has no start
        Runnable obj3 = new C();

        Thread t1 = new Thread(obj3);
        t1.start();

        //Join tells main to wait until the threads finish their job
        try {t1.join();} catch (InterruptedException e) {e.printStackTrace();}
    }
}

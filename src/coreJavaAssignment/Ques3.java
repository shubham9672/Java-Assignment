package coreJavaAssignment;
//Create a thread named  fetch Data using thread  extend methodFetch data should  implement sleep method  with 5000ms timeCreate a thread named  processData  using  runnable  interfaceMake sure processData  starts its execution only after fetchData thread has  completed its execution with the timeout of 10000ms
class FetchData extends Thread{
    public void run(){
        for(int i=1; i<=2; i++){
            try {
                Thread.sleep(5000);
                System.out.println("FetchData thread is running......" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ProcessData implements Runnable{
    public void run(){
        for(int i=1; i<=2; i++){
            try {
                Thread.sleep(1000);
                System.out.println("ProcessData thread is running...... "+ Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
public class Ques3 {
    public static void main(String[] args) throws InterruptedException{
        FetchData fd = new FetchData();
        Thread t1 = new Thread(new ProcessData(), "Thread-1");

        fd.start();
        fd.join();
        t1.start();
        t1.join();
    }
}

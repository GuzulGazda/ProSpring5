package kiv.spring.aop.around;


public class WorkerBean {
    public void doSomeWork(int numOfTimes){
        for (int i = 0; i < numOfTimes; i++) {
            wokr(i);
        }
    }

    private void wokr(int counter) {
        System.out.println("Doing wokr: " + counter);
    }
}

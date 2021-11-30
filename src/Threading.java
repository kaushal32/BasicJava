public class Threading {
    public static void main(String[] args) {
        Thread obj = Thread.currentThread();
        System.out.println(obj.getName());
        obj.setName("Anuruddh");
        obj.setPriority(Thread.MIN_PRIORITY);
        System.out.println(obj.getId());
        System.out.println(obj.isAlive());
        System.out.println(obj.getPriority());
        System.out.println(obj.isDaemon());
    }
}
// how to create multithreaded application
// two ways to create
// by extending the thread class
// by implementing the runnable interface
// it is known as functional interface
//one method
// run() method
// lambda expression
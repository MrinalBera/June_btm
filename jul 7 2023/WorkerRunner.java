public class WorkerRunner {
    public static void main(String[] args){
        System.out.println("Running main method in WorkerRunner....");
        System.out.println("instance 1 for Worker");
        Worker ref1=new Worker("Ramalingesh",5,24,"Software Engineer","P201M");
        ref1.print();
        System.out.println("instance 2 for Worker");
        Worker ref2=new Worker("Shama",2.5,26,"Buisness Analyst","G270F");
        ref2.print();
        System.out.println("instance 3 for Worker");
        Worker ref3=new Worker("Bharath",10,25,"Manager","S220M");
        ref3.print();
    }
}

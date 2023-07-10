public class OilRunner {
    public static void main(String[] args){
        System.out.println("Running main method in OilRunner....");
        System.out.println("instance 1 for Oil");
        Oil ref1=new Oil("Indian Oil",753,101,"Mr Vinay","Bike");
        ref1.print();
        System.out.println("instance 2 for Oil");
        Oil ref2=new Oil("Shell",745,103,"Mr Srujan B G","Scooter");
        ref2.print();
        System.out.println("instance 3 for Oil");
        Oil ref3=new Oil("Total",750,106,"John Wick","Car");
        ref3.print();
    }
}

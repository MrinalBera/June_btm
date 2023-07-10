public class OwnerRunner {
    public static void main(String[] args){
        System.out.println("Running main method in OwnerRunner....");
        System.out.println("instance 1 for Owner");
        Owner ref1=new Owner("Meghan",25,45,"M","Meghan's Cafe");
        ref1.print();
        System.out.println("instance 2 for Owner");
        Owner ref2=new Owner("Mrinal",30,50,"M","Pawn Shop");
        ref2.print();
        System.out.println("instance 3 for Owner");
        Owner ref3=new Owner("Mukesh",29,55,"M","Whole Sale");
        ref3.print();
    }
}

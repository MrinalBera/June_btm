class Owner {
    String name ;
	int age ;
	String gender ;
    double netWorth ;
    String shopName ;
   
    Owner(String name,int age,double netWorth,String gender,String shopName){
        System.out.println("Running Constructor with all args....");
        this.name=name;
        this.netWorth=netWorth;
        this.age=age;
        this.shopName=shopName;
        this.gender=gender;
    }
    void print(){
        System.out.println("Running non-static method...");
        System.out.println("Name: "+name+"\n" +
                "netWorth: "+netWorth+" m\n" +
                "age: "+age+" years\n" +
                "shopName: "+shopName+"\n" +
                "gender: "+gender+"\n");
        System.out.println("\n");
    }
}
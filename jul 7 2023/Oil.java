class Oil {
    String name ;
    double density ;
    int cost ;
    String companyOwner ;
    String applicableFor ;

    Oil(String name,double density,int cost,String companyOwner,String applicableFor){
        System.out.println("Running Constructor with all args....");
        this.name=name;
        this.density=density;
        this.cost=cost;
        this.companyOwner=companyOwner;
        this.applicableFor=applicableFor;
    }
    void print(){
        System.out.println("Running non-static method...");
        System.out.println("Name: "+name+"\n" +
                "density: "+density+" kg/m\n" +
                "cost: "+cost+"liter\n" +
                "companyOwner: "+companyOwner+"\n" +
                "applicableFor: "+applicableFor+"\n");
        System.out.println("\n");
    }
}
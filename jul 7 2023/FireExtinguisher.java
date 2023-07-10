class FireExtinguisher {
    String type ;
    double capacity ;
    int pressure ;
    String certification ;
    double weight ;

    FireExtinguisher(String type,double capacity,int pressure,String certification,String weight){
        System.out.println("Running Constructor with all args....");
        this.type=type;
        this.capacity=capacity;
        this.pressure=pressure;
        this.certification=certification;
		this.weight=weight;
    }
    void print(){
        System.out.println("Running non-static method...");
        System.out.println("Type: "+type+"\n" +
                "Capacity: "+capacity+" liters\n" +
                "Pressure: "+pressure+" psi\n" +
                "Certification: "+certification+"\n" +
                "weight: "+weight+"kg\n");
        System.out.println("\n");
    }
}
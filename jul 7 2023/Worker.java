class Worker {
    String name ;
    double salary ;
    int age ;
    String occupation ;
    String ssn ;

    Worker(String name,double salary,int age,String occupation,String ssn){
        System.out.println("Running Constructor with all args....");
        this.name=name;
        this.salary=salary;
        this.age=age;
        this.occupation=occupation;
        this.ssn=ssn;
    }
    void print(){
        System.out.println("Running non-static method...");
        System.out.println("Name: "+name+"\n" +
                "Salary: "+salary+" LPA\n" +
                "Age: "+age+"\n" +
                "occupation: "+occupation+"\n" +
                "SSN: "+ssn+"CRM2001\n");
        System.out.println("\n");
    }
}

class Emp{
    String name,address,salary;
    int yoj;
    Emp(String name,int yoj,String salary,String address){
        this.name=name;
        this.yoj=yoj;
        this.salary=salary;
        this.address=address;
    }
}
    public class Employee {
    
    public static void main(String[] args) {
       Emp e1=new Emp("Robert",1994,"64C","WallStreet");
       Emp e2=new Emp("Sam",2000, "68D","WallSteet");
       Emp e3=new Emp("John",1999,"26B","Wllstreet");
       System.out.println(e1.name +" "+e1.yoj+" "+e1.address);
       System.out.println(e2.name +" "+e2.yoj+" "+e2.address);
       System.out.println(e3.name +" "+e3.yoj+" "+e3.address);


    }
    
}

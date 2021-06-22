public class employee {

    int empID;
    String empName;
employee(int ID,String name ){
this.empID  = ID;
this.empName = name;
}
void info(){
    System.out.println("id : "  +  empID + "  name: " + empName );
}

public static void main(String[] args){
    employee obj1  = new employee(123," arun");
    employee obj2 = new employee(34, "hari");
obj1.info();
obj2.info();
}
}
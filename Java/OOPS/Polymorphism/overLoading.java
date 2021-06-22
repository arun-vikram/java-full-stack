
  
class overLoading{ 
    int id;  
    String name;  
    int age;  
     
    Students(int i,String n){  
    id = i;  
    name = n;  
    }  
     
    Students(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Student5 s1 = new Students(11,"arun");  
    Student5 s2 = new Students(222,"diya",3);  
    s1.display();  
    s2.display();  
   }  
}  
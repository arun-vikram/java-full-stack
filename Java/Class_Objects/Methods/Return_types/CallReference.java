import java.lang.ref.Reference;

class CallReference{  
 int data=50;  
  
 void change(CallReference op){  
 op.data=op.data+100;//changes will be in the instance variable  
 }  
     
    
 public static void main(String args[]){  
   CallReference op=new CallReference();  
  
   System.out.println("before change "+op.data);  
   op.change(op);//passing object  
   System.out.println("after change "+op.data);  
  
 }  
}  
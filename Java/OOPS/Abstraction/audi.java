 abstract class car{
   abstract void run();
 }

 class audi extends car{
 void run(){System.out.println("running safely..");}

 public static void main(String args[]){
  car obj = new audi();
  obj.run();
 }
 }
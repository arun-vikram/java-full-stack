 public class polymor{


     public int  add(int i,int j){
         int sum = i + j;
        return sum;
    }

    public float  add(float f1,float f2){
        float fsum = f1 + f2;
       return fsum;
   }

   public double  add(double d1,double d2){
    double dsum = d1 + d2;
   return dsum;
}
   
    

    public static void main(String[]args) 
    {
        polymor obj1 = new polymor();
       
        
System.out.println(obj1.add(2,5));
System.out.println(obj1.add(4f,6f));
System.out.println(obj1.add(154.94,99.86));
    }
}
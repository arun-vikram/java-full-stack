public class encap
{

    private int studentid=3;
    

    public void setsid(int sid)
    {
        
       this.studentid=sid;
        
       
    }
    public int getsid()
    {
        return this.studentid;
    }
      public static void main(String [] args)
    {
   
   encap m=new encap();
   m.setsid(10);
   int s1id=m.getsid();
   System.out.println("sid ="+s1id);
   m.setsname("Simson ");
   String s1name=m.getsname();
   System.out.println("student name "+s1name);

   encap m2=new encap();
   m2.setsid(11);
   int s2id=m2.getsid();
   System.out.println("sid =" +s2id);
   m2.setsname("david");
   String s2name=m2.getsname();
   System.out.println("student name " +s2name);
  
   

}
}

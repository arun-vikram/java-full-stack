class justice
{   
    void hero()
   {
    System.out.println("Thor");
    }
}
class ironman extends justice
{
    void hero()

 {
    System.out.println("avengers");
  
 }
}
public class overriding {
   public static void main(String[]args)
   {
      ironman j=new ironman();
      j.hero();
   
   }
   
}

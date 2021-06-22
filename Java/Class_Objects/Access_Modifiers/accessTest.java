public class Test{
    int a; // default access
    public int b;//public access

    public static void main(String args[])
    {
        accessTest ob = new accessTest();

        ob.a = 10;
        ob.b = 20;

        system.out.println("the values of a and b is "  + ob.a + "" + ob.b); 
    }
   

}
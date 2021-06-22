public class Test{
    int a; // default access
    public int b;//public access
    private int c;

    void setc(int i){
        c = i;
 }

 int getc(){
     return c;
 }
}
public class privateTest{
    public static void main(String args[])
    {
        Test ob = new Test();

        ob.a = 10;
        ob.b = 20;
        ob.setc(50);

        system.out.println("the values of a and b is "  + ob.a + "" + ob.b); 
    }
   

}